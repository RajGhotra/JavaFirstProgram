package assignment;

public class MainDiscount {

	public static void main(String[] args) {
		DiscountApplied discount = new DiscountApplied();
		discount.productPrice = 100;
		discount.isPromo10Applied = true;
		discount.toCalculateTheDiscount();
	}

}
