package zadaci_04_08_2015;

import extrapackage.Numbers;

/* Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te ispisuje koji je to karakter. 
 * Na primjer, ukoliko korisnik unese 69 kao ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E*/

/**
 * @author Marina Sljivic
 *
 */
public class AsciiChar {

	public static void main(String[] args) {
		//ask the user to enter the ascii code and take it using the helper method for inputs
		System.out.println("Enter an integer-ASCII code (0-127):");
		int number = Numbers.inputPositiveIntegerZeroIncluded();
		
		//while the number is not in range ask to try to input again
		while(number>127){
			System.out.println("Wrong input. Try again.");
			number = Numbers.inputPositiveIntegerZeroIncluded();
		}
		
		//print the char that corresponds to that ascii value
		System.out.println(number+ " in ASCII code is the character "+(char)number);
	}

}
