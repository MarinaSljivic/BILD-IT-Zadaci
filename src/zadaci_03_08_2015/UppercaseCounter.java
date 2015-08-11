package zadaci_03_08_2015;

import java.util.Scanner;

/* Napisati program koji pita korisnika da unese neki string te mu vraæa broj uppercase karaktera u unijetom stringu. 
 * Na primjer, ukoliko korisnik unese string "Dobrodošli u Dubai" program mu vraæa da je broj uppercase karaktera 2.*/

/**
 * @author Marina Sljivic
 *
 */
public class UppercaseCounter {

	/**
	 * @param s string
	 * @return an integer that represents how many uppercase letters has the string s
	 */
	public static int count(String s) {
		int counter=0; //set the counter of uppercase letters to 0
		for(int i=0; i<s.length(); i++){//i is the index of chars in s
			if(s.charAt(i)>=65 && s.charAt(i)<=90){//if a char in s is an uppecase letter (in ASCII they are from 65 to 90)
				counter++;//then increase the counter
			}
		}
		return counter;//return the counter
	}
	
	public static void main(String[] args) {
		//asks the user to enter a string and takes it
		System.out.println("Enter a string: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		//print how many uppercase letteres has the inputed string
		System.out.println("The string has "+count(input)+" uppercase letters.");
		scan.close();
		
	}


}
