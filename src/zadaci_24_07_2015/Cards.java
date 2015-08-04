package zadaci_24_07_2015;

import java.util.Random;

/* Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte. 
 * Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) 
 * te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). 
 * Primjer: Karta koju ste izvukli je 10 u znaku kocke.*/

/**
 * @author Marina Sljivic
 *
 */
public class Cards {

	/*
	 * This method prints out a card from the spil. 
	 */
	public static void generateCard(){
		String[] cardSigns={"heart","spade","clover","cube"}; 
		String[] cardNumbers={"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		Random random = new Random(System.nanoTime());//create a new Random object
		int sign = random.nextInt(4);//we want to random generate an integer from 0 to 3
		//this integer is the index of the array cardSigns:
		//0-heart, 1-spade, 2-clover, 3-cube
		int number = random.nextInt(13);//we want to random generate an integer from 0 to 12
		//this integer is the index of the array cardNumbers:
		//0-A,1-2,2-3,3-4,4-5,5-6,6-7,7-8,8-9,9-10,11-J,12-Q,13-K
		System.out.println("The card you draw out is "+cardNumbers[number]+" sign "+cardSigns[sign]);
	}
	
	public static void main(String[] args) {
		generateCard();
	}
	
}
