package banking;
/*Assignment Part 1 :

1.	Create a Bank Operations class which has two methods withdraw, deposit, view Balance.
2.	Create 2 Classes ATM and Online Banking, both of these classes extend Bank Operations
3.	Create a class which takes care of Persons account details.
Person class should have details such as bank account no., name of account holder, total funds available, pin and onlineBankingPassword.

4.	Create a Main class which takes input from user and perform required operation on the type of banking service the user want, ATM and Online Banking.

User should be allowed to perform only single operation (deposit cash,withdraw cash etc) 
For every transaction, user must have to enter pin or banking password and that pin must be validated before allowing the transaction. 

Action that user intends to do (Like deposit cash or withdraw) must be asked after validating the pin. Initial user deposit can be kept as constant value.


User should be given Information after every transaction on the amount of balance left in account.
NOTE :
•	Use private access modifier
•	Use parent class reference variable*/

import java.util.Scanner;

public class BankOperations {

	private double balance;

	public BankOperations(double initialAmount) {
		this.balance = initialAmount;
	}

	public void toWithdrwalMoney(double amount) {
		{

			if (balance >= amount) {
				System.out.println("yor are withdrawing " + amount);
				balance = balance - amount;
				System.out.println("The Balance is " + balance);
			} else {
				System.out.println("Insufficient balance");

			}

		}
	}

	public void toDepositMoney(double amount) {

		balance = balance + amount;
		System.out.println("The total amount in account is :" + balance);
	}

	public double toViewBalance() {

		return balance;
	}

}
