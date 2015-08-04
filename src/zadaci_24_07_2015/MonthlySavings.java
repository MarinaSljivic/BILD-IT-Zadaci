package zadaci_24_07_2015;

import extrapackage.Numbers;

/*Pretpostavimo da uplatimo $100 svaki mjesec na �tedni ra�un koji ima godi�nju interesnu stopu od 5%.
 *Mjese�na interesna stopa je stoga 0.05 / 12 = 0.00417. 
 *Nakon prvog mjeseca vrijednost na ra�unu postaje 100 * (1 + 0.00417) = 100.417. 
 *Nakon drugog mjeseca, vrijednost na ra�unu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
 *Nakon tre�eg mjeseca, vrijednost na ra�unu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 *Napisati program koji pita korisnika da unese mjese�ni iznos �tednje 
 *te broj mjeseci nakon kojeg bi �elio znati stanje ra�una.*/

/**
 * @author Marina Sljivic
 *
 */
public class MonthlySavings {
	
	public static double calculateBalanceAccount(double amountPerMonth, double numberOfMonths){
		//the annual interest is of 5%, so this is the monthly interest 0.05 / 12 = 0.00417
		double monthlyInterest=0.05/12;
		//the first month the variableAmountPerMonth is 0, 
		//after the second month variableAmountPerMonth is the calculated balance account for the first month
		//after the n-th month variableAmountPerMonth is the calculated balance account for the n-1-th month
		double variableAmountPerMonth = 0;
		
		for(int i=0;i<numberOfMonths;i++){ //we need to calculate for every month, so pass trought every month
			variableAmountPerMonth=(amountPerMonth+variableAmountPerMonth) * (1 + monthlyInterest); 
			//this is the formula to calculate the balance account after every month
		}
		return variableAmountPerMonth;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the monthly amount you want to save: ");
		double monthlyAmount = Numbers.inputPositiveDouble();
		
		System.out.println("After how many months you want to now your balance account? ");
		int months = Numbers.inputPositiveInteger();
		
		System.out.println("Your balance account is: "+calculateBalanceAccount(monthlyAmount, months));
	}
}
