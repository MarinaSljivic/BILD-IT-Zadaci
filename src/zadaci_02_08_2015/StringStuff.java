package zadaci_02_08_2015;

import java.util.Scanner;

/* Napisati program koji pita korisnika da unese neki string te mu ispisuje 
 * dužinu tog stringa kao i prvo slovo stringa.*/

/**
 * @author Marina Sljivic
 *
 */
public class StringStuff {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//create scanner object
		System.out.println("Enter a string: ");//ask the user to input a string
		String s = scan.nextLine();//take the input

		System.out.println("The length of the string is "+s.length() //print the length of the string
				+" and its first character is "+s.charAt(0)); //and its first character
		
		scan.close();//close the scanner object
	}

}
