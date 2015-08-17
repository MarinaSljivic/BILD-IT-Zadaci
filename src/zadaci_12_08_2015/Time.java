package zadaci_12_08_2015;



/*(The Time class) Design a class named Time. The class contains:
 - The data fields hour, minute, and second that represent a time.
 - A no-arg constructor that creates a Time object for the current time. (The
values of the data fields will represent the current time.)
 - A constructor that constructs a Time object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds. (The values of the data
fields will represent this time.)
 - A constructor that constructs a Time object with the specified hour, minute,
and second.
 - Three getter methods for the data fields hour, minute, and second,
respectively.
 - A method named setTime(long elapseTime) that sets a new time
for the object using the elapsed time. For example, if the elapsed time is
555550000 milliseconds, the hour is 10, the minute is 19, and the second is
10.
Draw the UML diagram for the class and then implement the class. Write
a test program that creates two Time objects (using new Time() and new
Time(555550000)) and displays their hour, minute, and second in the format
hour:minute:second.
(Hint: The first two constructors will extract the hour, minute, and second
from the elapsed time. For the no-arg constructor, the current time can be
obtained using System.currentTimeMillis(), as shown in Listing 2.7,
ShowCurrentTime.java.)*/

/**
 * @author Marina Sljivic
 *
 */
public class Time{
	private int hour, minute, second;
	
	/**
	 *No-arg constructor that creates a Time object for the current time. 
	 */
	public Time(){
		//use the method setTime() to get the current time
		setTime(System.currentTimeMillis());
	}
	
	
	/**
	 *Constructor that constructs a Time object with a specified elapsed time<br>
	 *since midnight, January 1, 1970, in milliseconds.<br> 
	 *If the elpased time is not okay, we will have the current time.
	 *
	 * @param elapsedTimeInMillis long
	 */
	
	public Time(long elapsedTimeInMillis){
		//same here, to get the elapsed time from 01.01.1970. use the method setTime()
		setTime(elapsedTimeInMillis);
	}
	
	/**
	 * Constructor that constructs a Time object with the specified hour, minute, and second.<br>
	 * If the values are not okay, for example 26hours, 63minutes and -12seconds then a Time object<br>
	 * with the current time will be created.
	 * 
	 * @param hour int
	 * @param minute int
	 * @param second int
	 */
	public Time(int hour, int minute, int second){
		this(); //first create a Time object with the current time
		
		//if the specified hour, minute and second are okay then set the new values
		//else we will have the current time
		if(hour<24 && hour>=0 && minute<60 && minute>=0 && second<60 && second>=0){
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
	}
	
	//getters for hour, minute and second
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}
	
	/**
	 * This method sets a new time  including the time zone for the object using the elapsed time.<br>
	 * if elapseTime is lower than 0 than creates a Time object with the current time.
	 * 
	 * @param elapseTime the elapsed time in milliseconds since 01.01.1970. 00:00:00, type long
	 */
	public void setTime(long elapseTime){
		
		//if the elapsed time is not less than 0 we can convert the elapsed time in hours, minutes and seconds
		if(elapseTime>=0){
			//the elapsed time divided by milliseconds in one hour, finding the rest dividing by 24hours to get
			//the exactly hours from 0 to 23 and adding +2 to get the exactly time in our time zone
			this.hour = (int)(elapseTime/(1000*60*60))%24 + 2;
			
			//the elapsed time divided by milliseconds in one minute, finding the rest
			//dividing by 60minutes to get the exactly minutes from 0 to 59
			this.minute = (int)(elapseTime/(1000*60))%60;
			
			//the elapsed time divided by milliseconds in one second, finding the rest
			//dividing by 60seconds to get the exactly seconds from 0 to 59
			this.second = (int)(elapseTime/1000)%60;
		}else{//if it is less than 0 we cannot
			setTime(System.currentTimeMillis());//so set the Time to the current time
		}
	}
	
	//overriding the method toString() for an easy printing the Time
	@Override
	public String toString(){
		String time=""; //represents the Time in format HH:mm:ss
		if(getHour()<10){ //if the hour has one digit 
			time="0"; //then we add a 0 before that digit
		}
		time+=getHour()+":"; //add the hour
		
		//same for the minute and second if it's one digit
		if(getMinute()<10){ 
			time+="0";
		}
		time+=getMinute()+":";
		if(getSecond()<10){ 
			time+="0";
		}
		time+=getSecond();
		return time;
	}
}

