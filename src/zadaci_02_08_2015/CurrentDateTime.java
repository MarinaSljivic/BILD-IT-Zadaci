package zadaci_02_08_2015;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Napisati metodu koja vraæa datum i trenutaèno vrijeme.*/

/**
 * @author Marina Sljivic
 *
 */
public class CurrentDateTime {

	/**
	 * This method returns a string that contains the current date and time
	 * @return a string that contains the current date and time
	 */
	public static String currentDateAndTime() {
		Date currentDate = new Date(); //to get the current date and time create a Date object 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd. MMMMMMMMM, YYYY HH:mm:ss");//this object is a format that we want for the date
		//dd. is the number of the day, it means we want a day in format "08."
		//nine M because the longest month has 9 letters, after that we want print a comma ","
		//YYYY means to print the year in that format "2015"
		//and HH:mm:ss the hours, minutes and seconds, if we put 'hh' it would be from 1-12, with HH its from 1-24
						
		return sdf.format(currentDate);//return the formatted currentDate in format sdf as String
	}
	
	public static void main(String[] args) {
		System.out.println(currentDateAndTime());//print the current date

	}

}
