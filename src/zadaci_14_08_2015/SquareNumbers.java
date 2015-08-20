package zadaci_14_08_2015;

import java.math.BigInteger;
import java.util.ArrayList;

/*(Square numbers) Find the first ten square numbers that are greater than
Long.MAX_VALUE. A square number is a number in the form of n2
. For example,
4, 9, and 16 are square numbers. Find an efficient approach to run your
program fast.*/

/**
 * @author Marina Sljivic
 *
 */
public class SquareNumbers {

	/**
	 * Returns the first 10 square numbers bigger than Long.MAX_VALUE<br>
	 * 
	 * @return an arrayList with that 10 bigInteger
	 */
	public static ArrayList<BigInteger> find10BiggerThanLong(){
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();//to store the ten numbers
		
		BigInteger rootNumber = new BigInteger(Math.round(Math.sqrt(Long.MAX_VALUE))+"");
		//set the root number to the closest long square-root of Long.MAX_VALUE
		
		while(list.size()<10){//while we have not the 10 numbers
			
			list.add(rootNumber.multiply(rootNumber)); //add it to the list
			
			rootNumber = rootNumber.add(BigInteger.ONE);//increase for one the number			
		}
		return list;//return the list with the 10 numbers
	}
	
	public static void main(String[] args) {
		//print the 10 numbers
		System.out.println("The first ten square numbers bigger than "+Long.MAX_VALUE
				+": \n"+find10BiggerThanLong());	
	}


}
