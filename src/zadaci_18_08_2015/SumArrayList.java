package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/*(Sum ArrayList) Write the following method that returns the sum of all numbers
in an ArrayList:
public static double sum(ArrayList<Double> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays their sum.*/

/**
 * @author Marina Sljivic
 *
 */
public class SumArrayList {

	/**
	 * @param list
	 * @return the sum of all lists elements
	 */
	public static double sum(ArrayList<Double> list){
		double sum = 0;//set the sum to 0
		for(double number : list){
			sum += number;//add to the sum the number
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//create the list and add to it the inputed the numbers
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		System.out.println("Enter five numbers: ");
		try{
			for(int i=0;i<5;i++){
				list.add(scan.nextDouble());
			}
			System.out.println("The sum of all list elements is "+sum(list));
		}catch(Exception e){
			System.out.println("Invalid number.");
		}
		scan.close();

	}

}
