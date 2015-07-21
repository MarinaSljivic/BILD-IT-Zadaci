package zadaci_20_07_2015;

import java.util.Scanner;

/**
 * @author Marina Sljivic
 * 
 * These program takes a string from the user and returns the number of vowels and consonants in the string
 *
 */
public class VowelsConsonants {

	/**
	 * @param s, a String
	 * @return number of vowels in the String s
	 */
	public static int numberOfVowels(String s){
		int countVowels = 0; //set the number of vowels to 0

		char[] arrayVowels = { 'A', 'E', 'I', 'O', 'U' };
		
		for (int i = 0; i < s.length(); i++) { //through every char in the entered string (i will call it i-char)
			
			for (char c : arrayVowels) { 
				// if the i-char equals to a vowel in the arrayVowels 
				// (c or c+32, see the ascii table: A or A+32=a)
				if (s.charAt(i) == c || s.charAt(i) == c + 32) {
					countVowels++; //enlarge for one the number of vowels
				}
			}
		}
		return countVowels;
	}
	
	/**
	 * @param s, a String
	 * @return number of other char(that are not vowels or consonants) in the String s
	 */
	public static int numberOfOthers(String s){
		int countOthers = 0; //set the number of other characters(that are not vowels or consonants) to 0
		
		for (int i = 0; i < s.length(); i++) { //through every char in the entered string (i will call it i-char)
			// if the i-char equals to a char that is not a vowel or a consonant
			// (see the ascii table)
			if (s.charAt(i) < 65
					|| (s.charAt(i) > 90 && s.charAt(i) < 97)
					|| s.charAt(i) > 122) {
				countOthers++; // enlarge for one the number of others
			}
		}
		return countOthers;
	}
	
	/**
	 * @param s, a String
	 * @return number of consonants in the String s
	 */	
	public static int numberOfConsonants(String s){
		//the number of consonants is the size of the string - vowels - others
		return s.length() - numberOfVowels(s) - numberOfOthers(s);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter a string: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine(); //take the string form the user

		System.out.println("Vocals: " + numberOfVowels(input) + "\tConsonants: "
				+ numberOfConsonants(input));
		
		scan.close();

		// tested string: "adfcnefoiw34  AA2DD243i210-2wdf';[lk"
	}

}
