package zadaci_23_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: 
 * d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi kao checksum i njega izraèunavamo iz 
 * prvih devet brojeva koristeæi se sljedeæom formulom: 
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11.
 * Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom. 
 * Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj.
 * (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. 
 * Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)*/

/**
 * @author Marina Sljivic
 *
 */
public class ISBN10 {
	/**
	 * These method takes as parameter an array that contains 9 positive integers and prints out the ISBN-10 number.
	 * 
	 * @param nineNumbers type int
	 */
	public static void printISBN(int[] nineNumbers){
		int checksum=0; //set the checksum to 0
		
		//calculate the checksum
		for(int i=0;i<nineNumbers.length;i++){
			checksum+=nineNumbers[i]*(i+1); 
			//add the element at position i multiplicated by i+1
			//(if the index is 0 multiplicate the first element by 1, if the index is 1 multiplicate de second element by 2)
		}
		checksum%=11; //than the checksum is modulo by 11
		
		System.out.print("ISBN-10 : "); //print the isbn-10
		for(int i=0;i<nineNumbers.length;i++){
			System.out.print(nineNumbers[i]); //print the 9numbers
		}
		if(checksum==10){ //if the checksum is 10
			System.out.print("X");//print "X"
		}else{
			System.out.print(checksum);//else print the checksum
		}
	}
	
	/**
	 * These method asks the user to enter 9 integers from 0 to 9, and returns the nine numbers in an array.
	 * 
	 * @return an array of nine integers from 0 to 9
	 */
	public static int[] inputArrayInt(){
		Scanner scan = new Scanner(System.in);
		int[] array=new int[9];//create an array that will take the users numbers
		
		boolean continueInput = true;//these means that we need to continue to take users inputs
		do {
			try{
				System.out.println("Enter nine integers from 0 to 9: ");
				String numbers = scan.next(); //try to take the user's input
				if(numbers.length()==9){ //if the user entered 9 numbers
					for(int i=0;i<numbers.length();i++){ //for all of them
						array[i]=Integer.parseInt(""+numbers.charAt(i)); //try to put it in an array of integers
						//the element at index i in the string will be the element at the same index in the array
					}
					//if this passed without exceptions, errors
					continueInput = false; //then we dont need to continue input (it is false),
											//the right number has been entered
				} else{ //if the length of the string is lower or greater than 9
					throw new Exception(); //throw an Exception
				}
			}catch(Exception ex){
				System.out.println("You must enter nine integers from 0 to 9. Try again");
			}
		} while (continueInput);//while the number is not entered correctly(continueInput is true)
		
		scan.close();
		return array;
	}
	
	public static void main(String[] args) {
		printISBN(inputArrayInt());
	}

}
