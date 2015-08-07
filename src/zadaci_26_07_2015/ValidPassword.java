package zadaci_26_07_2015;

import java.util.Scanner;

/* Neke web stranice forsiraju odreðena pravila za passworde. 
 * 
 * Napisati metodu koja provjerava da li je unijeti string validan password. 
 * Pravila da bi password bio validan su sljedeæa: 
 * 		1. Password mora biti saèinjen od najmanje 8 karaktera. 
 * 		2. Password smije da se sastoji samo od slova i brojeva. 
 * 		3. Password mora sadržati najmanje 2 broja. 
 * Napisati program koji pita korisnika da unese password te mu ispisuje "password je validan" 
 * ukoliko su sva pravila ispoštovana ili "password nije validan" ukoliko pravila nisu ispoštovana.*/

/**
 * @author Marina Sljivic
 *
 */
public class ValidPassword {
	
	//errorMsg contains a string that represents the error in the entered password
	//(the explanation why the password isn't valid)
	static String errorMsg;
	
	//setter and getter for the error message
	public static String getErrorMsg() {
		return errorMsg;
	}

	public static void setErrorMsg(String msg) {
		errorMsg = msg;
	}

	/**
	 * Given a String-password, this method checks if the length is valid:
	 * if its equal or greater than 8 returns true
	 * if its lower than 8 returns false and sets the error message (errorMsg).
	 * 
	 * @param password String
	 * @return a boolean: true if the length of the password is valid, false if its not
	 */
	public static boolean isValidLength(String password){
		if(password.length() >= 8){//if the length of the password is equal or greater than 8, the length is valid
			return true; //return true
		}else{//else return false, and set the error message
			setErrorMsg("Invalid length of the password.");
			return false;
		}
	}
	
	/**
	 * Given a String-password, this method checks if it contains only strings and numbers:
	 * if it contains than returns true
	 * if it don't, returns false and sets the error message (errorMsg).
	 * 
	 * @param password String
	 * @return a boolean: true if the characters of the password are valid, false if they are not
	 */
	public static boolean areValidChars(String password){
		//a counter of the valid characters in the string password
		int countValidChars = 0;
		
		for(int i=0;i<password.length();i++){ //i is the index of the chars in the string password
			char c = password.charAt(i); //c is the char in the password at index i
			
			//if c is a number (c>=48 && c<=57) OR 
			//c is an uppercase letter (c>=65 && c<=90) OR 
			//c is a lowercase letter (c>=97 && c<=122)
			if((c>=48 && c<=57) || (c>=65 && c<=90) || (c>=97 && c<=122)){
				countValidChars++; //then increase the counter
			}
		}
		
		//if the number of valid characters is the length of the password (if all chars are valid)
		if(countValidChars == password.length()){
			return true; //then return true
		}else{ //else return false and set the error message
			setErrorMsg("The password must contain only numbers and letters.");
			return false;
		}
	}
	
	/**
	 * Given a String-password, this method checks if it contains two or more numbers:
	 * if it contains than returns true
	 * if it don't, returns false and sets the error message (errorMsg).
	 * 
	 * @param password String
	 * @return a boolean: true if the password contains two or more numbers, false if it don't

	 */
	public static boolean containsTwoNumbers(String password){
		//a counter of how many numbers there are in the password
		int countNumbers=0;
		
		for(int i=0;i<password.length();i++){//i is the index of the chars in the string password
			char c = password.charAt(i); //c is the char in the password at index i
			
			//if c is a number (c>=48 && c<=57)
			if(c>=48 && c<=57){
				countNumbers++;//then increase the counter
			}
		}
		
		//if the number of numbers in the password is equal or greater than 2
		if(countNumbers>=2){
			return true; //then return true
		}else{ //else return false and set the error message
			setErrorMsg("The password must contain at least two numbers.");
			return false;
		}
	}
	
	/**
	 * This method asks the user to enter a password, checks if it is valid and depending on that 
	 * prints the appropriate message.
	 */
	public static void InputAndCheck(){
		Scanner scan = new Scanner(System.in);
		String psw = scan.nextLine(); //take the password value
		
		//if the length of the password is valid, the chars are only numbers and letters
		//and it contains at least two numbers
		if(isValidLength(psw) && areValidChars(psw) && containsTwoNumbers(psw)){
			//print that it is valid
			System.out.println("The entered password is valid.");
		}else{//else print that it is not valid and print the error that happened
			System.out.println("The entered password is not valid. "+getErrorMsg());
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		InputAndCheck();
	}

}
