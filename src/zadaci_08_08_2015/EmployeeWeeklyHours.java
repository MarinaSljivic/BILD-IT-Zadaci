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
	 * This method sorts the sum of hours and the employeesPositions in decreasing order by the sum of the hours for every employees
	 * @param hours int[][] 
	 * @param employeesPositions int[]
	 */
	public static int[] sortByRowSumDecreasing(int[][] hours, int[] employeesPositions){
		
		for(int employee=0;employee<hours.length-1;employee++){ //every employee from 0 to the penultimate
			//we want to compare with the
			for(int i=employee+1;i<hours.length;i++){ //i.th employee from employee+1 to the last
					
				if(sumArrayElements(hours[employee]) < sumArrayElements(hours[i])){
					//if the sum of the hours at smaller index is bigger than the sum
					//of the array at bigger index, replace the hours per employee position and the employees' position
					int[] temp = hours[employee];
					hours[employee] =hours[i];
					hours[i] = temp;
					
					int tempEmpl = employeesPositions[employee];
					employeesPositions[employee] = employeesPositions[i];
					employeesPositions[i] = tempEmpl;
				}
			}
		}
		//return the order of the employees, from the employee with the most hours to the employee with minimum hours
		return employeesPositions;
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
	 * @param hours int[][] which is not sorted
	 * @param employeesPositions int[] which is sorted
	 */
	public static void printEmployeeWeeklyHours(int[][] hours, int[] employeesPositions){
		System.out.println("            \tSu\tM\tT\tW\tTh\tF\tSa\tTotal Hours");
		
		for(int i=0;i<employeesPositions.length;i++){//i is the index for every employee in employeesPositions
			System.out.print("Employee "+employeesPositions[i]+"\t");//print the employee at position i, and its hours:
			
			for(int day=0;day<hours[0].length;day++){ 
				//print the hours per day for every employee
				System.out.print(hours[i][day]+"\t");//hours per day
			}
			System.out.print(sumArrayElements(hours[i]));//print their total weekly hours
			System.out.println();//go to next line to print another employee
		}
	}
	
	public static void main(String[] args) {
		//the weekly hours for all employees are stored in a two-dimensional array 
		//(for Employee 0 they are in weeklyHours[0]; weeklyHours[0][day] day-begins with Sunday-0 to Saturday-6)
		int[][] weeklyHours = {{2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2},{9,3,4,7,3,4,1},
				{3,5,4,3,6,3,8},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{6,3,5,9,2,7,9}};
		int[] employeesPositions = {0,1,2,3,4,5,6,7};//the array with the employees' numbers
		
		//print the employee weekly hours sorted in decreasing order by the sum of the weekly hours
		printEmployeeWeeklyHours(weeklyHours,sortByRowSumDecreasing(weeklyHours,employeesPositions));
			
	}
}
