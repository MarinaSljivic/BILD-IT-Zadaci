package zadaci_03_08_2015;

import extrapackage.Numbers;

/* Napišite program koji pita korisnika da unese cijeli broj i ispiše njegov ekvivalent 
 * u binarnom kodu. Za ovaj program NE smijemo koristiti Integer.toBinaryString(int) metodu.*/

/**
 * @author Marina Sljivic
 *
 */
public class IntegerToBinary {
	/**
	 * @param number an integer bigger than 0
	 * @return a String that represents the binary code of that number
	 */
	private static String convertPositive(int number) {
		String binary = ""; //this String will contain the binary code in reverse of the number
		while(number!=0){//while the number is not 0
			binary += number%2; //add to the binary string the rest of dividing the number by 2
			number /= 2; //divide the number by 2
		}
		return ReverseString.reverse(binary);//return the reverse of binary string
	}

	/**
	 * @param number an integer lower than 0
	 * @return a String that represents the binary code of that number
	 */
	private static String convertNegative(int number){
		String binary = "";//this String will contain the binary code of the number
		String complement = convertPositive(-number-1);//find the positive binary complement, the complement of 0 is -1
		//the complement of 1 is -2...
		
		while(binary.length() < (32-complement.length())){//the length of binary has to be 32: 
			//so first add the '1' at the begin, there would be 32 minus the length of the complement 'jedinica'
			binary += '1'; 
		}
		
		for(int i=0; i<complement.length(); i++){//and second add 'the complement' of the complement
			if(complement.charAt(i)=='0'){//if the char of the complement is '0'
				binary += '1';//add '1' to binary
			}else{
				binary += '0'; //else add '0'
			}
		}		
		//now binary'a length is 32
		return binary; //return binary
	}
	
	/**
	 * @param number int
	 * @return a String that represents it's binary code
	 */
	public static String convert(int number){
		if(number<0){ //if the number is less than 0
			return convertNegative(number); //use the method to convert a negative number
		}else if(number==0){//if it is 0 then return 0
			return "0";
		}else{//else use the method to convert a positive number
			return convertPositive(number);
		}
	}
	
	public static void main(String[] args) {
		//ask the user to enter an integer and take it using helper method for inputs
		System.out.println("Enter an integer: ");
		int number = Numbers.inputInteger();
		//print the binary code
		System.out.println("The binary code is: "+convert(number));
	}

}
