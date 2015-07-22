package zadaci_21_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Marina Sljivic
 *
 */
public class SimpleMathQuestions {

	/**
	 * These method takes as parameter the number of questions you want to
	 * generate. Then random generates simple questions like
	 * "How much is it 5 - 2?", the user has to answer. After that prints out
	 * the number of correct and incorrect answers.
	 * 
	 * @param numberQ
	 *            the number of questions you want to generate
	 */
	public static void subtractionQuestions(int numberQ){
		Scanner scan = new Scanner(System.in);//create a new Scanner object for user's input
		int correctAnswers=0; //will count how much answers are correct
		
		for(int i=0; i<numberQ; i++){ //we want to have numberQ questions
			
			int firstNumber = (int)(Math.random()*10+1); //generates a number between 1 and 10
			int secondNumber = (int)(Math.random()*10+1); //generates a number between 1 and 10
			if(firstNumber < secondNumber){ //if the first number is lower than the second
				//the question is not simple, the result is negative, so reverse their values
				int temp = firstNumber;
				firstNumber = secondNumber;
				secondNumber = temp;
			}
			//print the question to the user
			System.out.println("How much is it "+firstNumber+" - "+secondNumber+" ?");
			
			try{
				int userAnswer = scan.nextInt(); //if this passed without exceptions, errors
				
				if(userAnswer == firstNumber-secondNumber){ //if the user's answer is correct
					correctAnswers++; //increase the number of correctAnswers
				}
				
			} catch (InputMismatchException ex) {
				//if exception happens do nothing, the answer is incorrect	
				scan.nextLine(); //discard the current input, pass to the nextLine
			}
		}
		scan.close(); //close the Scanner
		//print out correct and incorrect answers, 
		//total number of questions(numberQ)-correctAnswers is the number of incorrect answers
		System.out.println("Correct answers: "+correctAnswers+"\t Incorrect answers: "+(numberQ-correctAnswers));
	}

	public static void main(String[] args) {
		subtractionQuestions(5);
	}

}
