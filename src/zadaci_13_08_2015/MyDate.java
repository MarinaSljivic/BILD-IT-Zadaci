package zadaci_13_08_2015;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*(The MyDate class) Design a class named MyDate. The class contains:
 - The data fields year, month, and day that represent a date. month is
0-based, i.e., 0 is for January.
 - A no-arg constructor that creates a MyDate object for the current date.
 - A constructor that constructs a MyDate object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds.
 - A constructor that constructs a MyDate object with the specified year,
month, and day.
 - Three getter methods for the data fields year, month, and day, respectively.
 - A method named setDate(long elapsedTime) that sets a new date for
the object using the elapsed time.
*/

/**
 * @author Marina Sljivic
 *
 */
public class MyDate {
	private int year, month, day;

	/**
	 * No-arg constructor that creates a MyDate object for the current date.
	 */
	public MyDate(){
		setDate(System.currentTimeMillis());//set the current date
		//System.currentTimeMillis() is the difference, measured in milliseconds,
		//between the current time and midnight, January 1, 1970
	}
	
	/**
	 * Constructor that constructs a MyDate object with a specified elapsed time<br> 
	 * since midnight, January 1, 1970, in milliseconds.
	 * @param elapsedTime long, milliseconds
	 */
	public MyDate(long elapsedTime){
		setDate(elapsedTime);
	}
	
	/**
	 * Constructor that constructs a MyDate object with the specified year, month, and day.<br>
	 * If you give an invalid value as 29/02/2015 or 31/13/2015 it will add or subtract<br>
	 * the invalid days, months or years, so that a valid date is constructed.
	 * @param year int
	 * @param month int
	 * @param day int
	 */
	public MyDate(int year, int month, int day){
		// Construct a calendar for date day/month/year
		Calendar calendar = new GregorianCalendar(year, month, day);
		//and set the MyDate year month and day
		this.year =  calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH);
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * This method sets a new date for the object using the elapsed time.
	 * @param elapsedTime long
	 */
	public void setDate(long elapsedTime){
		// Construct a Gregorian calendar for the current date 
		Calendar calendar = new GregorianCalendar();
		//and set the date that corresponds to the
		//elapsed time - the milliseconds since January 1, 1970, 00:00:00 GMT. 
		calendar.setTime(new Date(elapsedTime));
		this.year =  calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH);
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	//getters and setters for year, month and day
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
	
	@Override
	public String toString(){
		return getDay()+"/"+(getMonth()+1)+"/"+getYear();
	}
	
}
