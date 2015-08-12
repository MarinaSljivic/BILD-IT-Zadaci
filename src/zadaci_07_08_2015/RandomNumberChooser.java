package zadaci_07_08_2015;

import java.util.Random;

/* (Random number chooser) Write a method that returns a random number between
1 and 54, excluding the numbers passed in the argument. The method header is
specified as follows:
public static int getRandom(int... numbers)*/

/**
 * @author Marina Sljivic
 *
 */
public class RandomNumberChooser {
	
	/**
	 * @param number int
	 * @param array int[]
	 * @return true if the number is in the array, false if its not
	 */
	private static boolean isIn(int number, int[] array){
		for(int i : array){//for every number i int the array
			if(i==number){//if i equals to the number
				return true;//return true, its in the array
			}
		}
		return false;//if its not true then it false
	}
	/**
	 * @param numbers int...
	 * @return a random generated number between 1 and 54 that its not in numbers 
	 */
	public static int getRandom(int... numbers){
		Random ran = new Random(System.nanoTime());//create a random object
		int number = ran.nextInt(54)+1;//generates a number between 0 and 53, and adds +1, so we it is between 1 and 54
		
		while(isIn(number,numbers)){//while the number is present in the numbers
			number = ran.nextInt(54)+1;//generate another number
		}
		return number; //return the number
	}

	public static void main(String[] args) {
		System.out.println("The generated number is "+getRandom(1,2,3,4,6));//testing the method

	}

}
