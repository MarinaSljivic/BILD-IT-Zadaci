package zadaci_03_08_2015;

import java.util.Scanner;

/*Napisati program koji pita korisnika da unese neki string te mu vraæa taj isti string naopako.*/

/**
 * @author Marina Sljivic
 *
 */
public class ReverseString {
	
	/**
	 * Given a string s, returns the string s in reverse order.
	 * 
	 * @param s String
	 * @return the reverse string of s
	 */
	public static String reverse(String s) {
		String reverse = "";
		for(int i=s.length()-1; i>=0; i--){//i is the index for chars in the string, goes from the last to the first
			reverse += s.charAt(i);//add the char to the reverse String
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		//asks the user to enter a string and takes it
		System.out.println("Enter a string: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(reverse(input));//prints the string in reverse
		scan.close();
		
	}

	

}
