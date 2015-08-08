package zadaci_31_07_2015;

import extrapackage.Numbers;

/* (Izraèunavanje napojnice) Napisati program koji uèitava ukupan iznos raèuna koji treba uplatiti 
 * kao i procenat tog raèuna kojeg želimo platiti kao napojnicu te izraèunava ukupan raèun i napojnicu. 
 * Na primjer, ukoliko korisnik unese 10 kao raèun i 15 % kao procenat za napojnicu program treba da 
 * ispiše da je ukupan raèun za uplatiti 11.5 a napojnica 1.5.*/

/**
 * @author Marina Sljivic
 *
 */
public class CalculateTips {
	
	/**
	 * This method calculates the total bill and the tip, depending on the bill without tip and the percentage 
	 * we want to pay, and prints out the total bill and the tip. 
	 * 
	 * @param billWithoutTip
	 * @param percentage
	 */
	public static void printBillAndTip(double billWithoutTip, double percentage){
		//calculate how much is the percentage amount and add it to the bill without tip
		double totalBill = billWithoutTip*(1+percentage/100);
		//calculate the tip-thats the percentage amount
		double tip = billWithoutTip*percentage/100;
		//print the result
		System.out.println("The total bill to pay is "+totalBill+", the tip is "+tip);
	}

	public static void main(String[] args) {
		System.out.println("Enter the bill and the percentage: ");
		//print the bill and the tip using a helper method for the user's inputs
		printBillAndTip(Numbers.inputPositiveDouble(), Numbers.inputPositiveDouble());

	}

}
