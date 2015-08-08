package zadaci_30_07_2015;

import zadaci_22_07_2015.Primes;

/* Napisati metodu sa sljedeæim headerom: public static int isPrime(int n) koja provjerava da li je broj prost/prime. 
 * Napsati test program koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.*/

/**
 * @author Marina Sljivic
 *
 */
public class PrimeCheckAndPrint {
	
	public static void main(String[] args) {
		//the method isPrime(int n) is done in class Primes
		//printPrimeNumbers use that method to print the primes
		//i've added to print 10 per lines
		Primes.printPrimeNumbers(0, 100000, 10);
	}

}
