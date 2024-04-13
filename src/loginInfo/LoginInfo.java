package loginInfo;

import java.util.Scanner;

public class LoginInfo {

	String userId;
	String password;
	int maxAttempts = 3;
	int nofWrongAttempts;
	Scanner sc = new Scanner(System.in);

	public void toCheckInfoDetail() {

		for (int i = 1; i <= maxAttempts; i++) {
			System.out.println("Enter The userId");
			String userId = sc.next();
			System.out.println("Enter the Password");

			String password = sc.next();

			if (userId .equals("pivotAdmin") && password.equals("Admin123")){

				System.out.println("You are logged into the application");
				break;

			} else {
				System.out.println("Incorrect UserId or Password.Try Again");
				nofWrongAttempts++;
				
			}
		}

			if (nofWrongAttempts >= maxAttempts) {

				System.out.println("Account Locked");
				
			}

		}
	}

