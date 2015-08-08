package zadaci_31_07_2015;

import extrapackage.Numbers;

/* Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj koji joj je proslijeğen
 * kao argument: public static void reverse(int number). Na primjer, reverse(3456) treba da vrati 6543. 
 * Napisati program koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako.*/

/**
 * @author Marina Sljivic
 *
 */
public class ReverseNumbersOrder {

	/**
	 * This method takes as parameter an integer and returns it in reverse order.
	 * 
	 * @param number int
	 * @return number int in reverse order
	 */
	public static int reverse(int number){
		String s=""+number;//add the value of number to a string
		String numberReverse="";//this will contain the reverse number
		for(int i=s.length()-1;i>=0;i--){ //"i" is the index of the string "s" elements, it starts from the last index
			// and goes to the first, so we add to numberReverse the number in reverse order
			numberReverse += s.charAt(i);
		}
		return Integer.parseInt(numberReverse);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter an integer: ");
		//print in reverse the inputed number, using the helper method for user's input
		System.out.println("In reverse order: "+reverse(Numbers.inputPositiveInteger()));
	}

}
