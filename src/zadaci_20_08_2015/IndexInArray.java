package zadaci_20_08_2015;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*(ArrayIndexOutOfBoundsException) Write a program that meets the following
requirements:
- Creates an array with 100 randomly chosen integers.
- Prompts the user to enter the index of the array, then displays the corresponding
element value. If the specified index is out of bounds, display the
message Out of Bounds.*/

/**
 * @author Marina Sljivic
 *
 */
public class IndexInArray {

	public static void main(String[] args) {
		//create an array of 100 integers 
		int[] intArray = new int[100];
		//a Random object to generate the integers
		Random random = new Random(System.currentTimeMillis());
		//fill the array
		for(int i=0;i<intArray.length;i++){
			intArray[i] = random.nextInt(100);//a random integer from 0 to 99			
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an index of the array: ");
		//try to take the index from the user
		try{
			int index = scan.nextInt();
			//display the corresponding element
			System.out.print("The corresponding element value is: "+ intArray[index]);
		}catch(ArrayIndexOutOfBoundsException e){// catch the exception, if the index 
			// is not in range 0-99, print:
			System.out.print("Out of Bounds.");
		}catch (InputMismatchException e) {// catch the exceptions, if the
			// input wasnt an integer
			System.out.print("Not an integer.");
			}
		scan.close();
	}

}
