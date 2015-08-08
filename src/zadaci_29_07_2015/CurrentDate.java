package zadaci_29_07_2015;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od 1. januara 1970 
 * do trenutka pozivanja metode. Napisati program koji ispisuje trenutaèni datum i vrijeme 
 * u formatu "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"*/

/**
 * @author Marina Sljivic
 *
 */
public class CurrentDate {
	
	/**
	 * This method prints out the current date and time in this format: 08. August, 2015 17:25:00
	 */
	public static void getIt(){
		Date currentDate = new Date(System.currentTimeMillis()); //to get the current date and time create a Date object 
		//depending on System.currentTimeMillis() 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd. MMMMMMMMM, YYYY HH:mm:ss");//this object is a format that we want for the date
		//dd. is the number of the day, it means we want a day in format "08."
		//nine M because the longest month has 9 letters, after that we want print a comma ","
		//YYYY means to print the year in that format "2015"
		//and HH:mm:ss the hours, minutes and seconds, if we put 'hh' it would be from 1-12, with HH its from 1-24
				
		System.out.println("The current date and time is: "
										+sdf.format(currentDate));//sdf.format(currentDate) applies the format we set in sdf
	}
	public static void main(String[] args) {
		
	}

}
