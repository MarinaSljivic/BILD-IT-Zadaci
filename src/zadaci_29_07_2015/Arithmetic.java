package zadaci_29_07_2015;

import zadaci_22_07_2015.IntArrayStuff;

/* Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje koliko je pozitivnih 
 * brojeva korisnik unijeo, koliko negativnih te izraèunava ukupnu sumu i prosjek svih 
 * unesenih brojeva. (Korisnik prekida unos tako što unese nulu). 
 * Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše da je broj 
 * pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.*/

/**
 * @author Marina Sljivic
 *
 */
public class Arithmetic {

	public static void main(String[] args) {
		
		System.out.println("Enter some integers (0 to stop): ");
		
		//an array that has all the users inputs, using old methods
		int[] arrayOfInt = IntArrayStuff.toIntArray(IntArrayStuff.inputList());
		
		double sum=0;//set the sum to 0
		for(int i=0;i<arrayOfInt.length;i++){
			sum+=arrayOfInt[i]; //sum all the integers in the array
		}
		
		double arithmeticMean=sum/arrayOfInt.length;//divide the sum by the number of integers(the size of the array)
		
		int positive=0;//positive will count how many numbers in the array are greater than 0
		for(int i=0;i<arrayOfInt.length;i++){
			if(arrayOfInt[i]>0){ //if the number is greater than 0
				positive++; //increase the counter
			}
		}
		//print the number of positive integers and the number of negative integers(the size of the array the positive)
		//then print the sum of all integers and the arithmetic mean
		System.out.println("There are "+positive+" positive numbers and "+(arrayOfInt.length - positive)+" negative. "
				+ "The sum is "+sum+" and the arithmetic mean is "+arithmeticMean);
	}

}
