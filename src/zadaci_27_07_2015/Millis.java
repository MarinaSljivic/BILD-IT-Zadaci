package zadaci_27_07_2015;

/* Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. Metoda treba da koristi sljedeæi header: 
 * public static String convertMillis(long millis). 
 * Metoda treba da vraæa vrijeme kao string u formatu sati:minute:sekunde.  
 * Na primjer convertMillis(100000) treba da vrati 0:1:40*/

/**
 * @author Marina SljivicT
 *
 */
public class Millis {

	/**
	 * This method converts milliseconds to hours-a string in format HH:MM:SS.
	 * 
	 * @param milliseconds long
	 * @return a string that represents the converted milliseconds in hours in format HH:MM:SS
	 */
	public static String convertMillis(long milliseconds){
		//calculate hours, minutes and seconds
		int seconds = (int) (milliseconds / 1000) % 60 ;
		int minutes = (int) ((milliseconds / (1000*60)) % 60);
		int hours   = (int) ((milliseconds / (1000*60*60)) % 24);
		
		//return the string in format HH:MM:SS that represents the converted millis in hours
		return hours+":"+minutes+":"+seconds;
		
	}
	
	public static void main(String[] args) {
		System.out.println(convertMillis(100000));//test the method
	}

}
