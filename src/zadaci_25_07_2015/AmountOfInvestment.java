package zadaci_25_07_2015;

import extrapackage.Numbers;

/*Napisati program koji uèitava iznos investicije, godišnju interesnu stopu i broj godina 
 * te vraæa buduæu vrijednost investicije koristeæi se sljedeæom formulom: 
 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 * Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 1 
 * kao broj godina program vam vraæa 1032.98 kao buducu vrijednost investicije.*/

/**
 * @author Marina Sljivic
 *
 */
public class AmountOfInvestment {

	/**
	 * @param amountOfInvestment double
	 * @param annualInterestRate double
	 * @param years int
	 * @return a double that rapresents the future amount of investment
	 */
	public static double calculateFutureAmountOfInvestment(double amountOfInvestment, double annualInterestRate, int years){
		//calculate the monthly interest: the annual interest rate is 3.25% or 3.25/100, so the monthly is 3.25/100/12 or:
		double monthlyInterest=annualInterestRate/1200;
		//return the future amount of investment, this is the formula:
		return amountOfInvestment*(Math.pow(1+monthlyInterest,years*12));
	}
	
	public static void main(String[] args) {
		
		//the methods for the user's inputs are used from the helper class
		System.out.println("Enter the amount of investment:");
		double amount = Numbers.inputPositiveDouble(); //take the amount of investment from the user
		System.out.println("Enter the annual interest rate: ");
		double interest = Numbers.inputPositiveDouble(); //take the annual interest rate
		System.out.println("Enter the number of years: ");
		int years = Numbers.inputPositiveInteger(); //take the number of years
		System.out.println("The future amount of investment is "+calculateFutureAmountOfInvestment(amount,interest,years));
	
	}

}
