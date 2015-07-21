package zadaci_21_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Marina Sljivic
 *
 */
public class Matrix {
	
	/**
	 * These method prints a n*n matrix that is random generated. Its elements can be 0 or 1.
	 * 
	 * @param n the size of the matrix is n*n
	 */
	public static void printMatrix(int n){
		for(int i=0;i<n;i++){ //i is the row number - from 0 to n-1 because its size n
			for(int j=0;j<n;j++){ //j is the column number - from 0 to n-1 because its size n
				
				System.out.print((int)(Math.random()*2)+"  "); //print the ij element of the matrix
				//(int)(Math.random()*2) random generates 0 or 1
			}
			System.out.println(); //we are at the n-th column, so: new line
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean continueInput=true;
		int size=0;
		do{
			try{
				System.out.println("Enter the size of the matrix: ");
				size = scan.nextInt(); //if this passed without exceptions, errors
				if(size<0){ //if the size is an integer negative number
					throw new InputMismatchException(); //throw an exception
				}
				continueInput = false; //then we dont need to continue input (it is false),
										//the right number has been entered
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: a positive integer is required)");
				scan.nextLine(); // discard the current input, pass to the nextLine
			}
		} while (continueInput);//while the first number isnt entered correctly(continueInput is true)
		scan.close();
		printMatrix(size);
	}

}
