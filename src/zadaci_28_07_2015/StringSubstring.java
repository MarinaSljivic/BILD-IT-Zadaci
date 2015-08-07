package zadaci_28_07_2015;

import java.util.Scanner;

/* Napisati program koji pita korisnika da unese dva stringa te provjerava i ispisuje da li je drugi string
 * substring prvog stringa. Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string 
 * program mu ispisuje da je BC substring ABCD stringa.*/

/**
 * @author Marina Sljivic
 *
 */
public class StringSubstring {

	/**
	 * This method asks the user to enter two strings and checks if the second is a substring of th first.
	 * Then prints out the if it is or if it is not.
	 */
	public static void inputTwoStringsAndCheck(){
		//get the two strings from the user
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first string: ");
		String firstString = scan.nextLine();
		
		System.out.println("Enter the second string: ");
		String secondString = scan.nextLine();
		
		//if the first string contatins the second string, then the second is a substring of the first
		if (firstString.contains(secondString)) {
			//so print that
			System.out.println(secondString + " is a substring of " + firstString);
		}else{ //else print its not
			System.out.println(secondString + " is not a substring of " + firstString);
		}
		
		scan.close();
	}
	public static void main(String[] args) {
		inputTwoStringsAndCheck();
	}
}
