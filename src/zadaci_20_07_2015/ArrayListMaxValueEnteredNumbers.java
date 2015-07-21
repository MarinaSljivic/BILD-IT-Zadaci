package zadaci_20_07_2015;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Marina Sljivic
 *
 */
public class ArrayListMaxValueEnteredNumbers {
	
	/**
	 * These method takes the users inputs and add them to an arrayList,
	 * if the users input is 0 it stops
	 * 
	 * @return an ArrayList of Integers
	 */
	public static ArrayList<Integer> inputListOfIntegers(){
		Scanner scan = new Scanner(System.in);
		int input = 0; //these will take what the user enters
		ArrayList<Integer> list = new ArrayList<Integer>(); //these list will contain the entered values
		
		do{ //do all these:
			boolean continueInput = true; //set it to true because we have to take the input, so continue
			
			do { //do all these:
				try {
					System.out.print("Enter a number: ");
					input = scan.nextInt(); //if this passed without exceptions, errors
					list.add(input); //add the number to the list
					continueInput = false; //then we dont need to continue input (it is false),
											//the right number has been entered
				} catch (InputMismatchException ex) {
					System.out.println("Try again. (Incorrect input: an integer is required)");
					scan.nextLine(); // discard the current input, pass to the nextLine
				}
			} while (continueInput);//while the number isnt entered correctly(continueInput==true)
			
		}while(input!=0); //while the users input isnt 0

		scan.close();
		return list;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> listInt=inputListOfIntegers();
		
		int maxNumber = ArrayListMaxValue.max(listInt); //we are using the metod from ArrayListMaxValue class
		
		
		System.out.println("The max value is "+maxNumber+" and its in the list "
				//countElement is a method from OneHundredRandomNumbers class
				+ OneHundredRandomNumbers.countElement(listInt, listInt.lastIndexOf(maxNumber))+" times");
	}

}
