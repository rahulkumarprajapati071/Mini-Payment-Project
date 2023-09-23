package in.glootech.collector;

import org.springframework.stereotype.Component;

import in.glootech.payment.PaymentMethod;

@Component
public class BillCollector {
	
	private PaymentMethod paymentMethod;
	
	public void collectPayment(Double amount) {
		if(paymentMethod != null) {
			String payResponse = paymentMethod.pay(amount);
			System.out.println(payResponse);
		}
	}
	
	public void setPaymentWay(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
}
