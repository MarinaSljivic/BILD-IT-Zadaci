package zadaci_27_07_2015;

import extrapackage.Numbers;

/*	Napisati program koji pita korisnika da unese cijeli broj za današnji dan u sedmici 
 * (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon današnjeg dana te mu ispiše koji je
 * to dan u buduænosti. (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u buduænosti 
 * program mu ispisuje da je danas utorak a dan u buduænosti je petak.)*/

/**
 * @author Marina Sljivic
 *
 */
public class DayInTheFuture {
	
	/**
	 * Asks the user to enter an integer for the current day of the week
	 * and another integer that represents the days we have to add to the first entered day.
	 * When we add the days, the method prints what day turns out (the future day).
	 */
	static void printTheDay(){
		System.out.println("Enter an integer for the current day of the week (0 for Monday, 1 for Tuesday,..., 6 for Sunday): ");
		//today will contain the value of the entered day
		//using the helper method from the helper class Numbers
		int today = Numbers.inputPositiveIntegerZeroIncluded();
		
		while(today>6){ //while the day is not in range 0-6 keep asking to enter a day
			System.out.println("Try again, that day doesn't exist. Hint: there are 7 days, enter a number from 0 to 6.");
			today = Numbers.inputPositiveIntegerZeroIncluded();
		}
		
		//print to enter the days the user wants to add
		System.out.println("Enter an integer that represents the days you want to add to the first entered day: ");
		//this are the days that we have to add to today to see what is the future day
		int daysToAdd = Numbers.inputPositiveIntegerZeroIncluded();
		
		int futureDay = (today + daysToAdd) % 7;//add to today the daysToAdd and because the week has 7 days, divide by 7
		//to see the rest, that rest is the future day.
		
		//an array containing the week's days in order from 0 to 6 like we asked the user to enter
		String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		//print to the user today and the future day
		System.out.println("Today is "+days[today]+" and the future day is "+days[futureDay]);
		
	}

	public static void main(String[] args) {
		printTheDay();

	}

}
