package waterTankCapacity;
/*) There is a water tank of capacity 100 litres. Water is filled into it 
 * using bucket which have capacity of 10 litres.  Write a program which 
 * fills the tank to its capacity using these buckets. Also include a 
 * mechanism in your program to stop the tank from over flowing.
 */

public class WaterTankCapacity {

	int capacityOfWaterTank;
	int capacityOfBucket;
	int waterFilledInTank;

	public void toFilledTheWaterTank() {

		for (int noOfBucket = 1; noOfBucket <= capacityOfBucket; noOfBucket++) {

			System.out.println("Add bucket" + noOfBucket);

			if (waterFilledInTank < capacityOfWaterTank) {
				waterFilledInTank = noOfBucket * capacityOfBucket;
				System.out.println("The level of water in waterTank is " + waterFilledInTank);

				if (waterFilledInTank == capacityOfWaterTank) {

					System.out.println("water is  overflowing.Please don't put more water");
					break;

				}

			}

		}
	}
}