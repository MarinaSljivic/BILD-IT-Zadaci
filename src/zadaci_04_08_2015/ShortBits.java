package zadaci_04_08_2015;

import extrapackage.Numbers;
import zadaci_03_08_2015.IntegerToBinary;

/* U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji pita korisnika da unese short broj 
 * te mu ispiše svih 16 bita za dati cijeli broj. 
 * Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje 0000000000000101*/

/**
 * @author Marina Sljivic
 *
 */
public class ShortBits {

	/**
	 * @param number short
	 * @return a String that represents the binary code (16 bits) for the number
	 */
	public static String convertToBinary(short number){
		String bits = IntegerToBinary.convert(number);//use the method to convert an integer to binary
		
		if (bits.length()>16){//if the length of the binary string is bigger than 16
			return bits.substring(bits.length()-16, bits.length());//return a substring, the last 16 digits
		}else if (bits.length()<16){//else if its smaller than 16 we have to add some '1' or '0'
			if(number<0){//if its negative
				while(bits.length()<16){//while the length is smaller than 16
					bits = '1'+bits;//add so much '1' to have the length 16
				}
			}else{
				while(bits.length()<16){//else if its 0 or positive, while the length is smaller than 16
					bits = '0'+bits;//add so much '0' to have the length 16
				}
			}
			return bits;//now return it
		}else{
			return bits;//else if the length is 16 just return it
		}
	}
	public static void main(String[] args) {
		//ask the user to enter the input and take it using the helper method for inputs
		System.out.println("Enter a short number: ");
		short number = Numbers.inputShort();
		
		//print the 16 bits
		System.out.println("The 16 bits: "+convertToBinary(number));
	}

}
