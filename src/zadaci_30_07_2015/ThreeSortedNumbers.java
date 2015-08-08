package zadaci_30_07_2015;

import extrapackage.Numbers;

/* Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše ta ista tri broja u rastuæem redosljedu. 
 * Bonus: Napisati metodu koja prima tri cijela broja kao argumente te vraæa brojeve u rastuæem redosljedu.*/

/**
 * @author Marina Sljivic
 *
 */
public class ThreeSortedNumbers {
	
	/**
	 * 
	 * This method takes as parameters three integers, sorts them and prints them sorted.
	 * 
	 * @param num1 int
	 * @param num2 int
	 * @param num3 int
	 */
	public static void displaySortedNumbers(int num1, int num2, int num3){
		if(num1>num2){ //if the first number is bigger than the second
			int temp = num1; //replace their values
			num1 = num2;
			num2 = temp;
		} //else they are sorted
		//now the values of the first and the second may be replaced or not
		if(num1>num3){ //if the first number is bigger than the third
			int temp = num1; //replace their values 
			num1 = num3;
			num3 = temp;
		}//else they are sorted
		//now the values of the first and the third may be replaced or not
		if(num2>num3){ //if the second number is bigger than the third
			int temp = num2; //replace their values
			num2 = num3;
			num3 = temp;
		}//else they are sorted
		//now the values of the second and the third may be replaced or not
		
		System.out.println("Sorted: "+num1+", "+num2+", "+num3); //print the numbers sorted
	}
	public static void main(String[] args) {
		System.out.println("Enter three integers: ");
		//we pass as argument the users input using the helper method from Numbers class
		displaySortedNumbers(Numbers.inputInteger(), Numbers.inputInteger(), Numbers.inputInteger());
	}

}
