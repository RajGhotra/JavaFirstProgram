package banquetHall;

import java.util.Scanner;

public class MainBanquet {
	public static void main(String[] args) {
		
	 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Booking base cost");
		double costOfBooking = sc.nextDouble();
		System.out.println("Enter the Food Cost");
		double costOfFood = sc.nextDouble();
		System.out.println("Enter the beverages Cost");
		double beveragesCost = sc.nextDouble();
		System.out.println("Enter the tax applied on food");
		double taxOnFood = sc.nextDouble();
		System.out.println("Enter the tax applied on beverages");
		double taxOnBeverage = sc.nextDouble();
		System.out.println("Please enter the tip if you want");
		double tip1 = sc.nextDouble();
		System.out.println("Enter the number of guests");
		int numguests = sc.nextInt();
        if(costOfBooking>0&&costOfFood>0&&beveragesCost>0) {
	
	
	Banquet hall=new Banquet(costOfBooking, costOfFood, beveragesCost, tip1, taxOnFood, taxOnBeverage);
    double totalBookingBaseCost=hall.calculateBaseCost(costOfBooking, costOfFood, beveragesCost);
    System.out.println("The cost of hall including booking cost, cost of food and beverages is "+totalBookingBaseCost);
    double  taxApplied=hall.calculateTax(totalBookingBaseCost);
    System.out.println("The tax applied on base cost is" +taxApplied);
    double  cessTax=hall.calculateCess(numguests, totalBookingBaseCost);
    System.out.println("The cess Tax  on"+numguests+" guests is"+cessTax);
    double totalCost=hall.calculateTheTotalCost(totalBookingBaseCost, taxApplied, cessTax);
    System.out.println("The total cost of the Banquet hall is"+totalCost);
	}else {
	 System.out.println("Pleasefill the right amount");
	}
}
}