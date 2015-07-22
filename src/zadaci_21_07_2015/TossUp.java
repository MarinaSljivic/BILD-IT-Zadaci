package zadaci_21_07_2015;

import java.util.Random;

/**
 * @author Marina Sljivic
 *
 */
public class TossUp {

	/**
	 * These method takes as parameter the number of throws we want to have.
	 * Random generates the toss-up and prints out how many throws was
	 * head and how many was letter.
	 * 
	 * @param numberOfThrows
	 */
	public static void tossUp(int numberOfThrows){
		int numberOfHead = 0; //will count how much throws was head
		for(int i=0; i<numberOfThrows; i++){//we want to have numberOfThrows throws
			Random random = new Random(System.nanoTime());
			int simulateThrow = random.nextInt(2); //we want to random generate an integer from 0 to 2: 0 or 1
			//1(stands for head), 0(for letter)
			if(simulateThrow == 1){ //if the throw was head then
				numberOfHead++;//increase the numberOfHead
			}
		}
		//print the result to the user
		//the number of letters is the total number of throws - the number of heads
		System.out.println("Head: "+numberOfHead+"\t Letter: "+(numberOfThrows-numberOfHead));
	}
	public static void main(String[] args) {
		tossUp(5);
	}
}
