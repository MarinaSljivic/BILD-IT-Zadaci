package zadaci_02_08_2015;

import extrapackage.Numbers;

/* Napisati program koji pita korisnika da unese cijeli broj te ispisuje piramidu svih brojeva do tog broja. 
 * (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, red ispod vrha piramide je 2 1 2,
 *  red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)*/

/**
 * @author Marina Sljivic
 *
 */
public class IntPyramid {

	/**
	 * Given an integer that represents the size of the pyramid, this method prints the pyramid of integers from 1
	 * to that number.
	 * 
	 * @param size a positive integer
	 */
	public static void printPyramid(int size){
		String line ="1"; //this string will contain the numbers for every line of the pyramid, starts from 1
		
		for(int i=2;i<=size+1;i++){ //i goes from 2 to the size+1 (this size+1 wouldn't be printed, size will be the last printed)
			
			for(int j=i;j<=size;j++){ //to print the blank spaces j goes from the number we are printing 'i' to the last number 'size'
				//as the number is greater the blank spaces are smaller, and for the last number (last line) there won't be blank spaces
				System.out.print("  ");//2double spaces: one for the number, one for the blank space
			}
			System.out.println(line);//print the line after printing the blank spaces
			line = i+" "+line+" "+i; //add the new number 'i' for the next line
		}
	}
	
	public static void main(String[] args) {
		//ask the user to input the size of the pyramid and take the input using helper method
		System.out.println("Enter the size of the pyramid: ");
		int size = Numbers.inputPositiveInteger();
		printPyramid(size);//print the pyramid
	}

}
