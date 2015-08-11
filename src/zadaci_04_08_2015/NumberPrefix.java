package zadaci_04_08_2015;

/* Napisati metodu sa sljedeæim headerom: public static String format(int number, int width) 
 * koja vraæa string broja sa prefiksom od jedne ili više nula. Velièina stringa je width argument. 
 * Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vraæa 0034, ukoliko pozovemo format(34, 5) 
 * metoda vraæa 00034. Ukoliko je uneseni broj veæi nego width argument, metoda vraæa samo string broja. 
 * Npr. ukoliko pozovemo format(34, 1) metoda vraæa 34.*/

/**
 * @author Marina Sljivic
 *
 */
public class NumberPrefix {

	public static String format(int number, int width){
		String stringFormatNumber = ""+number;//this string has the value of the number
		
		if(width>stringFormatNumber.length()){//if the width is bigger than the length of the number
			while(width>stringFormatNumber.length()){//while the width is bigger
				stringFormatNumber = "0"+stringFormatNumber;//add '0' to the string as prefix
			}//will finish when their length becomes the same
		}//else do nothing if the width is equal or smaller than the length of the number
		
		return stringFormatNumber;//return the string that contains the number
	}
	
	public static void main(String[] args) {
		System.out.println(format(34,6));//test the method
	}

}
