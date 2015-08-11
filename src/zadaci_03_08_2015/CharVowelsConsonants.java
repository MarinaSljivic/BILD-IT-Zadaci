package zadaci_03_08_2015;

import java.util.Scanner;

import zadaci_20_07_2015.VowelsConsonants;

/* Napisati program koji pita korisnika da unese slovo te provjerava da li je unijeti karakter 
 * samoglasnik ili suglasnik. Na primjer, ukoliko korisnik unese B, program vraæa da je dati 
 * karakter suglasnik. Ukoliko unese A, program vraæa da je dati karakter samoglasnik.*/

/**
 * @author Marina Sljivic
 *
 */
public class CharVowelsConsonants {

	public static void main(String[] args) {
		//asks the user to enter a letter and takes it
		System.out.println("Enter a letter: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		if(input.length()>1){//if the users enters more than one character
			System.out.println("That's more than one letter.");//print the error
		}else{//else we can test the char
			//print if the letter is a vowel or a consonant
			System.out.println("The char is a "+vowelOrConsonant(input));
		}
		scan.close();
	}

	/**
	 * @param input String (which length is 1, just one character)
	 * @return a string: "vowel" if the char is a vowel, "consonant" if the char is a consonant
	 */
	public static String vowelOrConsonant(String input) {
		//using methods from class VowelsConsonants
		if(VowelsConsonants.numberOfVowels(input)==1){//if the input has one vowel
			return "vowel";//it's a vowel, so return that
		}else if(VowelsConsonants.numberOfConsonants(input)==1){//if the input has one consonant
			return "consonant";//it's a consonant, so return that
		}else{//else it's not a letter and return that
			return "non-letter char";
		}
	}

}
