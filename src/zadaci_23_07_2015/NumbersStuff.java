package zadaci_23_07_2015;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import zadaci_22_07_2015.IntArrayStuff;

/*
 * Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula prekida unos)
 * te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih unešenih brojeva
 * a koliko je bilo brojeva ispod prosjeka. Pretpostavimo da je maksimalan niz 
 * brojeva koje korisnik može unijeti 100.
 */

/**
 * @author Marina Sljivic
 *
 */
public class NumbersStuff {

	/**
	 * @param list ArrayList<Integer>
	 * @return array type int that contains all the elements in the list
	 */
	public static int[] toIntArray(ArrayList<Integer> list){
		  int[] array = new int[list.size()]; //the array is the same length as the list
		  for(int i=0;i<array.length;i++){
		    array[i] = list.get(i); //at the same positions as in the list, add to the array the integers
		  }
		  return array;
	}
	
	/**
	 * These method asks the user to input some integers, one number per line, when he wants to stop
	 *  he has to type 0, or enter a maximum of 100 numbers.
	 *  Then the method returns an ArrayList<Integer> that contains that integers.
	 * 
	 * @return an ArrayList<Integer> that contains user's inputs
	 */
	public static ArrayList<Integer> inputList(){
		Scanner scan = new Scanner(System.in);		
		ArrayList<Integer> list = new ArrayList<Integer>(); //a list that will contain user's inputs
		int input=0; //input will contain the last values of the user's inputs
		System.out.println("Enter some integers (press 0 to stop): ");
		do{
			boolean continueInput = true;//these means that we need to continue to take users inputs
			do {
				try {
					input = scan.nextInt(); //try to take the user's input
					if(input!=0){ //if the input is not 0 add it to the list
						list.add(input);//add the user's input in the list
					}
					//if this passed without exceptions, errors
					continueInput = false; //then we dont need to continue input (it is false),
											//the right number has been entered
				} catch (InputMismatchException ex) {
					System.out.println("Try again. (Incorrect input: an integer is required)");
					scan.nextLine(); // discard the current input, pass to the nextLine
				}
			} while (continueInput);//while the number is not entered correctly(continueInput is true)
		}while(input!=0 && list.size()<=100);//do while the user's input is not 0
		
		return list;
	}
	
	public static void main(String[] args) {
		int[] integers = toIntArray(inputList()); //take the inputs and put they into the array
		double arithmeticMean = 0; //set the arithmetic mean
		for(int i=0;i<integers.length;i++){
			arithmeticMean+=integers[i]; //sum all the integers in the array
		}
		arithmeticMean/=integers.length;//divide the sum by the number of integers(the size of the array)
		
		int aboveAM=0;//aboveAm will count how many numbers in the array are equal or greater than the arithmeticMean
		for(int i=0;i<integers.length;i++){
			if(integers[i]>=arithmeticMean){ //if the number is greater or equal
				aboveAM++; //increase the counter
			}
		}
		//print the aboveAM, to find how many are lower than the arithmetical mean, we subtract from
		//the size of the array the aboveAM
		System.out.println("The arithmetic mean is "+arithmeticMean
				+".\nThere are "+aboveAM+" number/s that is/are equal or greater than the arithmetic mean.\n"
				+"And "+(integers.length - aboveAM)+" that is/are lower than the arithmetic mean.");
	}

}
