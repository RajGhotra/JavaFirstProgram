package banking2;
/*Abstract classes.
Make Bank Operations class abstract and  add a abstract method changePinPassword.
Overide the changePinPassword method in ATM class  which will allow user to 
update the pin. Before setting the new pin check it is not same as old pin 
and is not less than 4 characters
Override changePinPassword method in OnlineBanking Class. While changing the
 password ensure following conditions.Password is not same as old password
One should not be allowed to set password if it is less than 8 characters 
and have these special characters (&,$, @)*/


public abstract class BankOperations {
	
	public  abstract void changePinPassword(String oldPinPassword) ;
	//public abstract void ChangePassword();

}
