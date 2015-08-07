package zadaci_28_07_2015;

import extrapackage.Numbers;

/* Napisati metodu koja vraæa broj dana u godini. Metoda koristi sljedeæi header: 
 * public static int numberOfDaysInAYear(int year). 
 * Napisati program koji pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje 
 * broj dana za svaku godinu u rasponu.*/

/**
 * @author Marina Sljivic
 *
 */
public class YearDays {
	
	/**
	 * Given an integer that represents a year, this method returns how many days that year has.
	 * 
	 * @param year int
	 * @return the number of days in the year
	 */
	public static int numberOfDaysInAYear(int year){
		// a year is leap if its divisible by 4 but not by 100 or if its
		// divisible by 400
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		// true if the year is a leap year, false if it's not

		if (isLeapYear) { // if the year is a leap year then
			return 366; //return 366 days
		}else{
			return 365; //else return the ordinary number of days in a year
		}
	}
	
	/**
	 * This method asks the user to enter the starting year, final year and 
	 * lists the number of days per year in that range.
	 */
	public static void daysForEveryYear(){
		
		//ask the user to enter the two years using helper method for the input from helper class Numbers
		System.out.println("Enter the starting year: ");
		int startYear = Numbers.inputPositiveInteger();
		System.out.println("Enter the final year: ");
		int finalYear = Numbers.inputPositiveInteger();
		
		for(int i=startYear; i<=finalYear; i++){//i represents every year from startYear to finalYear
			//print for every year i the number of days it has
			System.out.println(i+". has "+numberOfDaysInAYear(i)+" days.");
		}
	}
	public static void main(String[] args) {
		daysForEveryYear();//test method
	}

}
