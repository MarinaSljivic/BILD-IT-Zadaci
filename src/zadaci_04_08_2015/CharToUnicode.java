package zadaci_04_08_2015;

import java.util.Scanner;

/* Napisati program koji prima karakter te vraæa njegov Unicode. 
 * Primjer: ukoliko korisnik unese karakter E program mu vraæa 69 kao unicode za taj karakter.*/

/**
 * @author Marina Sljivic
 *
 */
public class CharToUnicode {

	public static void main(String[] args) {
		//ask the user to enter the char and take it
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String character = scan.nextLine();
		while(character.length()!=1){//if the length is not 1 than its not one char
			System.out.println("Wrong input! Thats not one char. Try again:");//tell that to the user and ask to input again
			character = scan.nextLine();
		}
		
		//print the unicode for that char casting the char in the string to int
		System.out.println(character+" the unicode is "+ (int)character.charAt(0));
		scan.close();//close the scan
	}

}
