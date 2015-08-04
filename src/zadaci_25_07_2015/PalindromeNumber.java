package zadaci_25_07_2015;

import extrapackage.Numbers;

/*Napisati metode sa sljedeæim headerima: public static int reverse(int number) i 
 * public static boolean isPalindrome(int number). Prva metoda prima cijeli broj kao argument i 
 * vraæa isti ispisan naopako. (npr. reverse(456) vraæa 654.) Druga metoda vraæa true ukoliko je broj 
 * palindrom a false ukoliko nije. Koristite reverse metodu da implementirate isPalindrome metodu. 
 * Napišite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne.*/


/**
 * @author Marina Sljivic
 *
 */
public class PalindromeNumber {
	
	/**
	 * Takes an integer as parameter and returns its reverse number.
	 * 
	 * @param number int
	 * @return the number in reverse
	 */
	public static int reverse(int number){
		String numberString = ""+number; //make the value of the number as string
		String reverseNumber = ""; //set a string that will be the reverse
		
		for(int i=numberString.length()-1;i>=0;i--){ 
			//i is the index of the chars in the string, its from the numberString's length to 0
			reverseNumber+=numberString.charAt(i); //reverseNumber takes the chars of numberString in reverse order
		}
		//return the reversed number, but as int, so we have to use the Integer.parseInt()
		return Integer.parseInt(reverseNumber); 
	}
	/**
	 * Takes an integer and returns if its a palindrome or not.
	 * 
	 * @param number int
	 * @return true if the number is a palindrome, false if its not.
	 */
	public static boolean isPalindrome(int number){
		if(number == reverse(number)){ //if the number is equal to its reversed number
			return true; //then return true, its a palindrome
		}else{
			return false; //else it's not so return false
		}
	}
	
	public static void main(String[] args) {

		//the method for the user's inputs is used from the helper class
		System.out.println("Enter an integer: ");
		int number = Numbers.inputPositiveInteger();
		
		if(isPalindrome(number)){ //is the entered number is a palindrome print that
			System.out.println("The number you entered is a palindrome.");
		}else{ //else print its not
			System.out.println("The number you entered isn't a palindrome.");
		}
	}

}
