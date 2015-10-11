package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Random;

/*(Shuffle ArrayList) Write the following method that shuffles the elements in
an ArrayList of integers.
public static void shuffle(ArrayList<Integer> list)*/

/**
 * @author Marina Sljivic
 *
 */
public class ArrayListShuffle {
	
	/**
	 * Shuffles the elements in an ArrayList of integers.
	 * @param list ArrayList of Integers
	 */
	public static void shuffle(ArrayList<Integer> list){
		//create a Random object
		Random random = new Random();
		
		//for every element in the list at index i, replace its 
		//position with the element at index randomIndex
		for(int i=0; i<list.size(); i++){
			//generates a number from 0 to the list.size()-1
			int randomIndex = random.nextInt(list.size());
			
			//copy the element at index i
			Integer elementAtI = list.get(i);
			
			//get the element at randomIndex and add it at index i
			list.add(i, list.get(randomIndex));
			//as the other elements shifts to the right
			//if we don't remove the elements our list'size would grow infinitely
			//so remove the i+1 (we have copied it in elementAtI)
			list.remove(i+1);
			//add at randomIndex the one that was the elementAtI
			list.add(randomIndex, elementAtI);
			//and remove the old element
			list.remove(randomIndex+1);
		}
	}
	
	public static void main(String[] args) {
		//list of integers
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		listInt.add(-3);
		listInt.add(-1);
		listInt.add(-2);
		listInt.add(1);
		listInt.add(2);
		listInt.add(-4);
		
		//print the list before the shuffle
		System.out.println(listInt);
		
		//shuffle the integers
		shuffle(listInt);
		
		//print the list after shuffle
		System.out.println(listInt);
	}

}
