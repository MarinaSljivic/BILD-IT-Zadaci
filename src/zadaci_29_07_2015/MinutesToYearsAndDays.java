package zadaci_29_07_2015;

import extrapackage.Numbers;

/* Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) te ispiše korisniku 
 * koliko je to u godinama i danima. Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.*/

/**
 * @author Marina Sljivic
 *
 */
public class MinutesToYearsAndDays {

	/**
	 * This method takes as parameter a long that represents the minutes, converts it to years and days
	 * and prints out the result to the user.
	 * 
	 * @param minutes long
	 */
	public static void convertAndPrint(long minutes){
		//divide the minutes in hours(/60), days(/24) and find the rest dividing by 365(days in a year)
		long days = minutes /60 /24 %365;
		long years = minutes /60 /24 /365;//similarly here, but divide the number of days by 365
		//print the result to the user
		System.out.println("In years and days it is: "+years+" years and "+days+" days.");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of minutes you want to convert: ");
		//ask the user to enter the minutes and take his input with a helper method from Numbers
		long minutes = Numbers.inputPositiveLongZeroIncluded();
		convertAndPrint(minutes);//convert and print the minutes in years and days
	}
}