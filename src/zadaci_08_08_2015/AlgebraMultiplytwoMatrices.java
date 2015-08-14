package zadaci_08_08_2015;

import zadaci_07_08_2015.AlgebraAddTwoMatrices;

/*(Algebra: multiply two matrices) Write a method to multiply two matrices. The
header of the method is:
public static double[][]
 multiplyMatrix(double[][] a, double[][] b)
 To multiply matrix a by matrix b, the number of columns in a must be the same as
the number of rows in b, and the two matrices must have elements of the same or
compatible types. Let c be the result of the multiplication. Assume the column size
of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + ... + ain * bnj.
Write a test program that prompts the user to enter two 3 * 3 matrices and displays
their product.*/

/**
 * @author Marina Sljivic
 *
 */
public class AlgebraMultiplytwoMatrices {
	/**
	 * This method prints the multiplication of two square matrices and the result matrix: a * b = c, row by row
	 * 
	 * @param a double[][] matrix
	 * @param b double[][] matrix
	 * @param c double[][] matrix
	 * 
	 */
	public static void printSquareMatricesMultiplication(double[][] a,double[][] b,double[][] c){
		
		for(int row=0; row<a.length; row++){ //every printed row would have three rows from three matrices
			
			//print the first matrices' row
			for(int column=0; column<a[0].length; column++){
				System.out.print(a[row][column]+" ");//print the element
			}
			//between the first and the second matrices
			if(row == a.length/2){ //if we are in the middle row
				System.out.print("  *  "); //print a '*'
			}else{
				System.out.print("     ");//else just print blank space
			}
			//print the second matrices' row
			for(int column=0; column<b[0].length; column++){
				System.out.print(b[row][column]+" ");//print the element
			}
			//between the second and the third
			if(row==a.length/2){//if we are in the middle row
				System.out.print("  =  ");//print a '='
			}else{
				System.out.print("     ");//else just print blank space
			}
			//print the third matrices' row
			for(int column=0; column<c[0].length; column++){
				System.out.print(c[row][column]+" ");//print the element
			}
			System.out.println();//when the row is printed go to next line
		}
	}
	
	/**
	 * This method multiplies matrix a by matrix b, the number of columns in a must be the same as 
	 * the number of rows in b, and the two matrices must have elements of the same or
	 * compatible types.
	 * 
	 * @param a double[][]
	 * @param b double[][]
	 * @return a matrix that is the result of the multiplication.
	 */
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		double[][] c = new double[a.length][b[0].length];//c will contain the multiplication of a and b, the size is 
		//number of rows of a by number of columns of b
		
		for(int row=0; row<a.length; row++){ //c has the same number of rows as a
			for(int column=0; column<b[0].length; column++){ //c has the same number of columns as b
				
				//Each element cij is ai1 * b1j + ai2 * b2j + ... + ain * bnj
				
				int i =0; //set i to 0, i is the number of columns of a who is equal to the number of rows in b
				while(i<a[0].length){ //while i is smaller than the number of columns in a
					c[row][column] += a[row][i] * b[i][column]; //multiply and sum every row of a with the respective column in b
					i++;//increase i
				}
				
			}
		}
		return c;//return the result matrix
	}
	
	public static void main(String[] args) {
		//matrix A and B would take the inputs, matrix C would be their multiplication
		double[][] matrixA, matrixB, matrixC = new double[3][3];
		
		//ask the user to enter a 3-by-3 matrix
		System.out.println("Enter 3-by-3 matrices: ");
		try{
			//try to take matrices A and B
			matrixA = AlgebraAddTwoMatrices.inputMatrix(3, 3);
			matrixB = AlgebraAddTwoMatrices.inputMatrix(3, 3);
			
			//try to multiply matrices A and B and put the multiplication in C
			matrixC = multiplyMatrix(matrixA, matrixB);
			
			//print the three matrices
			printSquareMatricesMultiplication(matrixA, matrixB, matrixC);
		
		}catch(Exception e){//if the user inputs something that is not a number catch the exception
			System.out.println("Bad Input. The matrix's elements must be numbers.");
		}


	}

}
