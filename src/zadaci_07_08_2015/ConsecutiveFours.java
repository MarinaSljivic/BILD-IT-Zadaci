package zadaci_07_08_2015;

import extrapackage.Numbers;

/* (Pattern recognition: consecutive four equal numbers) Write the following
method that tests whether the array has four consecutive numbers with the same
value.
public static boolean isConsecutiveFour(int[] values)
Write a test program that prompts the user to enter a series of integers and displays
if the series contains four consecutive numbers with the same value. Your
program should first prompt the user to enter the input size—i.e., the number of
values in the series*/

/**
 * @author Marina Sljivic
 *
 */
public class ConsecutiveFours {

	/**
	 * @param values int[]
	 * @return true if there are four equal consecutive numbers int the array values, false if there are not
	 */
	public static boolean isConsecutiveFour(int[] values){
		for(int i=0;i<values.length;i++){//i is the index of values' elements
			int number = values[i]; //number contains the values' i-th element
			
			if(values.length-i-3>0 && values[i+1]==number && values[i+2]==number && values[i+3]==number){
				//if the length of values minus the index of the fourth element from i is bigger than 0,
				//or if from i there are 4 numbers to test
				//and if the second, third and fourth number after i are equal to number
				return true;//then the four numbers are equal so return true
			}
		}
		return false;//if true wasn't returned then return false
	}
	public static void main(String[] args) {
		//ask the user to enter the size of the array, using helper method for input
		System.out.println("Enter the number of values: ");
		int size = Numbers.inputPositiveInteger();
		
		//ask to enter the values
		System.out.println("Enter the values:");
		int[] array = new int[size];//set the array size
		
		for(int i=0; i<array.length; i++){
			array[i] = Numbers.inputInteger();//take the integers
		}
		
		if(isConsecutiveFour(array)){//if there are four consecutive
			System.out.println("The list has consecutive fours");//print that
		}else{//else print that there are not
			System.out.println("The list has no consecutive fours");
		}
	}

}
