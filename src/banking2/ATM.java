package banking2;

import java.util.Scanner;

public class ATM extends BankOperations {
	protected String newPin;
	protected String pin;

	Scanner sc = new Scanner(System.in);

	@Override
	public void changePinPassword(String oldPin) {
		System.out.println("Enter The new pin ");
		String newPin = sc.next();

		if (oldPin.equals(newPin)) {

			System.out.println("Invalid Pin ");
			return;
		}
		if (newPin.length() < 4 || newPin.length() > 4) {
			System.out.println("pin should be of 4 charcaters ");
			return;

		}

		else {
			System.out.println("After updating pin is:" + newPin);

		}

	}
}
