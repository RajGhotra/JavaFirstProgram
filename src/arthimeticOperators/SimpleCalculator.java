package arthimeticOperators;

public class SimpleCalculator {

	int num1 = 40;
	int num2 = 30;
	int result;

	void toAddNums() {

		result = num1 + num2;

		System.out.println("The sum of two numbers are: " + result);
	}

	void toSubtractNums() {

		result = num1 - num2;
		System.out.println("The subtracrtion of two number are: " + result);
	}

	void toMultiply() {

		result = num1 * num2;

		System.out.println("The multiplication of two number are: " + result);

	}

	void toGetQuotient() {
		result = num1 / num2;
		System.out.println("The quotient is: " + result);
	}

	void toGetRemainder() {
		result = num1 % num2;
		System.out.println("The remainder is:" + result);
	}
}
