package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/*(Remove duplicates) Write a method that removes the duplicate elements from
an array list of integers using the following header:
public static void removeDuplicate(ArrayList<Integer> list)
Write a test program that prompts the user to enter 10 integers to a list and displays
the distinct integers separated by exactly one space.*/

/**
 * @author Marina Sljivic
 *
 */
public class RemoveDuplicates {
	
	/**
	 * Removes all the duplicates in this list
	 * @param list
	 */
	public static void removeDuplicate(ArrayList<Integer> list){
		for(int i=0;i<list.size();i++){
			//if i isn't the first and last index of the element
			if( list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i)) ){
				//remove it
				list.remove(list.get(i));
			}
		}
	}
	public static void main(String[] args) {
		//create the list and add to it the inputed the numbers
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Enter ten integers: ");
		try{
			for(int i=0;i<10;i++){
				list.add(scan.nextInt());
			}
			//remove the duplicates and print the list
			removeDuplicate(list);
			System.out.print("\nThe distinct integers are: ");
			for(int i : list){
				System.out.print(i+" ");
			}
		}catch(Exception e){
			System.out.println("Invalid number.");
		}
		scan.close();
	}
}
