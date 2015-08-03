package zadaci_23_07_2015;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//Napisati program koji pita korisnika da unese neki cijeli broj te ispisuje njegove najmanje faktore u 
//rastuæem redoslijedu. 
//Na primjer, ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)

/**
 * @author Marina Sljivic
 *
 */
public class NumberFactors {

	/**
	 * These method takes as parameter an integer number and prints out its prime factors.
	 * 
	 * @param number type int
	 */
	public static void printSortedFactors(int number){
		String stringFactors=""; //these string will contain all the prime factors of the number
		int cloneNumber = number; //because we are going to change the value of number, 
		//we need its clone, so number will keep its value
		for(int i=2; i<=cloneNumber; i++){ //i is all the numbers from 2 to cloneNumber
			 while(cloneNumber%i==0){ //while the cloneNumber is divisible by i
				 cloneNumber=cloneNumber/i; //cloneNumber became the cloneNumber divided by i
				 stringFactors+=i+"*"; //and append to the string that i and the operation sign *
			 }
		 }
		stringFactors=stringFactors.substring(0, stringFactors.length()-1); //cancel the last char in the string (it's the extra "*" of line 24)
		System.out.println(stringFactors+" = "+number); //println the string with the factors
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
	
		try {
			System.out.println("Enter an integer to find out its factors: ");
			int input = scan.nextInt(); //try to take the user's input
			printSortedFactors(input); //try to print the input's factors
		} catch (InputMismatchException ex) { //catch the exceptions:
			//if the user inputs a char, string, double... something thats not int, print:
			System.out.println("The number must be an integer!");
		} catch (StringIndexOutOfBoundsException ex){//if the input is lower or equal to 1, has no sense, so print:
			System.out.println("The number must be a positive integer greater than 1.");
		}
	
		scan.close();
	}

}
