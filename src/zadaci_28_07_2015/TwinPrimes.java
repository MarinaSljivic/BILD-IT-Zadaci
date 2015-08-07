package zadaci_28_07_2015;

import zadaci_22_07_2015.Primes;

/* Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. 
 * Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer twin primes. 
 * Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10 parova po liniji.*/ 

/**
 * @author Marina Sljivic
 *
 */
public class TwinPrimes {

	/**
	 * This method prints all the twins primes (two primes whose difference is 2) between 2 and 10000, ten per lines.
	 * 
	 */
	public static void printTwins(){
		//this will count all the printed numbers, so when it arrives to a multiple of 10
		//we know that we have to go to next line
		int countPrintedNumbers=0;
		
		for(int i=2;i<10000-2;i++){ //i is going from the first prime number 2 to 10000-2 
			//because when we arrive at i=9997 the i+2=9999 and that is the last number
			
			//the difference between i and i+2 is 2
			if(Primes.isPrime(i) && Primes.isPrime(i+2)){//if i is prime and i+2 is prime(checked with an old method)
				System.out.print("("+i+","+(i+2)+") ");//so print i and i+2
				countPrintedNumbers++;//increase the counter of printed numbers
				if(countPrintedNumbers%10==0){//if the counter is a multiple of 10
					System.out.println();//go to next line
				}
			}
		}
	}
	
	public static void main(String[] args) {
		printTwins();
	}

}
