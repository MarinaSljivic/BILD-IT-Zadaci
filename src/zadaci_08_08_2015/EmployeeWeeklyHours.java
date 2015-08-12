package zadaci_08_08_2015;

/*(Compute the weekly hours for each employee) Suppose the weekly hours for all
employees are stored in a two-dimensional array. Each row records an employee’s
seven-day work hours with seven columns. For example, the following
array stores the work hours for eight employees. Write a program that displays
employees and their total hours in decreasing order of the total hours. Example:
			Su 	M 	T	W 	Th 	F 	Sa
Employee 0 	2	4	3	4	5	8	8
Employee 1 	7	3	4	3	3	4	4
Employee 2 	3	3	4	3	3	2	2
Employee 3 	9	3	4	7	3	4	1
Employee 4 	3	5	4	3	6	3	8
Employee 5 	3	4	4	6	3	4	4
Employee 6 	3	7	4	8	3	8	4
Employee 7 	6	3	5	9	2	7	9*/

/**
 * @author Marina Sljivic
 *
 */
public class EmployeeWeeklyHours {
	
	/**
	 * @param array int[]
	 * @return the sum of array's elements
	 */
	public static int sumArrayElements(int[] array){
		int sum = 0;//set the sum to 0
		for(int i=0;i<array.length;i++){
			sum += array[i]; //add the elements to the sum
		}
		return sum;//return the sum
	}
	
	/**
	 * @param array int[][]
	 * @return return the array sorted in decreasing order by the sum of the elements in the subarrays
	 */
	public static int[][] sortByRowSumDecreasing(int[][] array){
		
		for(int row=0;row<array.length-1;row++){ //in this case row is the Employee from 0 to the penultimate
			
			for(int i=row+1;i<array.length;i++){ //and i is the Employee from row+1 to the last
					
				if(sumArrayElements(array[row]) > sumArrayElements(array[i])){
					//if the sum of the array at smaller index is bigger than the sum
					//of the array at bigger index, replace their positions
					int[] temp = array[row];
					array[row] =array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}
	
	/**
	 * Displays employees and their total hours in decreasing order of the total hours. Example:
					Su 	M 	T	W 	Th 	F 	Sa
		Employee 0 	2	4	3	4	5	8	8
		Employee 1 	7	3	4	3	3	4	4
		Employee 2 	3	3	4	3	3	2	2
		Employee 3 	9	3	4	7	3	4	1
		Employee 4 	3	5	4	3	6	3	8
		Employee 5 	3	4	4	6	3	4	4
		Employee 6 	3	7	4	8	3	8	4
		Employee 7 	6	3	5	9	2	7	9
	 * 
	 * 
	 * @param array int[][]
	 */
	public static void printEmployeeWeeklyHours(int[][] array){
		System.out.println("            \tSu\tM\tT\tW\tTh\tF\tSa\tTotal Hours");
		
		for(int employee=0;employee<array.length;employee++){//the indexes of the subarrays are the employees
			System.out.print("Employee "+employee+"\t");//print the employee, and its hours:
			
			for(int day=0;day<array[0].length;day++){//the indexes of the subarrays' elements are the hours per days
				System.out.print(array[employee][day]+"\t");//hours per day
			}
			System.out.print(sumArrayElements(array[employee]));//print their total weekly hours
			System.out.println();//go to next line to print another employee
		}
	}
	
	public static void main(String[] args) {
		//the weekly hours for all employees are stored in a two-dimensional array 
		//(for Employee 0 they are in weeklyHours[0]; weeklyHours[0][day] day-begins with Sunday-0 to Saturday-6)
		int[][] weeklyHours = {{2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2},{9,3,4,7,3,4,1},
				{3,5,4,3,6,3,8},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{6,3,5,9,2,7,9}};
		
		//print the employee weekly hours sorted in decreasing order by the sum of the weekly hours
		printEmployeeWeeklyHours(sortByRowSumDecreasing(weeklyHours));
			
	}
}
