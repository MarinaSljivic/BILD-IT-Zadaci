package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/*	(Largest rows and columns) Write a program that randomly fills in 0s and 1s
	into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
	most 1s. (Hint: Use two ArrayLists to store the row and column indices with
	the most 1s.)
	
	Enter the array size n: 4
	The random array is
	0011
	0011
	1101
	1010
	The largest row index: 2
	The largest column index: 2, 3*/

/**
 * @author Marina Sljivic
 *
 */
public class LargestRowAndColumn {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		try{ 
			int n = scan.nextInt();
			scan.close();
			int[][] matrix = generateMatrix(n);//generate a n by n matrix of 0s and 1s
			print(matrix);//print the generated matrix
			
			//find the max sum for the columns and the rows:
			//maxSumColumn is the sum of the column with the most 1s
			int maxSumColumn = sumColumn(matrix, 0);//set it to be the first 0-column
			//max sum row is the sum of the row with the most 1s
			int maxSumRow = sumRow(matrix,0);//set it to the first row 0-row
			for(int i=1; i< matrix.length; i++){
				//index i is from 1 because we have set the maxColumn and maxRow to the 0 index
				//we generate a square matrix so the matrix.length is equal to matrix[0].length, rows=columns
				if(maxSumColumn < sumColumn(matrix, i)){//if the maxSumColumn is smaller then the sum of the i.th column
					maxSumColumn = sumColumn(matrix, i); //the maxSumColumn becomes the biggest
				}
				if(maxSumRow < sumRow(matrix, i)){//same here with the rows
					maxSumRow = sumRow(matrix, i);
				}
			}
			
			//now the array lists will contain all the columns and the rows with the max sum
			ArrayList<Integer> maxColumns = new ArrayList<>();
			ArrayList<Integer> maxRows = new ArrayList<>();
			for(int i=0; i< matrix.length; i++){
				if(maxSumColumn == sumColumn(matrix, i)){//if the maxSumColumn is equal to a sum of the i.th column
					maxColumns.add(i);//add the column
				}
				if(maxSumRow == sumRow(matrix, i)){//same here with the rows
					maxRows.add(i);
				}
			}
			
			//print the result
			System.out.print("The largest row index: ");
			for(int i=0;i<maxRows.size();i++){
				System.out.print(maxRows.get(i));
				if(i<maxRows.size()-1){//if the i.th element of the list is not the last
					System.out.print(", ");//print a comma
				}
			}
			System.out.print("\nThe largest column index: ");
			for(int i=0;i<maxColumns.size();i++){
				System.out.print(maxColumns.get(i));
				if(i<maxColumns.size()-1){
					System.out.print(", ");
				}
			}
		}catch(Exception e){
			System.out.println("Invalid size.");;
		}
	}

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
	 * @param m int[][] matrix
	 * @param rowIndex int
	 * @return the sum of all the elements in a specified row in a matrix
	 */
	public static int sumRow(int[][] m, int rowIndex){
		int sum = 0;//set the sum of the column to 0
		
		for(int i=0;i<m.length;i++){ //i is the index of every column
			sum += m[rowIndex][i]; //add to the sum every element at the rowIndex 
		}
		return sum;//return the sum
	}
	
}
