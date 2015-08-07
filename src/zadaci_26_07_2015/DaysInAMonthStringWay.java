package zadaci_26_07_2015;

import java.util.Scanner;

import extrapackage.Numbers;

/**
 * @author Marina Sljivic
 *
 */
public class DaysInAMonthStringWay {

	/**
	 * Given a String (that represents a month) this method checks if it is three letters-first uppercase, 
	 * others lowercase. If the given month is ok returns the number of the month, else returns 0.
	 * 
	 * @param month String
	 * @return integer that represents the number of the given month 
	 */
	public static int whatMonth(String month){
		int numberOfMonth = 0;
		
		String[] monthsArray = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		
		for(int i=0;i<monthsArray.length;i++){//for every month in the array
			if(monthsArray[i].equals(month)){
				numberOfMonth=i+1;
			}
		}
		return numberOfMonth;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//ask the user to enter the month and the year
		System.out.println("Enter the first three letters of a month (ie. Jan, Feb, Mar,...): ");
		String stringMonth = scan.nextLine(); //take the string-month
		
		int numberMonth=whatMonth(stringMonth); //take the number of the entered month
		
		while(numberMonth==0){ //while the month is 0, its not correctly entered, so print that to the user
			System.out.println("You didn't enter correctly the month. "
					+ "First letter must be uppercase, the other two lowercase.");
			stringMonth = scan.nextLine(); //and take again the string-month
			numberMonth=whatMonth(stringMonth); //take the number of the entered month
		}
		
		System.out.println("Enter a year (YYYY): ");
		int year = Numbers.inputPositiveInteger(); //take the year, using a helper method from a helper class
		DaysInAMonth.printDays(numberMonth,year); //print how many days that month has

		scan.close();
	}

}
