package zadaci_20_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Marina Sljivic
 *
 */
public class GreatestCommonDivisor {

	/**
	 * these method takes two numbers and returns their greatest common
	 * divisor(gcd)
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return the greatest common divisor
	 */
	public static int gcd(int firstNumber, int secondNumber) {
		int gcd = 1; // 1 is the smallest gcd possible

		// i is from 1 to firstNumber(or secondNumber it's not important beacuse
		// it's COMMON divisor
		// so it cannot be greater than the first nor the second)
		for (int i = 1; i <= Math.abs(firstNumber); i++) {
			// absolute value beacuse in case we have -6 and 3, we have to
			// remove the -
			if (firstNumber % i == 0 && secondNumber % i == 0) { // if i divedes
																	// both
				gcd = i; // gcd becomes i
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		// System.out.println(gcd(1,2));
		// System.out.println(gcd(-6,3));
		// System.out.println(gcd(213,213));
		// System.out.println(gcd(-2,2));
		// System.out.println(gcd(24,36));

		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		int nFirst = 0, nSecond = 0;
		
		do { //do all these:
			try {
				System.out.print("Enter the first number: ");
				nFirst = input.nextInt(); //if this passed without exceptions, errors
				continueInput = false; //then we dont need to continue input (it is false),
										//the right number has been entered
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: an integer is required)");
				input.nextLine(); // discard the current input, pass to the nextLine
			}
		} while (continueInput);//while the first number isnt entered correctly(continueInput is true)
		
		//set continueInput to true because now we have to do the same for the second number
		continueInput=true;
		
		do {
			try {
				System.out.print("Enter the second number: ");
				nSecond = input.nextInt();
				continueInput = false;

			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: an integer is required)");
				input.nextLine();
			}
		} while (continueInput);
		
		// when both the number have been entered correctly print the gcd
		System.out.println("The greatest common divisor is: "
				+ gcd(nFirst, nSecond));

		input.close();
	}

}
