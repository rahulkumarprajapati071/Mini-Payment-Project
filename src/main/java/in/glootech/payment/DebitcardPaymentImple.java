package in.glootech.payment;

public class DebitcardPaymentImple implements PaymentMethod{

	@Override
	public String pay(double amount) {
		//Logic for UpiPayment...
		String succes = "Payment Successfull through Debit Card..!!";
		return succes;
	}

}
