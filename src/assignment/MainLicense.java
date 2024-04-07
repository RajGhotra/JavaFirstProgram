package assignment;

public class MainLicense {

	public static void main(String[] args) {

		OntarioLicense license = new OntarioLicense();
		license.age = 20;
		license.currentLevel = "G2";
		license.isEligibleForLicense();

	}

}
