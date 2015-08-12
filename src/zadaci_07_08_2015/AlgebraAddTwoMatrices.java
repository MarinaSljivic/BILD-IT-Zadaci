package zadaci_07_08_2015;

import java.util.Scanner;

/* (Algebra: add two matrices) Write a method to add two matrices. The header of
the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b) 
 In order to be added, the two matrices must have the same dimensions and the
same or compatible types of elements. Let c be the resulting matrix. Each element
cij is aij + bij.*/

/**
 * @author Marina Sljivic
 *
 */
public class AlgebraAddTwoMatrices {
	
	/**
	 * This method prints the sum of two matrices and the result matrix: a + b = c, row by row
	 * 
	 * @param a double[][] matrix
	 * @param b double[][] matrix
	 * @param c double[][] matrix
	 * 
	 */
	public static void printMatricesSum(double[][] a,double[][] b,double[][] c){
		
		for(int row=0; row<a.length; row++){ //every printed row would have three rows from three matrices
			
			//print the first matrices' row
			for(int column=0; column<a[0].length; column++){
				System.out.print(a[row][column]+" ");//print the element
			}
			//between the first and the second matrices
			if(row == a.length/2){ //if we are in the middle row
				System.out.print("  +  "); //print a '+'
			}else{
				System.out.print("     ");//else just print blank space
			}
			//print the second matrices' row
			for(int column=0; column<a[0].length; column++){
				System.out.print(b[row][column]+" ");//print the element
			}
			//between the second and the third
			if(row==a.length/2){//if we are in the middle row
				System.out.print("  =  ");//print a '='
			}else{
				System.out.print("     ");//else just print blank space
			}
			//print the third matrices' row
			for(int column=0; column<a[0].length; column++){
				System.out.print(c[row][column]+" ");//print the element
			}
			System.out.println();//when the row is printed go to next line
		}
	}
	
	/**
	 * @param rows int
	 * @param columns int
	 * @return the inputed matrix
	 */
	public static double[][] inputMatrix(int rows, int columns){
		Scanner scan = new Scanner(System.in);
		double[][] matrix = new double[rows][columns];//matrix would take the inputs
		System.out.println("Enter the matrix elements: ");
		
		//take the inputed matrix's elements
		for(int i=0;i<matrix.length;i++){ //i row
			for (int j = 0; j < matrix[i].length; j++){ //j column
				matrix[i][j] = scan.nextDouble();//take the i,j-th element
			}
		}
		return matrix;//return the matrix
	}
	
	/**
	 * @param a double[][] matrix
	 * @param b double[][] matrix
	 * @return a matrix c double[][] that is the sum of the two matrices a and b
	 */
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][a[0].length];//c will contain the sum of a and b, its the same size
		
		for(int row=0; row<a.length; row++){
			for(int column=0; column<a[0].length; column++){
				c[row][column] = a[row][column] + b[row][column];//Each element c(i,j) is a(i,j) + b(i,j) 
			}
		}
		return c;//return the sum matrix
	}
	
	public static void main(String[] args) {
		//matrix A and B would take the inputs, matrix C would be their sum
		double[][] matrixA, matrixB, matrixC = new double[3][3];
		
		//ask the user to enter a 3-by-3 matrix
		System.out.println("Enter 3-by-3 matrices: ");
		try{
			//try to take matrices A and B
			matrixA = inputMatrix(3, 3);
			matrixB = inputMatrix(3, 3);
			
			//try to add matrices A and B and put the sum in C
			matrixC = addMatrix(matrixA, matrixB);
			
			//print the three matrices
			printMatricesSum(matrixA, matrixB, matrixC);
		
		}catch(Exception e){//if the user inputs something that is not a number catch the exception
			System.out.println("Bad Input. The matrix's elements must be numbers.");
		}
	}

}
