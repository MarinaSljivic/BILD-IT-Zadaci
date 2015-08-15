package zadaci_09_08_2015;

import java.util.Scanner;

/*(Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
identical if their corresponding elements are equal. Write a method that returns
true if m1 and m2 are strictly identical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)
 Write a test program that prompts the user to enter two 3 * 3 arrays of
integers and displays whether the two are strictly identical. Here are the
sample runs.*/

/**
 * @author Marina Sljivic
 *
 */
public class StrictlyIdentical {

	/**
	 * @param m1 int[][]
	 * @param m2 int[][]
	 * @return true if m1 and m2 are strictly identical (two-dimensional arrays m1 and m2 are strictly
identical if their corresponding elements are equal), false if they aren't.
	 */
	public static boolean equals(int[][] m1, int[][] m2){
		if(m1.length==m2.length && m1[0].length==m2[0].length){//if the two arrays are the same size we can compare them
			for(int i=0;i<m1.length;i++){
				for(int j=0;j<m1[0].length;j++){
					if(m1[i][j] != m2[i][j]){//if there is one pair of elements at the same position that are different
						return false;//the matrices are not strictly equal return false
					}
				}
			}
		}else{ //we cannot even compare them
			return false; //return false
		}
		return true;//if everything passes without false, return true
	}
	
	/**
	 * @param rows int
	 * @param columns int
	 * @return the inputed matrix int[rows][columns]
	 */
	public static int[][] inputMatrix(int rows, int columns){
		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[rows][columns];//matrix would take the inputs
		
		//take the inputed matrix's elements
		for(int i=0;i<matrix.length;i++){ //i row
			for (int j = 0; j < matrix[i].length; j++){ //j column
				matrix[i][j] = scan.nextInt();//take the i,j.th element
			}
		}
		return matrix;//return the matrix
	}
	public static void main(String[] args) {
		
		try{
			//take the to matrices from the user
			System.out.println("Enter the first 3-by-3 matrix: ");
			int[][] matrixA = inputMatrix(3, 3);
			System.out.println("Enter the second 3-by-3 matrix: ");
			int[][] matrixB = inputMatrix(3, 3);
			
			//print the result
			if(equals(matrixA, matrixB)){ //if they are strictly identical
				System.out.println("The two arrays are strictly identical");
			}else{ //if they are not
				System.out.println("The two arrays are not strictly identical");
			}
		}catch(Exception e){//if the user inputs something that is not an integer catch the exception
			System.out.println("Bad Input. The matrix's elements must be integers.");
		}
	}

}
