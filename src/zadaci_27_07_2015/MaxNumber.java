package zadaci_27_07_2015;

import java.util.ArrayList;

import zadaci_20_07_2015.ArrayListMaxValue;
import zadaci_20_07_2015.OneHundredRandomNumbers;
import zadaci_22_07_2015.IntArrayStuff;

/* Napišite program koji uèitava neodreðen broj cijelih brojeva (unos prekida nula), 
 * pronalazi najveæi od unijetih brojeva te ispisuje koliko se najveæi broj puta ponovio. 
 * Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje da je najveæi broj 5 
 * te ispisuje da se isti ponavlja 4 puta.*/

/**
 * @author Marina Sljivic
 *
 */
public class MaxNumber {

	public static void main(String[] args) {
		System.out.println("Enter some integers one per line (press 0 to stop): ");
		//using a method done in a previous exercise that takes the users inputs 
		//and adds them to an arrayList, if the users input is 0 it stops
		ArrayList<Integer> listInt=IntArrayStuff.inputList();
		
		//using the method from ArrayListMaxValue class to find the max value in the list
		int maxNumber = ArrayListMaxValue.max(listInt);

		System.out.println("The max value is "+maxNumber+" and its in the list "
				//countElement is a method from OneHundredRandomNumbers class
				+ OneHundredRandomNumbers.countElement(listInt, listInt.lastIndexOf(maxNumber))+" times");

	}

}
