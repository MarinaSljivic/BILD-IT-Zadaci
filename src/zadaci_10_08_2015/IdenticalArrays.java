package zadaci_10_08_2015;

import java.util.InputMismatchException;

import zadaci_09_08_2015.StrictlyIdentical;

/*(Identical arrays) The two-dimensional arrays m1 and m2 are identical if they
have the same contents. Write a method that returns true if m1 and m2 are identical,
using the following header:
public static boolean equals(int[][] m1, int[][] m2)
 Write a test program that prompts the user to enter two 3 * 3 arrays of integers
and displays whether the two are identical.*/

public class IdenticalArrays {

	/**
	 * @param m1 int[][]
	 * @param m2 int[][]
	 * @return true if m1 and m2 are identical (if they have the same contents but not necessary at same position),
	 *  false if they aren't.
	 */
	public static boolean equals(int[][] m1, int[][] m2){
		
		if(m1.length==m2.length && m1[0].length==m2[0].length){
			//if the two arrays are the same size we can compare them
			
			for(int i=0;i<m1.length;i++){
				for(int j=0;j<m1[0].length;j++){
					
					if(count(m1[i][j], m1) != count(m1[i][j], m2)){
						//if there is a number m1[i][j] that is not in m1
						//as much times as in m2, return false
						return false;
					}
				}
			}
		}else{ //we cannot even compare them
			return false; //return false
		}
		return true;//if everything passes without false, return true
	}
	
	/**
	 * @param number int
	 * @param array int[][]
	 * @return how many times number is in array
	 */
	public static int count(int number, int[][] array){
		int counter = 0;//counts how many times number is in array
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[0].length;j++){
				if(array[i][j] == number){ //when an element of the array is equal to number
					counter++;//increase the counter
				}
			}
		}
		return counter;//return the result
	}
	
	public static void main(String[] args) {
		
		try{
			//take the to matrices from the user
			System.out.println("Enter the first 3-by-3 matrix: ");
			int[][] matrixA = StrictlyIdentical.inputMatrix(3, 3);
			System.out.println("Enter the second 3-by-3 matrix: ");
			int[][] matrixB = StrictlyIdentical.inputMatrix(3, 3);
			
			//print the result
			if(equals(matrixA, matrixB)){ //if they are identical
				System.out.println("The two arrays are identical");
			}else{ //if they are not
				System.out.println("The two arrays are not identical");
			}
		}catch(InputMismatchException e){//if the user inputs something that is not an integer catch the exception
			System.out.println("Bad Input. The matrix's elements must be integers.");
		}
	}
}
