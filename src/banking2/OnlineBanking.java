package banking2;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {
	Scanner sc = new Scanner(System.in);

	@Override
	public void changePinPassword(String oldPassword) {
		System.out.println("Enter the new Password");
		String newPassword=sc.next();
		
		
	if(oldPassword.equals(newPassword)) {
			System.out.println("Inavalid Password ");
			return;
		}
	if(newPassword.length()<8||newPassword.length()>8) {
		System.out.println(" Password should be of 8 characters");
		return;
		
	}
	if(!(newPassword.contains("@")||(newPassword.contains("$")||(newPassword.contains("&"))))) {
		System.out.println("Password should contain these(@,$,&) special character");
	}
		
		else {
			
			System.out.println("After updating Password :"+newPassword);
		}
		
		
	}

}
