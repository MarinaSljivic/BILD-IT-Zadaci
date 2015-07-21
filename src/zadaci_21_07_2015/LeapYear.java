package zadaci_21_07_2015;

// These program prints out all the leap years from 101 to 2100, ten per line
// and the total number of leap years in that time period

public class LeapYear {

	public static void main(String[] args) {
		
		int countLeapYears = 0; //counts how many leap years there are from 101 to 2100.
		
		for(int year=101; year<=2100; year++){ //we start from 101 year to 2100 year
			
			//a year is leap if its divisible by 4 but not by 100 or if its divisible by 400
			boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));			
			//true if the year is a leap year, false if it's not

	        if (isLeapYear){ //if its true, then print it
	        	System.out.print(year+" ");
	        	countLeapYears++; //increase for one the number of leap years
	        	if(countLeapYears % 10 == 0){ //if we have a number of leap years that 
	        									//is divisble by 10 then go to the next line
	        		System.out.println();
	        	}
	        }
		}
		//print the total number of leap years
		System.out.println("\n\nFrom 101 to 2100 there are "+countLeapYears+" leap years.");

	}

}
