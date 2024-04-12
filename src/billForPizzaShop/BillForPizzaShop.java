package billForPizzaShop;
/*Write a program to prepare the bill for a pizza shop.
Assume an order and work out the final bill.
Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium 
or Large Pizza: +$3 Extra cheese for any size pizza: + $1
For eg: If the Pizza is medium, pepperoni with extra cheese the program should calculate 
the final bill as 20+3+1 = $24 and print Your final bill is $24”*/

import java.util.Scanner;

public class BillForPizzaShop {

	int totalBill;
	int priceOfSmallPizza = 15;
	int priceOfMediumPizza = 20;
	int priceOfLargePizza = 25;
	int pepproniForSmallPizza = 2;
	int pepproniForMediumPizza = 3;
	int pepperoniForLargePizza = 3;
	int extraCheese = 1;

	Scanner sc = new Scanner(System.in);

	public void toCalculateBill() {

		System.out.println("Please choose the size of Pizza:");
		System.out.println("1.small");
		System.out.println("2.Medium");
		System.out.println("3.Large");
		int selectedSize = sc.nextInt();

		System.out.println(" Do You want topping");
		System.out.println("1.Yes");
		System.out.println("2.No");
		int extraTopping = sc.nextInt();
		System.out.println(" Do You want extra cheese");
		System.out.println("1.Yes");
		System.out.println("2.No");
		int cheese = sc.nextInt();

		switch (selectedSize) {

		case 1:
			totalBill = totalBill + priceOfSmallPizza;
			if (extraTopping == 1) {

				totalBill = totalBill + pepproniForSmallPizza;

			} else {

				priceOfSmallPizza = totalBill - pepproniForSmallPizza;
			}

			if (cheese == 1) {
				totalBill = totalBill + extraCheese;

			} else {

				priceOfSmallPizza = totalBill - extraCheese;

			}
			System.out.println("The bill for small Pizza is:" + totalBill);

			break;

		case 2:

			totalBill = totalBill + priceOfMediumPizza;
			if (extraTopping == 1) {
				
                totalBill = totalBill+ pepproniForMediumPizza;
			}else {
				
				priceOfMediumPizza=totalBill-pepproniForMediumPizza;
			}

				if (cheese == 1) {
					
					totalBill = totalBill+ extraCheese;
				}else {
					
					priceOfMediumPizza=totalBill-extraCheese;
				}
				

					System.out.println("The bill for small Pizza is:" + totalBill);
                   break;
			
			case 3:
			totalBill = totalBill+ priceOfLargePizza  ;
			if(extraTopping==1) {
				
				totalBill=totalBill+pepperoniForLargePizza;
			}
			else {
				priceOfLargePizza=totalBill-pepperoniForLargePizza;
			}
           if(cheese==1) {
        	   totalBill=totalBill+extraCheese;
	
           }
           else {
        	   
        	   priceOfLargePizza=totalBill-extraCheese;
}
			System.out.println("The bill for medium pizza is:" + totalBill);

			break;
	

		default:

			System.out.println("Please enter the right size of pizza");

		}

}}
