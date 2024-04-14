package amusementPark;

import java.util.Scanner;

/*In Amusement park, a ride can carry max 10 people. Write a code to help the
 *  operator from overfilling the ride i.e  more than 10 people should not be 
 *  allowed to get on the ride.  Also ensure that the people getting on the ride 
 *  meets the height criteria , Height of person should be greater than 90 cm 
 *   but less than 200 cm.
 */

public class AmusementPark {

	int height;
	int currentSpace;
	Scanner sc = new Scanner(System.in);

	public void isRideAvailable() {

		currentSpace = 0;

		for (int noOfPerson = 1; noOfPerson <= 10; noOfPerson++) {

			System.out.println("Enter the height of person" + noOfPerson);
			int height = sc.nextInt();

			if (height > 90 && height < 200) {

				System.out.println("person is allowed to take ride and have space");
				currentSpace++;

			} else {

				System.out.println(" person doesnot meet the  height requirement");
				noOfPerson--;

			}
		}

		if (currentSpace == 10) {

			System.out.println(" Ride is Full");
		}
	}

}
