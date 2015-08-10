package zadaci_01_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

import zadaci_21_07_2015.Matrix;

/* Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim headerom: public static void printMatrix(int n). 
 * Svaki element u matrici je ili 0 ili 1, nasumièno generisana. 
 * Napisati test program koji pita korisnika da unese broj n te mu ispiše n x n matricu u konzoli.*/

/**
 * @author Marina Sljivic
 *
 */
public class MatrixOneZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean continueInput=true;
		int size=0;//set the size to 0
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
		Matrix.printMatrix(size);//this method exists in class Matrix
	}
}

