package zadaci_24_07_2015;

import java.util.Scanner;

/*Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi header: 
 * public static int countLetters(String s).
 * Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj string ima slova.*/

/**
 * @author Marina Sljivic
 *
 */
public class StringLetterCounter {
	
	/**
	 * This method takes as parameter a string and returns an integer that rapresents how many letters it has.
	 * 
	 * @param s a string
	 * @return the number of letters the string has, type int
	 */
	public static int countLetters(String s){
		int counter=0; //set the counter of how many letters the string has to 0
		for(int i=0;i<s.length();i++){ //we need to go through every character of the string, so "i" is from 0 to the length
			char c = s.charAt(i); //c is the character at index i
			if(c<=90 && c>=65 || c<=122 && c>=97){ //if c is between 65-90 or 97-122 than its a letter (see ascii code)
				counter++;//then increase the counter
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence: "); //ask the user to enter the first string
		String sentence = scan.nextLine(); //take the first string
		
		//print how many letters the string has invoking the method to count them
		System.out.println("The sentence you entered has "+countLetters(sentence)+" letters.");

	}

}
