package zadaci_22_07_2015;

import java.util.Arrays;

//Implementirati sljedeæu metodu da sortira redove u 2D nizu.
//public static double[ ][ ] sortRows(double[ ][ ] array)
//Napisati testni program koji pita korisnika da unese 3x3 matricu 
//(ili da pita korisnika koliku matricu želi unijeti) te mu ispisuje 
//na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najveæeg.

/**
 * @author Marina Sljivic
 *
 */
public class SortRowsMatrix {

	/**
	 * @param 2D array (a matrix) type double
	 * @return the array with sorted rows only
	 */
	public static double[][] sortRows(double[][] array){
		for(int i=0;i<array.length;i++){ //i is he index of every subarray(row)
			Arrays.sort(array[i]);//sort the i row
		}
		return array;//return the sorted array
	}
	
	public static void main(String[] args) {
		//usa a method from another class that makes a 2Darray (a matrix) of user's inputs
		double[][] matrix=Double2DArrayStuff.input2DArray(); //take the 2D array from the user
		
		//sort the rows of the matrix
		matrix=sortRows(matrix);
		
		//print the matrix
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
