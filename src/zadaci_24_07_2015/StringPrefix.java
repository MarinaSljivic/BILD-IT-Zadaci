package zadaci_24_07_2015;

import java.util.Scanner;

/*Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveæi zajednièki prefix
 *  za ta dva stringa, ukoliko isti postoji. Na primjer, ukoliko korisnik unese sljedeæa dva 
 *  stringa "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" program treba da ispiše: 
 *  Najveæi zajednièki prefix za dva stringa je "Dobrodošli u".*/

/**
 * @author Marina Sljivic
 *
 */
public class StringPrefix {

	/**
	 * This method takes as parameters two strings and returns their biggest common prefix.
	 * If the first string is "abcd" and the second "abc d" the prefix will be "abc".
	 * 
	 * @param s1 a string
	 * @param s2 a string
	 * @return the biggest common prefix of the two strings s1 and s2
	 */
	public static String findBiggestCommonPrefix(String s1, String s2){
		String prefix = "";
		if(s1.length()<s2.length()){ //if the first string is smaller than the second
			for(int i=0;i<s1.length();i++){//than the index of the characters "i" is going from 0 to the length of the smaller
				if(s1.charAt(i) == s2.charAt(i)){//if the char at the same index "i" is equal
					prefix+=s1.charAt(i);//add it to the prefix string
				}else{ //else break immediatly the for loop
					break;//because its not the same char, the prefix is terminated
				}
			}
		}else{//else if the second is smaller than the first string
			for(int i=0;i<s2.length();i++){ //like above
				if(s2.charAt(i) == s1.charAt(i)){
					prefix+=s2.charAt(i);
				}else{
					break;
				}
			}
		}
		return prefix;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first sentence: "); //ask the user to enter the first string
		String firstSentence = scan.nextLine(); //take the first string
		System.out.println("Enter the second sentence: "); //same for the second
		String secondSentence = scan.nextLine();
		
		//print the biggest common prefix invoking the method on that entered strings
		System.out.println("The biggest common prefix is: "+findBiggestCommonPrefix(firstSentence, secondSentence));
	}

}
