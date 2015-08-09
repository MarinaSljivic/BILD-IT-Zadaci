package zadaci_01_08_2015;

import java.util.Random;

/* Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 
 * te ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)*/

/**
 * @author Marina Sljivic
 *
 */
public class RandomMonth {

	/**
	 * @param numberOfMonth int
	 * @return the name of the month depending on the passed numberOfMonth(from 1 to 12)
	 * 			if numberOfMonth is out of range returns an error message.
	 */
	public static String whatMonth(int numberOfMonth){
		//the months in this array are in order from index 0 to 11
		String[] monthsArray = {"January","February","March","April","May","Jun","Jul",
				"August","September","Octber","November","December"};
		
		for(int i=0;i<monthsArray.length;i++){//i is the index for the 0-11 month in the array
			if(i == numberOfMonth-1){ //if i is equal to the passed numberOfMonth -1 (beacuse you pass a number from 1 to 12)
				return monthsArray[i];//return that month
			}
		}
		return "That month doesn't exist.";//if nothing was returned then the numberOfMonth is not from 1 to 12 so return that
	}
	
	public static void main(String[] args) {
		Random ran = new Random(System.nanoTime());//create a random object which seed is System.nanoTime()
		int month = ran.nextInt(12)+1;//generate a number between 0 and 11 and add +1 to generate between 1 and 12
		System.out.println("The generated month is: "+whatMonth(month));//invoke the method to print the generated month
	}

}
