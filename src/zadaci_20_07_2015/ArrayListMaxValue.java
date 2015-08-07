package zadaci_20_07_2015;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Marina Sljivic
 *
 */
public class ArrayListMaxValue {

	/**
	 * This method takes as parameter an ArrayList of Integers and returns the
	 * max value in the list if the list isn't empty or null, otherwise it
	 * returns null
	 * 
	 * @param list
	 * @return max value in the list
	 */
	public static Integer max(ArrayList<Integer> list) {
		Integer maxValue = null; // set the max value to null
		try { // try-catch block because in case the list is null
			if (list.size() != 0 && list != null) { // if the list size is not 0 and the list is not null
				Collections.sort(list); //then sort the list
				maxValue = list.get(list.size() - 1); //the max value is the last element of the list after sorting
			}
		} catch (NullPointerException e) {
			e.getStackTrace();
		}
		return maxValue; //return the max value
	}

	public static void main(String[] args) {
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		// test when the list size is 0
		System.out.println("Max value in the list is " + max(listInt));

		listInt.add(-3);
		listInt.add(-1);
		listInt.add(-2);
		listInt.add(1);
		listInt.add(2);
		listInt.add(-4);
		// test when the list contains numbers
		System.out.println("Max value in the list is " + max(listInt));

		listInt=null;
		// test when the list is null
		System.out.println("Max value in the list is " + max(listInt));

	}

}
