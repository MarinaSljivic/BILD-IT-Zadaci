package zadaci_26_07_2015;

import extrapackage.Numbers;

/*Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše broj dana u datom mjesecu. 
 * Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, program treba ispisati da je 
 * Februar 2012 imao 29 dana. Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, 
 * program treba ispisati da je Mart 2015 imao 31 dan. */

/**
 * @author Marina Sljivic
 *
 */
public class DaysInAMonth {
	
	/**
	 * Given the month and the year, this method returns how many days has that month.
	 * 
	 * @param month int
	 * @param year int
	 */
	public static void printDays(int month, int year){
		int[] daysPerMonth = {31,28,31,30,31,30,31,31,30,31,30,31}; //this array contains the number of days per month
		//daysPerMonth[0] is the first-January and it has 31 days...
		boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);//true if the year is a leap year, false if it's not)
		
		int numberOfDays = daysPerMonth[month-1];//the number of days is at index: the given month between 1-12 minus 1
		
		if(isLeapYear && month==2){//if the year is a leap year and the month is February
			numberOfDays++; //then add a day to be 29
		}
		//and print the number of days
		System.out.println("It has "+numberOfDays+" days.");	
	}
	
	public static void main(String[] args) {
		//ask the user to enter the month and the year
		//using the method for positive integers from the helper class Numbers
		System.out.println("Enter a month (MM): ");
		int month = Numbers.inputPositiveInteger();
		while(month>12){ //if the user enters 13, 14 or similiar
			//print him to try again
			System.out.println("Try again, that month doesn't exist. (Hint: from 1 to 12)");
			month = Numbers.inputPositiveInteger();
		}
		System.out.println("Enter a year (YYYY): ");
		int year = Numbers.inputPositiveInteger();
		printDays(month,year); //print how many days that month has
	}

}
