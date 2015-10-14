package zadaci_20_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*(InputMismatchException) Write a program that prompts the user to read
 two integers and displays their sum. Your program should prompt the user to
 read the number again if the input is incorrect.*/

/**
 * @author Marina Sljivic
 *
 */
public class TwoIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean inputIsOk = false;

		while (!inputIsOk) { // while the input is not ok (while we dont have
								// two integers)
			// try to take two integers from the user
			try {
				System.out.print("Enter two numbers: ");
				int firstNumber = scan.nextInt();
				int secondNumber = scan.nextInt();
				System.out
						.println("The sum is " + (firstNumber + secondNumber));
				inputIsOk = true; // if the sum was displayed then the inputs
									// are ok
				// so break the while
			} catch (InputMismatchException e) {// catch the exceptions, if the
												// input wasnt an integer
				System.out.print("Try again. ");
				scan.next(); // discard the exception and read next
			}
		}
		scan.close();
	}

}
