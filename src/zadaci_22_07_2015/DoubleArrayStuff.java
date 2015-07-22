package zadaci_22_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Marina Sljivic
 *
 */
public class DoubleArrayStuff {

	/**
	 * This method takes as parameter an array of doubles and returns the smallest number in the array.
	 * 
	 * @param array of decimal numbers
	 * @return the smallest number in the array
	 */
	public static double min(double[] array){
		double minNumber = array[0]; //set the minNumber to be the first number in the array
		for(double number : array){ //compare all the numbers in the array with the minNumber
			if(number<minNumber){ //if there is a number in the array that is smaller then minNUmber
				minNumber = number; //then minNumber takes its value
			}
		}
		return minNumber;//return the smallest number in the array
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] array=new double[10];//create an array that will take the users numbers
		
		for(int i=0;i<10;i++){ //we need 10 numbers
			boolean continueInput = true;//these means that we need to continue to take users inputs
			
			do { //do all these:
				try {
					//print to the user to enter the i+1 number
					System.out.print("Enter the "+(i+1)+". number: ");
					array[i] = scan.nextDouble(); //set the users input in the array
					//if this passed without exceptions, errors
					continueInput = false; //then we dont need to continue input (it is false),
											//the right number has been entered
				} catch (InputMismatchException ex) {
					System.out.println("Try again. (Incorrect input: a double is required)");
					scan.nextLine(); // discard the current input, pass to the nextLine
				}
			} while (continueInput);//while the number isnt entered correctly(continueInput is true)
		}
		System.out.println("The smallest number is: "+min(array));
		scan.close();
	}

}
