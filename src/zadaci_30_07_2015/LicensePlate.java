package zadaci_30_07_2015;

import java.util.Random;

/* Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase karaktera
 * i 4 broja u sljedeæem formatu AAA-1234. Napisati program koji nasumièno generiše tablicu.*/

/**
 * @author Marina Sljivic
 *
 */
public class LicensePlate {
	
	/**
	 * @return a string that contains three random generated chars
	 */
	public static String generate3Chars(){
		String threechars="";//this will hold the 3 random generated chars
		
		for(int i=0;i<3;i++){//for three times
			Random random = new Random(System.nanoTime());//create a new Random object
			int asciiNumber = random.nextInt(26)+65; //we want to random generate an upper char, 
			//in ASCII code they are from number 65 to 90 (we have 26 chars),
			//so generate a number between 0 and 25 from wich depends 
			//what char is generated and then add 65.
			threechars += (char)asciiNumber;//cast the asciiNumber to the char and add it to the string
		}
		return threechars;
	}
	
	/**
	 * @return a string that contains four random generated numbers
	 */
	public static String generate4Numbers(){
		String fourchars="";//this will hold the 4 random generated numbers
		
		for(int i=0;i<4;i++){//for four times
			Random random = new Random(System.nanoTime());//create a new Random object
			int number = random.nextInt(10);//generate a number in range 0-9
			fourchars += number;//add the number to the string
		}
		return fourchars;
	}
	
	public static void main(String[] args) {
		//the licence plate is 3chars one line '-' and four numbers
		String plate=generate3Chars()+"-"+generate4Numbers();
		//print the plate
		System.out.println(plate);
	}

}
