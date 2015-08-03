package zadaci_23_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem redosljedu: 
 * public static void displaySortedNumbers(double num1, double num2, double num3).
 * Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u rastuæem redosljedu.*/


/**
 * @author Marina Sljivic
 *
 */
public class DoubleNumbersSort {
	
	public static void displaySortedNumbers(double num1, double num2, double num3){
		if(num1>num2){ //if the first number is bigger than the second
			double temp = num1; //replace their values
			num1 = num2;
			num2 = temp;
		} //else they are sorted
		//now the values of the first and the second may be replaced or not
		if(num1>num3){ //if the first number is bigger than the third
			double temp = num1; //replace their values 
			num1 = num3;
			num3 = temp;
		}//else they are sorted
		//now the values of the first and the third may be replaced or not
		if(num2>num3){ //if the second number is bigger than the third
			double temp = num2; //replace their values
			num2 = num3;
			num3 = temp;
		}//else they are sorted
		//now the values of the second and the third may be replaced or not
		
		System.out.println(num1+" "+num2+" "+num3); //print the numbers sorted
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] array=new double[3];//create an array that will take the users numbers
		
		for(int i=0;i<3;i++){ //we need 3 numbers
			boolean continueInput = true;//these means that we need to continue to take users inputs
			
			do { //do all these:
				try {
					//print to the user to enter the i+1 number
					System.out.print("Enter the "+(i+1)+". number: ");
					array[i] = scan.nextDouble(); //set the users input in the array
					//if this passed without exceptions, errors
					continueInput = false; //then we dont need to continue input (it is false),
											//the right number has been entered
				} catch (InputMismatchException ex) {
					System.out.println("Try again. (Incorrect input: a double is required)");
					scan.nextLine(); // discard the current input, pass to the nextLine
				}
			} while (continueInput);//while the number isnt entered correctly(continueInput is true)
		}
		scan.close();

		displaySortedNumbers(array[0], array[1], array[2]);
	}

}
