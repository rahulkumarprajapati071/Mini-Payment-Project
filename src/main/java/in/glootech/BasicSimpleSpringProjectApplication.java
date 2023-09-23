package in.glootech;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.glootech.collector.BillCollector;
import in.glootech.payment.CreditcardPaymentImple;
import in.glootech.payment.DebitcardPaymentImple;
import in.glootech.payment.UpiPaymentImple;

@SpringBootApplication
public class BasicSimpleSpringProjectApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BasicSimpleSpringProjectApplication.class, args);
		BillCollector bean = run.getBean(BillCollector.class);
		
		//Taking Payment Amount from User...
		Scanner scanner = new Scanner(System.in);
		System.out.print("You are Paying: ");
		Double amount = scanner.nextDouble();
		while(amount <= 0){
			System.out.print("Please Enter Amount: ");
			amount = scanner.nextDouble();
		}
		System.out.print("Pay from: \n"
				+ "1. UPI\n"
				+ "2. DebitCard\n"
				+ "3. CreditCard\n");
		int methodChoice = scanner.nextInt();
		switch (methodChoice) {
		case 1: {
			bean.setPaymentWay(new UpiPaymentImple());
			break;
		}
		case 2: {
			bean.setPaymentWay(new DebitcardPaymentImple());
			break;
		}
		case 3: {
			bean.setPaymentWay(new CreditcardPaymentImple());
			break;
		}
		default:
			System.err.println("Invalid Method Selected Please Select Valid Payment Method.");
		}
		bean.collectPayment(amount);
		scanner.close();
	}

}
