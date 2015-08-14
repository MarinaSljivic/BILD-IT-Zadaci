package zadaci_08_08_2015;

import zadaci_07_08_2015.SumMatrixElements;

/*(Largest row and column) Write a program that randomly fills in 0s and 1s into
a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
most 1s. Here is a sample run of the program:
		0 0 1 1
		0 0 1 1
		1 1 0 1
		1 0 1 0
	The largest row index: 2
	The largest column index: 2*/

/**
 * @author Marina Sljivic
 *
 */
public class LargestRowAndColumn {
	/**
	 * These method returns a n*n matrix that is random generated. Its elements can be 0 or 1.
	 * 
	 * @param n the size of the matrix is n*n
	 * @return a n*n matrix that is random generated with 0s and 1s
	 */
	public static int[][] generateMatrix(int n){
		int[][] matrix = new int[n][n];
		for(int i=0;i<n;i++){ //i is the row number - from 0 to n-1 because its size n
			for(int j=0;j<n;j++){ //j is the column number - from 0 to n-1 because its size n
				
				matrix[i][j]=(int)(Math.random()*2); //generate the ij element of the matrix
				//(int)(Math.random()*2) random generates 0 or 1
			}
		}
		return matrix;//return the generated matrix
	}

	/**
	 * @param m int[][] matrix
	 * @param columnIndex int
	 * @return the sum of all the elements in a specified column in a matrix
	 */
	public static int sumColumn(int[][] m, int columnIndex){
		int sum = 0;//set the sum of the column to 0
		
		for(int i=0;i<m.length;i++){ //i is the index of every subarray(row)
			sum += m[i][columnIndex]; //add to the sum every element at the columnIndex 
		}
		return sum;//return the sum
	}
	
	/**
	 * This method prints the matrix m.
	 * 
	 * @param m int[][] matrix
	 */
	public static void print(int[][] m){
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matrix = generateMatrix(4);//generate a 4by4 matrix of 0s and 1s

		print(matrix);//print the generated matrix
		
		//max sum column is the sum of the column with the most 1s, so the sum of column's elements will be the biggest
		int maxSumColumn = sumColumn(matrix, 0);//set it to the first column
		int maxColumn = 0;//set the max column to be the first column
		
		//max sum row is the sum of the row with the most 1s, the sum of rows's elements will be the biggest
		int maxSumRow = EmployeeWeeklyHours.sumArrayElements(matrix[0]);//set it to the first row
		int maxRow = 0;//set it to be the first row
		
		for(int i=1; i< matrix.length; i++){//index i is from 1 because we have set the maxColumn and maxRow to the 0 index
			//because we generate a square matrix the matrix.length is equal to matrix[0].length, rows=columns
			if(maxSumColumn<sumColumn(matrix, i)){//if the maxSumColumn is smaller then the sum of the i.th column
				maxColumn = i;//set the index of the maxColumn to i
			}
			if(maxSumRow<EmployeeWeeklyHours.sumArrayElements(matrix[i])){//same here with the rows
				maxRow = i;
			}
		}

		//print the result
		System.out.println("The largest row index: "+maxRow 
				+"\nThe largest column index: "+maxColumn);
	}

}
