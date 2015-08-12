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

	public static double sumColumn(double[][] m, int columnIndex){
		double sum = 0;//set the sum of the column to 0
		
		for(int i=0;i<m.length;i++){ //i is the index of every subarray(row)
			sum += m[i][columnIndex]; //add to the sum every element at the columnIndex 
		}
		return sum;//return the sum
	}
	
	public static void main(String[] args) {
		//ask the user to enter the matrix
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		Scanner scan = new Scanner(System.in);
		double[][] matrix = new double[3][4];
		
		for(int i=0;i<matrix.length;i++){
			for (int j = 0; j < matrix[i].length; j++){
				try{
					matrix[i][j] = scan.nextDouble();
				}catch(Exception e){
					System.out.println("Bad Input");
				}
			}
		}
		for(int i=0;i<matrix[0].length;i++){ //i is the index for the columns, 
			//there are m[0].length columns(the size of the subarrays)
			//print the sum for every column
			System.out.println("Sum of the elements at column "+i+" is "+sumColumn(matrix, i));
		}

	}

}
