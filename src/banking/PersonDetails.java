package banking;

public class PersonDetails {
	private String accountNumber;
	private String  accountHolderName;
	private  String pinNumber;
	private String password;
	private double totalFundsAvailable;
	
	public PersonDetails(String accountNumber, String accountHolderName, String pinNumber, String password,
			double totalFundsAvailable) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.pinNumber = pinNumber;
		this.password = password;
		this.totalFundsAvailable = totalFundsAvailable;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getPinNumber() {
		return pinNumber;
	}

	public String getPassword() {
		return password;
	}

	public double getTotalFundsAvailable() {
		return totalFundsAvailable;
	}
	


}
