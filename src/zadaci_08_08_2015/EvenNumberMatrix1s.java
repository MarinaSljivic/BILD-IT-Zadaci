package zadaci_08_08_2015;

/*(Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
matrix filled with 0s and 1s, displays the matrix, and checks if every row and
every column have an even number of 1s*/

public class EvenNumberMatrix1s {
	
	/**
	 * @param m int[][]
	 * @return true if every row and every column have an even number of 1s
	 */
	public static boolean check(int[][] m){
		for(int i=0; i< m.length; i++){
			//if there is a column that has an odd number of 1s(the sum is odd)
			if(LargestRowAndColumn.sumColumn(m, i) % 2 != 0
					//or there is a row that has an odd number of 1s
					|| EmployeeWeeklyHours.sumArrayElements(m[i]) % 2 != 0){
				return false;//return false
			}
		}
		//if false didn't happen then return true
		return true;
	}
	public static void main(String[] args) {
		//generates a 6-by-6 two-dimensiona matrix filled with 0s and 1s
		int[][] matrix = LargestRowAndColumn.generateMatrix(6);
		//displays the matrix
		LargestRowAndColumn.print(matrix);
		
		/*
		//This while loop ends when it's generated a matrix whose every row and
		//every column have an even number of 1s.
		
		while(!check(matrix)){
			matrix = LargestRowAndColumn.generateMatrix(6);
		}
		*/
		
		//print the result after checking has the matrix even 1s in rows and columns
		if(check(matrix)){
			System.out.println("Every column and every row have an even number of 1s.");
		}else{
			System.out.println("Not every column and row have an even number of 1s.");
		}
	}

}
