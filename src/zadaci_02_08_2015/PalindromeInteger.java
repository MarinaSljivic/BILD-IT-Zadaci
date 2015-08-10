package zadaci_02_08_2015;

import zadaci_25_07_2015.PalindromeNumber;
import extrapackage.Numbers;

/* Napisati program koji pita korisnika da unese cijeli trocifreni broj te provjerava da li je unijeti broj palindrom. 
 * Broj je palindrom ukoliko se èita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.*/

/**
 * @author Marina Sljivic
 *
 */
public class PalindromeInteger {

	public static void main(String[] args) {
		System.out.println("Enter a three-digit integer: ");
		int number = Numbers.inputPositiveInteger();//take the user's input using helper method for inputs
		
		while((""+number).length() != 3){//while the size of the string(that contains the value of the number) is not 3
			//while the number hasn't three digits
			System.out.println("It's not three-digit. Try again.");//ask to try again with the input
			number = Numbers.inputInteger();
		}
		//using method isPalindrome from another class
		if(PalindromeNumber.isPalindrome(number)){//if the number is a palindrome
			System.out.println("It is a palindrome.");//print that
		}else{//else print it's not
			System.out.println("It is not a palindrome.");
		}
	}

}
