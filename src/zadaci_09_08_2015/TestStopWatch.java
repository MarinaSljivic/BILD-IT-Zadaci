package zadaci_09_08_2015;

import java.util.Random;

/*(Stopwatch) Design a class named StopWatch. The class contains:
  Private data fields startTime and endTime with getter methods.
 - A no-arg constructor that initializes startTime with the current time.
 - A method named start() that resets the startTime to the current time.
 - A method named stop() that sets the endTime to the current time.
 - A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
 Draw the UML diagram for the class and then implement the class.*/

/**
 * @author Marina Sljivic
 *
 */
class StopWatch {

	private long startTime;
	private long endTime;
	
	//data fields' getters
	long getStartTime() {
		return startTime;
	}
	long getEndTime() {
		return endTime;
	}
	
	/**
	 * A no-arg constructor that initializes startTime with the current time in milliseconds.
	 */
	StopWatch(){
		//initializes startTime with the current time in milliseconds
		this.startTime = System.currentTimeMillis();
	}
	
	/**
	 * This method resets the startTime to the current time in milliseconds.
	 */
	void start(){
		this.startTime = System.currentTimeMillis();
	}
	
	/**
	 * This method sets the endTime to the current time in milliseconds.
	 */
	void stop(){
		this.endTime = System.currentTimeMillis();
	}
	
	/**
	 * @return the elapsed time for the stop watch in milliseconds
	 */
	long getElapsedTime(){
		//the elapsed time is the difference between the endTime and the startTime
		return getEndTime() - getStartTime();
	}
}

/**
 * This class is for a test program that measures the execution time 
 * of sorting 100,000 numbers using selection sort.
 * 
 * @author Marina Sljivic
 *
 */
public class TestStopWatch{
	
	public static void main(String[] args){
		//array contains 100 000 random generated numbers between 0 and 99 999
		int[] array = new int[100000];
		Random ran = new Random();
		for(int i=0; i<array.length; i++){
			array[i] = ran.nextInt(100000);
		}
		
		//run the time before the sorting starts
		StopWatch sw = new StopWatch();
		//sort the array using selection sort
		for(int i=0; i<array.length-1; i++){
			for(int j=i+1; j<array.length; j++){
				if(array[i] > array[j]){ //if the number at smaller index is bigger than the number at bigger index
					//replace their position
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}		
			}
		}
		//when the sorting ends, stop the time and print the execution time in seconds
		sw.stop();
		System.out.println("It takes "+(sw.getElapsedTime()/1000)+" seconds to sort 100 000 numbers using selection sort.");

	}
}

