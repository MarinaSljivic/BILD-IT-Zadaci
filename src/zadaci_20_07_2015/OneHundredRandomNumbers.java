package zadaci_20_07_2015;

import java.util.ArrayList;

/**
 * @author Marina Sljivic
 *
 */
public class OneHundredRandomNumbers {
	
	/**
	 * These method takes a list of int numbers and prints out in order the elements of the list
	 * and how many times are they in the list, without repetition
	 * 
	 * @param list a list of Integers
	 */
	public static void printListNice(ArrayList<Integer> list) {
		for(int i=0; i<list.size();i++){
			// if the last index, of the element at index i, is equal to i
			//...
			// better: if we are at the last index of that element then print the element and count it
			if(list.lastIndexOf(list.get(i))==i){
				System.out.println(list.get(i)+" is in the list "+countElement(list, i)+" times");	
			}
		}
	}
	
	/**
	 * @param list of integers
	 * @param index of the element we want to count
	 * @return counter, type int: how many times the element is present in the list
	 */
	public static int countElement(ArrayList<Integer> list, int index){
		int counter=0;
		for(int i=0; i<list.size();i++){ //check every element in the list
			//if an element in the list is equal to the number
			if(list.get(i)==list.get(index)){
				counter++; //then enlarge the counter
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> listRandomNumbers = new ArrayList<Integer>(); // these list will contain the random generated numbers
		for (int i = 0; i < 100; i++) { // one hundred times we have to generate random numbers
			int randomNumber = (int) (Math.random() * 10); // generate a number from 0 to 9
			listRandomNumbers.add(randomNumber); // add to the array the generated number
		}
		printListNice(listRandomNumbers);
	}


}
