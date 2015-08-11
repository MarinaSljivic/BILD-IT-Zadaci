package zadaci_04_08_2015;

import java.util.ArrayList;

import extrapackage.Numbers;

/* Napisati program koji uèitava 10 brojeva te ispisuje koilko je jedinstvenih brojeva unijeto te sve 
 * jedinstvene brojeve koji su unijeti, razmaknute jednim spaceom. 
 * Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo jednom.*/

/**
 * @author Marina Sljivic
 *
 */
public class PrintUniqueNumbers {

	public static void main(String[] args) {
		//ask the user to input 10 numbers
		System.out.println("Enter 10 numbers: ");
		
		ArrayList<Double> list= new ArrayList<Double>();//list will contain the inputs
		
		for(int i=0;i<10;i++){//we need ten numbers so ten iterations
			list.add(Numbers.inputDouble());//add the number to the list using helper method for inputs
		}
		
		for(int i=0;i<list.size();i++){//for every number at index 'i' in the list
			if(list.lastIndexOf(list.get(i)) == i){//if i is the last index of that number (to avoid repetition)
				System.out.print(list.get(i)+" ");//print it and a blank space
			}
		}
	}
}
