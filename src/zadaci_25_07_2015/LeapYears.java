package zadaci_25_07_2015;

import extrapackage.Numbers;

/*Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina koje korisnik unese. 
Program pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu. 
Razmak izmeðu godina treba biti jedan space.*/

public class LeapYears {

	/**
	 * These method takes as parameter two integers: fromYear-from which year you want to check the leap years
	 * and toYear-to which year. It calculates the number of leap years in that interval 
	 * and prints 10 per line the leap years in that interval.
	 * 
	 * @param fromYear int
	 * @param toYear int
	 */
	public static void countAndPrintLeapYears(int fromYear, int toYear){
		int countLeapYears = 0; // counts how many leap years there are from 101 to 2100.

		for (int year = fromYear; year <= toYear; year++) { // we start from fromYear year to toYear year

			// a year is leap if its divisible by 4 but not by 100 or if its
			// divisible by 400
			boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
			// true if the year is a leap year, false if it's not

			if (isLeapYear) { // if its true, then print it
				System.out.print(year + " ");
				countLeapYears++; // increase for one the number of leap years
				if (countLeapYears % 10 == 0) { // if we have a number of leap years that
					// is divisble by 10 then go to the next line
					System.out.println();
				}
			}
		}
		// print the total number of leap years
		System.out.println("\n\nFrom "+fromYear+" to "+toYear+" there are " + countLeapYears
				+ " leap years.");
	}
	public static void main(String[] args) {

		//the methods for the user's inputs are used from the helper class
		System.out.println("Enter FROM which year you want to check the leap years: ");
		int fromY = Numbers.inputPositiveInteger();
		System.out.println("Enter TO which year you want to check the leap years: ");
		int ToY = Numbers.inputPositiveInteger();
		
		if(ToY<fromY){ //if the interval is not ok, like from 90 to 20 than print
			System.out.println("The years interval you entered has no sense.");
		}else{
			countAndPrintLeapYears(fromY, ToY);//else if its ok, than calculate and print
		}
	}

}
