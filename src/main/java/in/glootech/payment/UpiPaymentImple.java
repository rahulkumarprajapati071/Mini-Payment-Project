package in.glootech.payment;

public class UpiPaymentImple implements PaymentMethod{

	@Override
	public String pay(double amount) {
		//Logic for UpiPayment...
		String succes = "Payment Successfull through UPI..!!";
		return succes;
	}

}
