package zadaci_07_08_2015;

import java.util.Scanner;

/*(Sum elements column by column) Write a method that returns the sum of all the
elements in a specified column in a matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)*/

/**
 * @author Marina Sljivic
 *
 */
public class SumMatrixElements {

	/**
	 * @param m double[][] matrix
	 * @param columnIndex int
	 * @return the sum of all the elements in a specified column in a matrix
	 */
	public static double sumColumn(double[][] m, int columnIndex){
		double sum = 0;//set the sum of the column to 0
		
		for(int i=0;i<m.length;i++){ //i is the index of every subarray(row)
			sum += m[i][columnIndex]; //add to the sum every element at the columnIndex 
		}
		return sum;//return the sum
	}
	
	public static void main(String[] args) {
		//ask the user to enter a 3-by-4 matrix
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		Scanner scan = new Scanner(System.in);
		double[][] matrix = new double[3][4];//matrix would take the inputs
		
		try{
			//try to take the inputed matrix's elements
			for(int i=0;i<matrix.length;i++){ //i row
				for (int j = 0; j < matrix[i].length; j++){ //j column
					matrix[i][j] = scan.nextDouble();
				}
			}
			
			for(int k=0;k<matrix[0].length;k++){ //k is the index for the columns, 
				//there are m[0].length columns(the size of the subarrays)
				//print the sum for every column
				System.out.println("Sum of the elements at column "+k+" is "+sumColumn(matrix, k));
			}
		
		}catch(Exception e){//if the user inputs something that is not a number catch the exception
			System.out.println("Bad Input. The matrix's elements must be numbers.");
		}
		scan.close();//close the scanner
	}

}
