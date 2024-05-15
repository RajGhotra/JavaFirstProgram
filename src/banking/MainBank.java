package banking;

import java.util.Scanner;

import javax.management.OperationsException;

public class MainBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonDetails person = new PersonDetails("987654321", "Raj kaur", "1234", "Details", 25000);
		System.out.println(" Enter the operation you want to perform");
		System.out.println("1.ATM");
		System.out.println("2.OnlineBanking");
		int select = sc.nextInt();
		BankOperations operations =null;
		if (select == 1) {
			operations = new ATM(person.getTotalFundsAvailable(),person.getPassword());

		} else if (select == 2) {
			operations = new OnlineBanking(person.getTotalFundsAvailable(),person.getPassword());
		} else {
			System.out.println("Invalid operation");
			return;
		}
		System.out.println("Please enter the Pin or password");
	
		String selected = sc.next();
		
		if (select==1 ) {
			String pinNumber=selected;
			if (!pinNumber.equals( person.getPinNumber()));
			System.out.println("Incorrect pinNumber");
			return;

		} else {
			
			String password = selected;
			if (!password.equals( person.getPassword())) {
				System.out.println("Incorrect password");
				return;
			}

		}
		System.out.println("Please choose:");
		System.out.println("1.Withdrawl");
		System.out.println("2.Deposit");
		int choose = sc.nextInt();
		switch (choose) {
		case 1:

			System.out.println("Enter the amount you want to withdrwal");
			double amountWD = sc.nextDouble();
			operations.toWithdrwalMoney(amountWD);
			break;
		case 2:
			System.out.println("Enter the amount you want to deposit");
			double amountDeposit = sc.nextDouble();
			operations.toDepositMoney(amountDeposit);
			break;
		
			default:
				System.out.println("Invalid operations");
		}
	}
}

