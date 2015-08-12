package zadaci_07_08_2015;

import java.util.Random;

/* (Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)*/

/**
 * @author Marina Sljivic
 *
 */
public class CountSingleDigits {

	public static void main(String[] args) {
		Random ran = new Random(System.nanoTime());//create a random object
		int[] counts = {0,0,0,0,0,0,0,0,0,0};//to store the counts for the number of 0s, 1s, . . . , 9s. Set all to 0
		//at index 0 is the counter for 0, at index 1 is the counter for 1,...
		
		for(int i=0;i<100;i++){//we need 100 numbers(iterations)
			int number = ran.nextInt(10); //generate a number between 0 and 9
			counts[number]++; //then increase the counter of the number
		}
		
		for(int i=0; i<counts.length;i++){//then print for every number 'i' between 0 and 9
			System.out.println(i+" was generated "+counts[i]+" times.");//how many times it was generated
		}
	}

}
