package banquetHall;

public class Banquet {

	double bookingBaseCost;
	double foodCost;
	double beverageCost;
	double taxOnFood;
	double taxOnBeverages;
	double tip;

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

	public double calculateBaseCost(double bookingBaseCost, double foodCost, double beverageCost) {

		double totalBookingBaseCost = bookingBaseCost + foodCost + beverageCost;
		return totalBookingBaseCost;
	}

	public double calculateTax(double bookingBaseCost) {

		double taxApplied = bookingBaseCost*((taxOnFood / 100) + (taxOnBeverages / 100));
		return taxApplied;

	}

	public double calculateCess(int noOfGuests, double totalBookingBaseCost) {
		double cessTax = 0;
		if (noOfGuests <= 40) {

			cessTax = totalBookingBaseCost * 4 / 100;

		} else if (noOfGuests > 40 && noOfGuests <= 80) {
			cessTax = totalBookingBaseCost * 8 / 100;
		} else if (noOfGuests > 80 && noOfGuests <= 150) {
			cessTax = totalBookingBaseCost * 10 / 100;
		} else if (noOfGuests > 150) {
			cessTax = totalBookingBaseCost * 12.5 / 100;
		}
		return cessTax;

	}

	public double calculateTheTotalCost(double totalBookingBaseCost, double taxAppied, double cessTax) {
		double totalCost = totalBookingBaseCost + taxAppied + cessTax + tip;
		return totalCost;
	}
}
