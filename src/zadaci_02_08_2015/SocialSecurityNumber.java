package zadaci_02_08_2015;

import java.util.Scanner;

/* Napisati program koji pita korisnika da unese Social Security Number (SSN) 
 * u formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da provjerava 
 * da li je broj unesešen u ispravnom formatu. Ukoliko nije, program pita korisnika 
 * da pokuša ponovo. Ukoliko jeste unešen u pravom formatu, program završava sa radom.*/

/**
 * @author Marina Sljivic
 *
 */
public class SocialSecurityNumber {

	/**
	 * @param userSSN a String
	 * @return a boolean that says if the string matches the format "DDD-DD-DDDD" where 'D' is a number 0-9
	 */
	private static boolean matches(String userSSN) {
		try{
			if(userSSN.charAt(3)=='-' && userSSN.charAt(6)=='-'){//if at index 3 and 6 the string has '-'
				//then try to parseInt the string without the '-'
				Integer.parseInt(userSSN.substring(0, 3)+userSSN.substring(4, 6)+userSSN.substring(7, 11));
				//if this doesn't pass then an exception occured
			}else{
				return false;//else if the string doesn't have the '-' at the right position, return false
			}
		}catch(Exception e){//catch the exception
			return false; //return false
		}
		
		return true;//if the parseInt happens without errors, return true
	}

	public static void main(String[] args) {
		//ask the user to enter the SSN, and take it
		System.out.println("Enter the SSN: ");
		Scanner scan = new Scanner(System.in);
		String userSSN = scan.nextLine();
		
		while(!matches(userSSN)){ //while the SSN doesn't match the right format keep asking the user to input it again
			System.out.println("Wrong format. Try again, enter the SSN in format 'DDD-DD-DDDD': ");
			userSSN = scan.nextLine();
		}
		scan.close();
	}
}
