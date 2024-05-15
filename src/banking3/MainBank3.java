package banking3;

import java.util.Scanner;

public class MainBank3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Operation you want to perform");
		System.out.println("1.ATM");
		System.out.println("2.OnlineBanking");
		int operation = sc.nextInt();
		switch (operation) {
		case 1:
			BankOperations atm = new ATM(25000, 3, 700, "1234", "Only123$");

			if (operation == 1) {
				System.out.println("Please Enter 1.Withdral Money and 2.DepositMoney");
				int operationEntered = sc.nextInt();
				if (operationEntered == 1) {
					atm.toWithdrawMoney(500, "1234");
					atm.toViewBalance();
					return;
				} else if (operationEntered == 2) {
					atm.toDepositMoney(5000, "1234");
					atm.toViewBalance();
					return;
				} else {
					System.out.println("Invalid operation");
					return;
				}

			}
		case 2:
			BankOperations online = new OnlineBanking(25000, 3, 5000, "1234", "Only123$");
			System.out.println("Please Choose 1.Withdral Money and 2.DepositMoney");
			int choose = sc.nextInt();
			if (choose == 1) {
				online.toWithdrawMoney(5000, "Only123$");
				online.toViewBalance();
				return;

			} else if (choose == 2) {
				online.toDepositMoney(5000, "Only123$");
				online.toViewBalance();
				return;
			} else {
				System.out.println("Invalid Operation");
				return;
			}
		default:
			System.out.println("Inavlid  function");
		}

	}
}
