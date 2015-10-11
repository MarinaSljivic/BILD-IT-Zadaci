package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/*(Combine two lists) Write a method that returns the union of two array lists of
integers using the following header:
public static ArrayList<Integer> union(
ArrayList<Integer> list1, ArrayList<Integer> list2)
For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
{2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
each with five integers, and displays their union. The numbers are separated by
exactly one space in the output.
*/

/**
 * @author Marina Sljivic
 *
 */
public class CombineTwoLists {
	
	/**
	 * @param list1
	 * @param list2
	 * @return a list that represents the union of list1 and list2
	 */
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		//the union list = list1, then add all the elements of list2
		ArrayList<Integer> unionList = list1;
		unionList.addAll(list2);
		return unionList;
	}
	public static void main(String[] args) {
		//create the two lists and add to it the inputed the numbers
		Scanner scan = new Scanner(System.in);
		try{
			ArrayList<Integer> list1 = new ArrayList<>();
			System.out.print("Enter five integers for the first list: ");
			for(int i=0;i<5;i++){
				list1.add(scan.nextInt());
			}
			ArrayList<Integer> list2 = new ArrayList<>();
			System.out.print("Enter five integers for the second list: ");
			for(int i=0;i<5;i++){
				list2.add(scan.nextInt());
			}

			//print the union of the two lists
			System.out.print("\nThe combined list is: ");
			for(int i : union(list1,list2)){
				System.out.print(i+" ");
			}
		}catch(Exception e){
			System.out.println("Invalid number.");
		}
		scan.close();
	}

}
