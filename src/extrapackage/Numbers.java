package extrapackage;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class helps me with the exercises so i dont have to copy-paste the code 
 * for handling the input exceptions for double, integer...numbers.
 * 
 * @author Marina Sljivic
 *
 */
public class Numbers {

	/**
	 * This method tries to take a double from the user and handles the exceptions if the input
	 * is not a double.
	 * 
	 * @return a double that the user inputs
	 */
	public static double inputDouble(){
		Scanner scan = new Scanner(System.in);
		double number=0; //set an initial value for the number
		boolean continueInput = true;//these means that we need to continue to take users inputs
		
		do { //do all these:
			try {
				number = scan.nextDouble();//try to take the double from user's input
				//if this passed without exceptions, errors
				continueInput = false; //then we dont need to continue input (it is false),
										//the right number has been entered
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: a double is required)");
				scan.nextLine(); // discard the current input, pass to the nextLine
			}
		} while (continueInput);//while the number isnt entered correctly(continueInput is true)
		return number;
	}
	

	/**
	 * This method tries to take an integer from the user and handles the exceptions if the input
	 * is not an integer.
	 * 
	 * @return an integer that the user inputs
	 */
	public static int inputInteger(){
		Scanner scan = new Scanner(System.in);
		int number=0; //set an initial value for the number
		boolean continueInput = true;//these means that we need to continue to take users inputs
		
		do { //do all these:
			try {
				number = scan.nextInt();//try to take the integer from user's input
				//if this passed without exceptions, errors
				continueInput = false; //then we dont need to continue input (it is false),
										//the right number has been entered
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: an integer is required)");
				scan.nextLine(); // discard the current input, pass to the nextLine
			}
		} while (continueInput);//while the number isnt entered correctly(continueInput is true)
		return number;
	}
	
	/**
	 * This method tries to take a short number from the user and handles the exceptions if the input
	 * is not a short.
	 * 
	 * @return a short that the user inputs
	 */
	public static short inputShort(){
		Scanner scan = new Scanner(System.in);
		short number=0; //set an initial value for the number
		boolean continueInput = true;//these means that we need to continue to take users inputs
		
		do { //do all these:
			try {
				number = scan.nextShort();//try to take the integer from user's input
				//if this passed without exceptions, errors
				continueInput = false; //then we dont need to continue input (it is false),
										//the right number has been entered
			} catch (Exception ex) {
				System.out.println("Try again. (Incorrect input: a short number is required)");
				scan.nextLine(); // discard the current input, pass to the nextLine
			}
		} while (continueInput);//while the number isnt entered correctly(continueInput is true)
		return number;
	}
	/**
	 * This method tries to take a POSITIVE double from the user and handles the exceptions if the input
	 * is not a positive double.
	 * 
	 * @return a positive double that the user inputs
	 */
	public static double inputPositiveDouble(){
		Scanner scan = new Scanner(System.in);
		double number=0; //set an initial value for the number
		boolean continueInput = true;//these means that we need to continue to take users inputs
		
		do { //do all these:
			try {
				number = scan.nextDouble();//try to take the double from user's input
				//if this passed without exceptions, errors
				if(number<=0){ //if the number is 0 or lower, throw a new Exception
					throw new InputMismatchException();
				}
				continueInput = false; //then we dont need to continue input (it is false),
										//the right number has been entered
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: a positive double is required)");
				scan.nextLine(); // discard the current input, pass to the nextLine
			}
		} while (continueInput);//while the number isnt entered correctly(continueInput is true)
		return number;
	}
	

	/**
	 * This method tries to take a POSITIVE integer from the user and handles the exceptions if the input
	 * is not a positive integer.
	 * 
	 * @return a positive integer that the user inputs
	 */
	public static int inputPositiveInteger(){
		Scanner scan = new Scanner(System.in);
		int number=0; //set an initial value for the number
		boolean continueInput = true;//these means that we need to continue to take users inputs
		
		do { //do all these:
			try {
				number = scan.nextInt();//try to take the integer from user's input
				//if this passed without exceptions, errors
				if(number<=0){ //if the number is 0 or lower, throw a new Exception
					throw new InputMismatchException();
				}
				continueInput = false; //then we dont need to continue input (it is false),
										//the right number has been entered
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: a positive integer is required)");
				scan.nextLine(); // discard the current input, pass to the nextLine
			}
		} while (continueInput);//while the number isnt entered correctly(continueInput is true)
		return number;
	}
	
	/**
	 * This method tries to take a POSITIVE long INCLUDED 0 from the user and handles the exceptions if the input
	 * is not a positive long.
	 * 
	 * @return a positive long that the user inputs
	 */
	public static long inputPositiveLongZeroIncluded(){
		Scanner scan = new Scanner(System.in);
		long number=0; //set an initial value for the number
		boolean continueInput = true;//these means that we need to continue to take users inputs
		
		do { //do all these:
			try {
				number = scan.nextLong();//try to take the long from user's input
				//if this passed without exceptions, errors
				if(number<0){ //if the number is lower than 0, throw a new Exception
					throw new InputMismatchException();
				}
				continueInput = false; //then we dont need to continue input (it is false),
										//the right number has been entered
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: a positive long is required)");
				scan.nextLine(); // discard the current input, pass to the nextLine
			}
		} while (continueInput);//while the number isnt entered correctly(continueInput is true)
		return number;
	}

	/**
	 * This method tries to take a POSITIVE integer INCLUDED 0 from the user and handles the exceptions if the input
	 * is not a positive integer.
	 * 
	 * @return a positive integer that the user inputs
	 */
	public static int inputPositiveIntegerZeroIncluded(){
		Scanner scan = new Scanner(System.in);
		int number=0; //set an initial value for the number
		boolean continueInput = true;//these means that we need to continue to take users inputs
		
		do { //do all these:
			try {
				number = scan.nextInt();//try to take the integer from user's input
				//if this passed without exceptions, errors
				if(number<0){ //if the number is lower than 0, throw a new Exception
					throw new InputMismatchException();
				}
				continueInput = false; //then we dont need to continue input (it is false),
										//the right number has been entered
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: a positive integer is required)");
				scan.nextLine(); // discard the current input, pass to the nextLine
			}
		} while (continueInput);//while the number isnt entered correctly(continueInput is true)
		return number;
	}
}
