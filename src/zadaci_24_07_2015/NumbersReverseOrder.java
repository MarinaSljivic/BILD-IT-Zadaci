package zadaci_24_07_2015;

import java.util.Arrays;

import extrapackage.Numbers;

/*Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu.*/

/**
 * @author Marina Sljivic
 *
 */
public class NumbersReverseOrder {

	/**
	 * This method takes as parameter an array of integers and prints its elements in reverse oreder.
	 * 
	 * @param numbers an array of integers
	 */
	public static void printReverse(int[] numbers){
		for(int i=numbers.length-1;i>=0;i--){ //"i" is the index of the numbers elements, it starts from the last index
			// and goes to the first, so we print numbers in reveerse order
			System.out.print(numbers[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] array=new int[10];//this array will contain the inputs of the user, the integers
		System.out.println("Enter ten numbers: ");//ask to enter 10 numbers
		for(int i=0;i<10;i++){//"i" is the index from 0 to 9 of array
			array[i]=Numbers.inputInteger();//save when its correct inputed the integer
		}
		printReverse(array);//print the array in reverse order
	}

}
