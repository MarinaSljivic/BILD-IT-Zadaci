package zadaci_22_07_2015;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi na istim pozicijama jednaki.
//Napisati metodu koja vraæa true ukoliko su nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi header:
//public static boolean equals(int[ ] niz1, int[ ] niz2)
//Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva te provjerava da li su 
//striktno identièni.

/**
 * @author Marina Sljivic
 *
 */
public class IntArrayStuff {

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
	 *  he has to type 0. Then the method returns an ArrayList<Integer> that contains that integers.
	 * 
	 * @return an ArrayList<Integer> that contains user's inputs
	 */
	public static ArrayList<Integer> inputList(){
		Scanner scan = new Scanner(System.in);		
		ArrayList<Integer> list = new ArrayList<Integer>(); //a list that will contain user's inputs
		int input=0; //input will contain the last values of the user's inputs
		do{
			boolean continueInput = true;//these means that we need to continue to take users inputs
			do {
				try {
					System.out.println("Enter a number: ");
					input = scan.nextInt(); //try to take the user's input
					list.add(input);//add the user's input in the list
					//if this passed without exceptions, errors
					continueInput = false; //then we dont need to continue input (it is false),
											//the right number has been entered
				} catch (InputMismatchException ex) {
					System.out.println("Try again. (Incorrect input: an integer is required)");
					scan.nextLine(); // discard the current input, pass to the nextLine
				}
			} while (continueInput);//while the number is not entered correctly(continueInput is true)
		}while(input!=0);//do while the user's input is not 0
		
		return list;
	}
	
	/**
	 * @param niz1 first array of integers
	 * @param niz2 second array of integers
	 * @return true if the two arrays are equal(have the same elements at the same position), false if they are not
	 */
	public static boolean equals(int[] niz1, int[] niz2){
		if(niz1.length==niz2.length){ //if they are the same length
			for(int i=0;i<niz1.length;i++){ //then their indexes will be the same, from 0 to the array length
				if(niz1[i]!=niz2[i]){ //as soon as  they haven't equal elements(integers) at the same position(i)
					return false; //return false
				}
			}
			return true;//if all the elements are equal (false not returned) then they are equal
		}else{//if they are not the same length they are not equal
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the 1. array of integers(press 0 to stop):");
		int[] arrayOne = toIntArray(inputList()); 
		//inputList() takes the user's inputs and puts them into an ArrayList<Integer>
		//that ArrayList we convert to an array of int with toIntArray()
		System.out.println("Enter the 2. array of integers(press 0 to stop):");
		int[] arrayTwo = toIntArray(inputList());
		
		//test the method equals() to see if the two arrays are equal
		System.out.println("The two arrays are equal: "+equals(arrayOne, arrayTwo));
		
	}
}
