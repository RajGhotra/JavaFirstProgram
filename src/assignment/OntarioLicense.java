/*Q1. Ontario license authority checks for two things to issue a license, first is the age 
of person and the current level (G1 or G2 or G) . Assume different values for these two 
values and write code which will print, whether license will be used to the person or not 
and if the license is issued, which type of license the person will get i.e. whether he 
will get a G1 or G2 or G.*/

package assignment;

public class OntarioLicense {

	int age;
	String currentLevel;

	void isEligibleForLicense() {

		if (age > 16) {
			System.out.println("Person is eligible  for License");
			if (currentLevel == "") {
				System.out.println("Person is eligible for G1");
			} else if (currentLevel == "G1") {
				System.out.println("Person is eligible for G2");

			} else if (currentLevel == "G2") {
				System.out.println("Person is eligible for G");
			}
		} else {
			System.out.println("Person is not eligible for License ");
		}
	}

}
