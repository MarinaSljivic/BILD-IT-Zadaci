package zadaci_01_08_2015;

import java.util.Random;

import extrapackage.Numbers;

/* Napisati program koji igra sa protivnikom rock-paper-scissors. (papir-bunar-makaze ili tako nekako po naški) 
 * Program nasumièno generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. 
 * Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik pobijedio, 
 * da li je raèunar pobijedio ili je bilo neriješeno.*/

/**
 * @author Marina Sljivic
 *
 */
public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println("Enter 0-Rock, 1-Scissors or 2-Paper.");
		int userChoice = Numbers.inputPositiveIntegerZeroIncluded();//take user's choice
		while(userChoice>2){//if its out of range 0-2, ask to enter again
			System.out.println("Bad input! Enter 0-Rock, 1-Scissors or 2-Paper.");
			userChoice = Numbers.inputPositiveIntegerZeroIncluded();//using helper method for input
		}
		
		Random ran = new Random(System.nanoTime());//create a random object which seed is System.nanoTime()
		int computerChoice = ran.nextInt(3);//generate a number in range 0-2
		
		String[] array = {"Rock","Scissors","Paper"};//the array contains the name of the choice at the right position
		//print who choose what
		System.out.println("User's "+array[userChoice]+" VS computer's "+array[computerChoice]);
		winner(userChoice,computerChoice);//and the result of the game
	}

	/**
	 * Depending on the given choices (0-rock, 1-scissors, 2-paper) of the user and the computer,
	 * prints out the winner of the game rock-scissors-paper.
	 * 
	 * @param userChoice int between 0,1 and 2
	 * @param computerChoice int between 0,1 and 2
	 */
	private static void winner(int userChoice, int computerChoice) {
		//0-rock, 1-scissors, 2-paper
		
		if(userChoice==0 && computerChoice==2){//user:rock, computer:paper
			System.out.println("Computer won!");//computer wins
			
		}else if (userChoice==2 && computerChoice==0){//user:paper, computer:rock
			System.out.println("User won!");//user wins
			
		}else if(userChoice>computerChoice){//0-rock wins 1-scissors, 1-scissors wins 2-paper, the smaller number wins
			System.out.println("Computer won!");//if the computer choice is the smaller one, print the comp wins
			
		}else if(userChoice<computerChoice){//same her for the user, if the user's choice is smaller
			System.out.println("User won!");//print the user wins
			
		}else{ //if none of the above cases was true, then its unresolved
			System.out.println("Unresolved. None won.");
		}
	}

}
