package zadaci_14_08_2015;

import java.math.BigInteger;
import java.util.ArrayList;

/*(Large prime numbers) Write a program that finds five prime numbers larger
than Long.MAX_VALUE.*/

/**
 * @author Marina Sljivic
 *
 */
public class LargePrimeNumbers {

	/**
	 * Returns the first 5 prime numbers bigger than Long.MAX_VALUE<br>
	 * 
	 * @return an arrayList with that 10 bigInteger
	 */
	public static ArrayList<BigInteger> find5BiggerThanLong(){
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();//to store the ten numbers
		
		BigInteger number = new BigInteger(Long.MAX_VALUE+"");
		//set the number to Long.MAX_VALUE
		
		while(list.size()<5){//while we have not the 5 numbers
			
			list.add(number.nextProbablePrime()); //add the next probable prime number bigger than number
			
			number = number.nextProbablePrime();//number becomes the next probable prime number			
		}
		return list;//return the list with the 5 numbers
	}
	
	public static void main(String[] args) {
		//print the 5 numbers
		System.out.println("The first five prime numbers bigger than "+Long.MAX_VALUE
				+": \n"+find5BiggerThanLong());

	}

}
