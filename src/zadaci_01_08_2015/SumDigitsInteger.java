package zadaci_01_08_2015;

/* Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju. Koristite sljedeæi header: 
 * public static int sumDigits(long n). 
 * Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234)) metoda treba da vrati 9. 2 + 3 + 4 = 9*/

/**
 * @author Marina Sljivic
 *
 */
public class SumDigitsInteger {

	/**
	 * @param n long
	 * @return the sum of the digits in the long number n
	 */
	public static int sumDigits(long n){
		int sum = 0;//set the sum of the digits to 0
		while(n!=0){//while number n is not 0
			sum += n%10;//add to the sum the last digit of the number n finding the rest by dividing by 10
			n /= 10;//and "cut" it by dividing it by 10
		}
		return sum;//return the sum
	}
	
	public static void main(String[] args) {
		System.out.println(sumDigits(9812303));//print the result of the sumDigits

	}

}
