package banquetHall;

public class Banquet {
	
	double totalBookingBaseCost;
	double bookingBaseCost;
	double foodCost;
	double beverageCost;
	double taxOnFood;
	double taxOnBeverages;
	double tip;
     int  noOfGuests;
     double cessTax;
     double totalCost;
     double taxApplied;

	public Banquet(double bookingBaseCost, double foodCost, double beverageCost, double tip, double taxOnFood,
			double taxOnBeverages) {
		super();
		this.bookingBaseCost = bookingBaseCost;
		this.foodCost = foodCost;
		this.beverageCost = beverageCost;
		this.tip = tip;
		this.taxOnBeverages = taxOnBeverages;
		this.taxOnFood = taxOnFood;
	}

	public double calculateBaseCost(double bookingBaseCost ,double foodCost, double beverageCost, double tip) {

	
		return totalBookingBaseCost =  bookingBaseCost+foodCost + beverageCost + tip;

	}

	public double calculateTax(double bookingBaseCost) {
      
		
		return  taxApplied=bookingBaseCost*(taxOnFood/100)+(taxOnBeverages/100);

	}
 public double calculateCess(int  noOfGuests, double totalBookingBaseCost) {
	 if(noOfGuests<=40) {
		 
		 cessTax=totalBookingBaseCost*4/100;
		
	 }else if(noOfGuests>40 && noOfGuests<=80) {
		 cessTax=totalBookingBaseCost*8/100;
	 }else if(noOfGuests>80 && noOfGuests<=150) {
		 cessTax=totalBookingBaseCost*10/100;
	 }else if(noOfGuests>150) {
		 cessTax=totalBookingBaseCost*12.5/100;
	 }
	return cessTax;
	 
	 
 }
 public double calculateTheTotalCost( double totalBookingBaseCost,double taxAppied,double cessTax ) {
	 return totalCost = totalBookingBaseCost+taxAppied+cessTax;
 }
}
