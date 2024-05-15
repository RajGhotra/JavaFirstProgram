package banking3;

public abstract class BankingRules implements BankOperations{
	protected double balance ;
	protected double amount;
	protected int maxNoOfTransactionAllowed;
	protected double dailyWithdrawLimit;
	protected String pinNumber;
	protected String password;
	
	

	public BankingRules(double balance, int maxNoOfTransactionAllowed, double dailyWithdrawLimit,
			String pinNumber, String password) {
		super();
		this.balance = balance;
		//this.amount = amount;
		this.maxNoOfTransactionAllowed = maxNoOfTransactionAllowed;
		this.dailyWithdrawLimit = dailyWithdrawLimit;
		this.pinNumber = pinNumber;
		this.password = password;
	}
	

	public abstract void dailyWithdrawlLimit(double withdrwalLimit);

	public abstract void noOfTransactionAllowed(double transactionAllowed);
	

}
