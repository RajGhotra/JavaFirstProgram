/*Q2. Write a program that calculates discount applied on a product. Criteria are as below

50% discount is applied on all products.
If any of the following promo codes are applied then add the additional discount and
 calculate the final discounted value

Promo Code	Discount
Promo5	5%
Promo10	10%
Promo20	20%  */

package assignment;

public class DiscountApplied {

	double productPrice;
	double discountedValue;
	double discountedValueWithPromo;

	boolean isPromo5Applied;
	boolean isPromo10Applied;
	boolean isPromo20Applied;

	void toCalculateTheDiscount() {
		discountedValue = productPrice * 0.5;// 50% discount on all products

		if (isPromo5Applied) {

			discountedValueWithPromo = discountedValue * 0.95;
			System.out.println("Discount Value after applying promo5 is :" + discountedValueWithPromo);

		} else if (isPromo10Applied) {
			discountedValueWithPromo = discountedValue * 0.90;
			System.out.println("Discount Value after applying promo10 is :" + discountedValueWithPromo);
		} else if (isPromo20Applied) {
			discountedValueWithPromo = discountedValue * 0.80;
			System.out.println("Discount Value after applying promo20 is :" + discountedValueWithPromo);

		}
	}

}
