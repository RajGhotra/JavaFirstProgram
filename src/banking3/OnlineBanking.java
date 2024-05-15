package banking3;

public class OnlineBanking extends BankingRules  {
	public OnlineBanking(double balance, int maxNoOfTransactionAllowed, double dailyWithdrawLimit,
			String pinNumber, String password) {
		super(balance, maxNoOfTransactionAllowed, dailyWithdrawLimit, pinNumber, password);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void dailyWithdrawlLimit(double withdrwalLimit) {
	}

	@Override
	public void noOfTransactionAllowed(double noOftransaction) {
		if (noOftransaction <= maxNoOfTransactionAllowed) {
			
		}
		

	}

	@Override
	public void toWithdrawMoney(double amount,String password) {
		if(this.password.equals(password)) {
		if (balance >= amount) {
			System.out.println("yor are withdrawing " + amount);
			balance = balance - amount;
			System.out.println(" Balance is " + balance);
		} else {
			System.out.println("Insufficient balance");

		}
		}else {
			System.out.println("Password incorrect");
		}
	}

	@Override
	public void toDepositMoney(double amount,String Password) {
		if(this.password.equals(Password)) {
		balance = balance + amount;
		System.out.println("The total amount in account is :" + balance);
		}else {
			System.out.println("password imcorrect");
		}
	}

	@Override
	public double toViewBalance() {
		return balance;
		
	}

	
}