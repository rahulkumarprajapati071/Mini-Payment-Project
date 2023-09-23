package in.glootech.payment;

public class CreditcardPaymentImple implements PaymentMethod{

	@Override
	public String pay(double amount) {
		//Logic for UpiPayment...
		String succes = "Payment Successfull through Credit Card..!!";
		return succes;
	}

}
