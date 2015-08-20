package zadaci_14_08_2015;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/*(Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are
divisible by 2 or 3.*/

/**
 * @author Marina Sljivic
 *
 */
public class DivisibleBy2Or3 {
	
	/**
	 * Returns the first 10 numbers with 50 decimal digits that are divisible by 2 or 3<br>
	 * 0.000...02, 0.000...03, 0.000...04, 0.000...06, ... (all with 50 decimals)
	 * 
	 * @return an ArrayList with 10 BigDecimal numbers with 50 decimal digits that are divisible by 2 or 3
	 */
	public static ArrayList<BigDecimal> find10NumbersWith50Decimals(){
		ArrayList<BigDecimal> list = new ArrayList<BigDecimal>();//to store the ten numbers
		int n = 1;
		
		while(list.size()<10){//while we have not the 10 numbers
			if(n%2==0 || n%3==0){ //if n is divisible by 2 or by 3
				BigDecimal number = new BigDecimal(n+""); //make of number a BigDecimal
				number = number.movePointLeft(50); //move the point so number is the 50. decimal
				list.add(number);//add the number to the list
			}
			n++;//increase n
		}
		
		return list;//return the list with ten numbers
	}
	
	/**
	 * Returns the first 10 numbers with 50 digits that are divisible by 2 or 3<br>
	 * 
	 * @return an arrayList with that 10 bigInteger
	 */
	public static ArrayList<BigInteger> find10NumbersWith50Digits(){
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();//to store the ten numbers
		
		BigInteger number = new BigInteger(1+"");//set the number value to '1'
		for(int i=0;i<49;i++){
			number = number.multiply(new BigInteger(10+""));//add 49 zeros to number '1'
		}
		
		//now number is the first number with 50 digits '1000...0'
		
		while(list.size()<10){//while we have not the 10 numbers
			
			if(number.mod(new BigInteger(2+"")).compareTo(new BigInteger(0+"")) == 0 //if the number is divisible by 2
					|| number.mod(new BigInteger(3+"")).compareTo(new BigInteger(0+"")) == 0){//or by 3
				
				list.add(number); //add it to the list
			}
			
			number = number.add(new BigInteger(1+""));//increase for one the number
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		//print the numbers
		System.out.println("First 10 numbers with 50 decimal digits that are divisible by 2 or 3\n"
				+find10NumbersWith50Decimals());
		
		System.out.println("The first 10 numbers with 50 digits that are divisible by 2 or 3\n"
				+find10NumbersWith50Digits());
	}

}
