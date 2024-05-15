package banking3;

public class ATM extends BankingRules {

	public ATM(double balance,  int maxNoOfTransactionAllowed, double dailyWithdrawLimit,
			String pinNumber, String password) {
		super(balance,maxNoOfTransactionAllowed, dailyWithdrawLimit, pinNumber, password);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void dailyWithdrawlLimit(double withdrawlLimit) {
		

		if (amount <= withdrawlLimit) {

			System.out.println("You are withdrawing " + amount);
		} else {
			System.out.println("You cannot withdraw more money today");
		}

	}

	@Override
	public void noOfTransactionAllowed(double transactionAllowed) {

	}

	@Override
	public void toWithdrawMoney(double amount, String pinNumber) {
		if (balance >= amount) {
			System.out.println("yor are withdrawing " + amount);
			balance = balance - amount;
			System.out.println(" Balance is " + balance);
		} else {
			System.out.println("Insufficient balance");

		}

	}

	@Override
	public void toDepositMoney(double amount, String pinNumber) {
		if (validatePin(pinNumber)) {
			balance = balance + amount;
			System.out.println("The total amount in account is :" + balance);
		} else {
			System.out.println("pin is incorrect");
		}
	}

	@Override
	public double toViewBalance() {
		return balance;

	}

	public boolean validatePin(String pinEntered) {
		if (this.pinNumber.equals(pinEntered)) {
			return true;
		}
		return false;
	}

}
