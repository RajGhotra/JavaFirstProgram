package conditionalOperator;

public class CheckAge {
	
	int age=19;
	boolean  result=false;
	
	public void isValidAge() {
		
		result=age>=18;
		System.out.println(" Is Person allowed to go inside Party :" +result);
	}
	
	
	
}


