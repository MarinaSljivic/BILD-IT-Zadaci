package zadaci_29_07_2015;

import java.util.ArrayList;
import java.util.Scanner;

/* Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u abecednom redu. 
 * Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, 
 * program vraæa Atlanta, Chicago, Los Angeles.*/

/**
 * @author Marina Sljivic
 *
 */
public class AlphabeticalSort {

	/**
	 * This method takes three strings(cities) the user inputs, add them to a list of cities
	 * and prints out the list sorted in alphabetical order.
	 *  
	 */
	public static void inputAndSortCities() {
		Scanner scan = new Scanner(System.in);// create a scanner object
		ArrayList<String> listOfCities = new ArrayList<>();// this list will contain the
												// inputed cities-strings
		for (int i = 0; i < 3; i++) { // we need three cities
			listOfCities.add(scan.nextLine());// add the inputed city to the list
		}
		listOfCities.sort(null);;// sort the list in alphabetical order
		// print the list in alphabetical order
		System.out.println(listOfCities);
		// close the scanner object
		scan.close();
	}

	public static void main(String[] args) {
		System.out.println("Enter three cities: ");
		inputAndSortCities();// test method
	}

}
