package zadaci_09_08_2015;

import java.util.Arrays;

import zadaci_07_08_2015.AlgebraAddTwoMatrices;

/*(Row sorting) Implement the following method to sort the rows in a twodimensional
array. A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)
 Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and displays a new row-sorted matrix.*/

/**
 * @author Marina Sljivic
 *
 */
public class RowSorting {
	
	/**
	 * @param m double[][]
	 * @return the matrix m with all rows sorted 
	 */
	public static double[][] sortRows(double[][] m){
		//create a duplicate of the matrix m
		double[][] a=new double[m.length][m[0].length];
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				a[i][j] = m[i][j];
			}
		}
		
		//sort the duplicate
		for(int i=0;i<a.length;i++){
			Arrays.sort(a[i]);//sort every row of m
		}
		return a;//and return the duplicate, m is intact
	}
	/**
	 * This method prints the matrix m.
	 * 
	 * @param m double[][] matrix
	 */
	public static void print(double[][] m){
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		double[][] matrix = new double[3][3];
		
		//ask the user to enter a 3-by-3 matrix
		System.out.println("Enter 3-by-3 matrix: ");
		try{
			//try to take matrix
			matrix = AlgebraAddTwoMatrices.inputMatrix(3, 3);
			
			System.out.println("The new row-sorted matrix:");
			//print the sorted matrix by rows
			print(sortRows(matrix));
			
		}catch(Exception e){//if the user inputs something that is not a number catch the exception
			System.out.println("Bad Input. The matrix's elements must be numbers.");
		}

	}

}
