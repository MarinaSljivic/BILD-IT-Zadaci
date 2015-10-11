package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/*(Sort ArrayList) Write the following method that sorts an ArrayList of
numbers:
public static void sort(ArrayList<Integer> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays them in increasing order.*/

/**
 * @author Marina Sljivic
 *
 */
public class SortArrayList {

	/**
	 * Sorts an ArrayList of integers.
	 * @param list ArrayList of integers
	 */
	public static void sort(ArrayList<Integer> list){
		for(int i=0;i<list.size()-1;i++){
			for(int j=i+1;j<list.size();j++){
				//if the element at lower index(i) is bigger
				//than the element at bigger index(j)
				//replace their positions
				if(list.get(i) > list.get(j)){
					int temp = list.get(i);
					list.add(i, list.get(j));
					list.remove(i+1);//remove the "old" element that was at position i
					list.add(j, temp);
					list.remove(j+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		//create the list and add to it the inputed the integers
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter five integers: ");
		try{
			for(int i=0;i<5;i++){
				list.add(scan.nextInt());
			}
			//print the list before and after sorting
			System.out.println("The list "+list);
			sort(list);
			System.out.println("The sorted list "+list);
		}catch(Exception e){
			System.out.println("Invalid number.");
		}
		scan.close();
	}

}
