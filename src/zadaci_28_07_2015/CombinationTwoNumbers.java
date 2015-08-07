package zadaci_28_07_2015;

/* Napisati program koji ispisuje sve moguæe kombinacije za biranje dva broja u rasponu od 1 do 7. 
 * Takoðer, program ispisuje broj svih moguæih kombinacija.  
 * Dakle, program treba da ispiše sve moguæe parove brojeva u datom rasponu, 
 * krenuvši sa 1 2, 1 3, 1 4, itd. Broj moguæih kombinacija je 21.*/

/**
 * @author Marina Sljivic
 *
 */
public class CombinationTwoNumbers {

	/**
	 * This method prints out all the combinations of two numbers between 1 and 7 included, 
	 * at the end prints the number of the all combinations.
	 */
	static void printAllTheCombinations(){
		int countCombinations=0;//counter for all the combinations
		
		//i is the first number, from 1 to 7
		for(int i=1;i<8;i++){
			//j is the second number
			for(int j=i+1;j<8;j++){//i must be lower than j, so j goes from i+1
				//(so we skip the similar combinations like 1,2 and 2,1 and the equal 1,1 2,2)

				//print the two numbers
				System.out.println(i+" "+j);
				countCombinations++;//and increase the counter of the combinations
			}
		}
		//at the end print how many combinations there was
		System.out.println("There are "+countCombinations+" combinations.");
	}
	
	public static void main(String[] args) {
		printAllTheCombinations();//test the method
	}
}
