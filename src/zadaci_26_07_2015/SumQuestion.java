package zadaci_26_07_2015;

import java.util.Random;

import extrapackage.Numbers;

/*Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika da unese njihov zbir. 
 * Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo sve sa porukom da pokuša ponovo.
 * Ukoliko korisnik unese taèan odgovor, program mu èestita i završava sa radom.*/

/**
 * @author Marina Sljivic
 *
 */
public class SumQuestion {

	/**
	 * Given three integers prints out a question about their sum in a "pretty way".
	 * 
	 * @param firstNumber int
	 * @param secondNumber int
	 * @param thirdNumber int
	 */
	public static void printSumQuestion(int firstNumber, int secondNumber, int thirdNumber){
		//print to the user how much is the sum of the three numbers
		System.out.print("How much is it "+firstNumber);
		if(secondNumber<0){ //if the second number is negative then we dont need to print "+" it will have its sign "-"
			System.out.print(secondNumber);
		}else{
			System.out.print("+"+secondNumber);//if its positive, put a "+" before it
		}
		if(thirdNumber<0){ //same here for the third number
			System.out.print(thirdNumber+" = "); //and at the end, put a "="
		}else{
			System.out.print("+"+thirdNumber+" = ");
		}
	}
	
	/**
	 * This method random generates three numbers between -5000 and 5000, asks the user to enter their sum
	 * using the method printSumQuestion(). Then checks if the sum is right-than prints a congrats message,
	 * else if its wrong-prints to try again.
	 */
	public static void askTheSum(){
		//gereate the numbers and make the question:
		Random ran = new Random(System.nanoTime()); //make a Random object
		int firstNumber = ran.nextInt(10000)-5000; //first,second and third number are random generated integers
		int secondNumber = ran.nextInt(10000)-5000;
		int thirdNumber = ran.nextInt(10000)-5000; //random generated numbers from -5000 to 5000
		
		boolean continueAnswering=true; //while the user's answer is wrong, continue to answer him
		//when his answer is right then continueAnswering "stops"-becomes false:
		
		do{
			printSumQuestion(firstNumber, secondNumber, thirdNumber); //print the question to the user
			
			int userAnswer = Numbers.inputInteger(); //take the users answer (using the method from the helper class)
			
			if(userAnswer == firstNumber+secondNumber+thirdNumber){ //if the users answer is correct
				System.out.println("Congratulations!");
				continueAnswering = false; //dont continue to answer him
			}else{ //if his answer is wrong
				System.out.println("Try again!"); //print to the user to try again
			}
		}while(continueAnswering); 
		
	}
	
	public static void main(String[] args) {
		askTheSum();
	}

}
