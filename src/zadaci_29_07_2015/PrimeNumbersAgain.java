package zadaci_29_07_2015;

import zadaci_22_07_2015.Primes;

/* Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi i 2 i 1000. 
 * Program treba da ispiše 8 brojeva po liniji te razmak izmeðu brojeva treba da bude jedan space*/

/**
 * @author Marina Sljivic
 *
 */
public class PrimeNumbersAgain {

	public static void main(String[] args) {
		//count how many numbers are printed
		int countPrinted=0;
		
		for(int i=2;i<1001;i++){ //'i' is all the numbers between 2 and 1000 included
			
			if(Primes.isPrime(i)){ //if 'i' is a prime number (using a method from a previous exercise)
				System.out.print(i+" "); //print the prime 'i' and a space
				countPrinted++; //and increase the counter of printed numbers
				if(countPrinted%8==0){ //if countPrinted is divisible by 8 then go to next line
					//so we have 8 numbers per line
					System.out.println();
				}
			}
		}
	}
}
