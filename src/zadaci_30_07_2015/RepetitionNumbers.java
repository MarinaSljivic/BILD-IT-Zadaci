package zadaci_30_07_2015;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


/* Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te broji i ispisuje 
 * koliko je koji broj puta unijet. Pretpostavimo da nula prekida unos brojeva. 
 * Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58 2 6 0 program nam ispisuje 
 * da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.*/

/**
 * @author Marina Sljivic
 *
 */
public class RepetitionNumbers {
	
	/**
	 * This method asks the user to input some integers in range 1-100, one number per line, when he wants to stop
	 * he has to type 0. Then the method returns an ArrayList<Integer> that contains that integers.
	 * 
	 * @return an ArrayList<Integer> that contains user's inputs
	 */
	public static ArrayList<Integer> inputList(){
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter some integers (in range 1-100): ");
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //a list that will contain user's inputs
		int input=0; //input will contain the last values of the user's inputs
		
		do{
			boolean continueInput = true;//these means that we need to continue to take users inputs
			do {
				try {
					
					input = scan.nextInt(); //try to take the user's input
					
					if(input>=1 && input<=100){//if the number is in range 1-100
					
						list.add(input);//add the user's input in the list
					
					}else if(input!=0){//if the number is not in the range, but it's not 0
						
						throw new Exception();//throw a new exception
					}
					
					//if this passed without exceptions, errors
					continueInput = false; //then we dont need to continue input (it is false),
											//the right number has been entered
				
				} catch (InputMismatchException ex) {//if its not an integer
					System.out.println("Try again. (Incorrect input: an integer is required)");
					scan.nextLine(); // discard the current input, pass to the nextLine
			
				} catch (Exception e) {//if its not in range 1-100
					System.out.println("The number is out of range 1-100. Try again.");
					scan.nextLine(); // discard the current input, pass to the nextLine
				}
		
			} while (continueInput);//while the number is not entered correctly(continueInput is true)
		}while(input!=0);//do while the user's input is not 0
		
		scan.close();
		return list;
	}
	
	/**
	 * This method prints how many times integer n is repeated in the list.
	 * 
	 * @param n int
	 * @param list ArrayList<Integer>
	 */
	private static void printRepetition(int n, ArrayList<Integer> list) {
		int count = 0;//this will count the repetition of n in list
		for(int number : list){
			if(number==n){ //every time a number in the list is equal to n
				count++;//increase the counter
			}
		}
		System.out.println(n+" repeats "+count+" times.");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the integers (press 0 to stop): ");
		//list will contain the users integers
		ArrayList<Integer> list = inputList();
		
		for(int i=0;i<list.size();i++){//for every integer at index 'i' in the list
				if(list.lastIndexOf(list.get(i)) == i){//if i is the last index of that number (to avoid repetition)
					printRepetition(list.get(i),list);//print how many times its repeated in the array
				}
			}	
	}
}
