package banking;

public class ATM extends BankOperations {
	private String pinNumber;

	public ATM(double initialAmount, String pinNumber) {
		super(initialAmount);
		this.pinNumber = pinNumber;
	}

}
