package banking2;

import java.util.Scanner;

public class MainBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Following");
		System.out.println("1.toChangePin");
		System.out.println("2.toChangePassword");
		int operation = sc.nextInt();
		switch (operation) {
		case 1:

			ATM atm = new ATM();
			atm.changePinPassword("1234");
			break;

		case 2:
			OnlineBanking online = new OnlineBanking();
			online.changePinPassword("Only123&");
			break;
		default:
			System.out.println("Invalid Operation");
		}
	}
}
