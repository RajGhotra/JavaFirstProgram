package banking3;
/*Change BankOperations class to interface and make all the methods in it 
 * abstract.Create an abstract class BankingRules which will be extended by 
 * ATM and Online Banking with methods on daily withdrawal limit allowed,
 *  no. of transaction allowed.Once user enters the application, it should 
 *  request user for which type of service they would like to perform 
 *  (ATM or Online Banking)User should be allowed to perform unlimited 
 *  transaction and UI should respond to user input in appropriate way. 
 *  Like if user has insufficient funds and user is trying to withdraw amount,
 *  application should tell user that funds are low, please deposit and all 
 *  similar scenario. Action that user intends to do (Like deposit cash or
 *  withdraw) must be asked after validating the pin. Initial user deposit
 *  should get updated after every transaction and each transaction must be
 *   performed on last updated balance.User should be given Information after
 *    every transaction on the amount of balance left in account.If user 
 *    enters the pin for atm wrong 3 times, application should immediately 
 *    terminate with a message showing that account is locked.
Similarly, if a user input internet banking password incorrectly 3 times, 
application should immediately terminate with a message showing that account 
is locked.In both of these scenario, counter to keep a track of the 
unsuccessful attempt should get reset if user enter correct pin or password 
on 2nd or 3rd attempt.User should have ability to continue or exit the application.*/

public interface BankOperations {
	
	public void toWithdrawMoney(double amount,String pinNumber);
	public void toDepositMoney(double amount,String pinNumber);
	public double toViewBalance();
}
