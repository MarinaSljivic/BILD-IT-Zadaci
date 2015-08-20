package zadaci_14_08_2015;

import java.math.BigInteger;
import java.util.ArrayList;

/*(Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE
that are divisible by 5 or 6.*/

/**
 * @author Marina Sljivic
 *
 */
public class DivisibleBy5or6 {
	
	/**
	 * Returns the first 10 numbers bigger than Long.MAX_VALUE that are divisible by 5 or 6<br>
	 * 
	 * @return an arrayList with that 10 bigInteger
	 */
	public static ArrayList<BigInteger> find10BiggerThanLong(){
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();//to store the ten numbers
		
		BigInteger number = new BigInteger(Long.MAX_VALUE+"");//set the number value to Long.MAX_VALUE
		
		while(list.size()<10){//while we have not the 10 numbers
			number = number.add(new BigInteger(1+""));//increase for one the number to be bigger than Long.MAX_VALUE
			
			if(number.mod(new BigInteger(5+"")).compareTo(new BigInteger(0+"")) == 0 //if the number is divisible by 5
					|| number.mod(new BigInteger(6+"")).compareTo(new BigInteger(0+"")) == 0){//or by 6
				
				list.add(number); //add it to the list
			}
			
		}
		
		return list;//return the list with the 10 numbers
	}
	public static void main(String[] args) {
		//print the 10 numbers
		System.out.println("The first ten numbers bigger than "+Long.MAX_VALUE
				+" that are divisible by 5 or 6 are: \n"+find10BiggerThanLong());

	}

}
