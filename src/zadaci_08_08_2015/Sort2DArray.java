package zadaci_08_08_2015;

/*(Sort two-dimensional array) Write a method to sort a two-dimensional array
using the following header:
public static void sort(int m[][])
 The method performs a primary sort on rows and a secondary sort on columns.
For example, the following array
{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
will be sorted to
{{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}*/

/**
 * @author Marina Sljivic
 *
 */
public class Sort2DArray {

	/**
	 * The method performs a primary sort on rows and a secondary sort on columns.
	 * 
	 * @param m int[][]
	 */
	public static void sort(int m[][]){
		
		//first sorts by rows, and then "by column" if the rows have same elements to a certain column
		for(int row=0;row<m.length-1;row++){ //we compare every row
			for(int i=row+1;i<m.length;i++){ //with matrix's bigger rows(i)
				for(int column=0; column<m[0].length; column++){
					
					if( m[row][column] > m[i][column] && areEqualElements(m,row,i,column)){
						//if the element at same column of the smaller row(row) is bigger 
						//than the element of the bigger row(i)
						//and all the previous elements in the rows are equal,
						//replace their positions
						int[] temp = m[row];
						m[row] =m[i];
						m[i] = temp;
					}
				}
			}
		}
	}
	
	/**
	 * @param matrix
	 * @param row1
	 * @param row2
	 * @param toColumn
	 * @return true if the elements of the matrix row1 are equal to 
	 * 			the elements of the matrix row2 from column 0 to column toColumn,
	 * 			false if they are not
	 */
	public static boolean areEqualElements(int[][] matrix, int row1, int row2, int toColumn) {
		for(int i=0;i<toColumn;i++){//i is the index of the columns
			if(matrix[row1][i] != matrix[row2][i]){//if there are two elements that are not equal
				return false;//return false
			}
		}
		return true;//otherwise they are all equal to the column toColumn, so return true
	}

	public static void main(String[] args) {
		//will use this two dim.array to test
		int[][] TDarray = {{4, 2, 2},{1, 7, 2},{4, 5, 2},{1, 2, 2},{1, 2, 3},{4, 1, 2}};
		System.out.println("The array to sort is: ");
		LargestRowAndColumn.print(TDarray);//prints the two dim.array
		sort(TDarray);//sorts the two dim.array
		System.out.println("The sorted array: ");
		LargestRowAndColumn.print(TDarray);
	}

}
