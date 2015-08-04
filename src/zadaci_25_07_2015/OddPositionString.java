package zadaci_25_07_2015;

import java.util.Scanner;

/*Napisati program koji pita korisnika da unese neki string te mu ispisuje sve karaktere 
 * koji se nalaze na neparnim pozicijama. Na primjer, ako korisnik unese string Beijing Chicago, 
 * program vraæa BiigCiao.*/

/**
 * @author Marina Sljivic
 *
 */
public class OddPositionString {

	/**
	 * This method has as parameter a string(sentence) and returns a new string 
	 * of the entered string's characters at odd position.
	 * 
	 * @param sentence string
	 * @return a new string of the entered string's characters at odd position
	 */
	public static String oddChars(String sentence){
		String oddSentence=""; //this string will have all the characters at odd position
		for(int i=0;i<sentence.length();i++){//i is the index-position of the char
			//for a string "abc" a is at odd position(1st character), b is not(2nd), c is at odd(3rd)
			//but the index-i for a is 0, for b is 1, for c is 2
			//so if the index is even the char is at odd position:
			if(i%2==0){
				oddSentence += sentence.charAt(i); //so add the char to the string
			}
		}
		return oddSentence;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = scan.nextLine(); //take the user's inputed string
		System.out.println("In odd position: "+oddChars(sentence)); //print the entered string's characters at odd position

	}

}
