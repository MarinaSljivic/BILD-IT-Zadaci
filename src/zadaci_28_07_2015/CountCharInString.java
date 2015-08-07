package zadaci_28_07_2015;

import java.util.Scanner;

/* Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u stringu. 
 * Metoda treba da koristi sljedeæi header: public static int count(String str, char a). 
 * Na primjer, ukoliko pozovemo metodu na sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2. 
 * Napisati program koji pita korisnika da unese string i koji karakter želi da prebroji u datom 
 * stringu te mu ispiše koliko se puta odreðeni karakter ponovio u zadatom stringu.*/

/**
 * @author Marina Sljivic
 *
 */
public class CountCharInString {

	/**
	 * @param str a string
	 * @param a a char
	 * @return how many times the char a is repeated in the string str
	 */
	public static int count(String str, char a){
		int count=0;//counts how many times the char a is in the string str
		
		for(int i=0;i<str.length();i++){// i is the index of the characters in the string str
			
			if(str.charAt(i) == a){//if the char at i is equal to a then
				count++;//increase the counter
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");//ask the user to enter a string
		String inputString = scan.nextLine();
		
		//and a character whose value will be memorize as string
		System.out.println("Enter a char: ");
		String inputChar = scan.next();
		
		//while the user don't input just one char keep asking to enter just one char
		while(inputChar.length()>1){//the length is 1 if its one char, so >1 if there are more chars...
			System.out.println("Thats a string. Try again. Enter a char: ");
			inputChar = scan.next();
		}
		
		char character = inputChar.charAt(0);//when the string is just one character then take that first char
		
		//print how many times the char repeats in the string
		System.out.println("The char "+inputChar+" repeats "+count(inputString, character)
				+" times in the string "+inputString);
		scan.close();
	}

}
