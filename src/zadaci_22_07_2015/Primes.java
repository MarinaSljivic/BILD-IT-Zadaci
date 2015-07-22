package zadaci_22_07_2015;

/**
 * @author Marina Sljivic
 *
 */
public class Primes {

	/**
	 * This method takes as parameter 3 numbers: the first two (fromNumber, toNumber) and prints all the primes
	 * that are in that interval, the third (primesPerLine) is how many numbers you want to print per line.
	 * 
	 * @param fromNumber
	 * @param toNumber
	 * @param primesPerLine
	 */
	public static void printPrimeNumbers(int fromNumber, int toNumber, int primesPerLine){
		int printedPrimes =0;//this will count how many primes we printed
		//number will be all the numbers in the interval (fromNumber, toNumber)
		for(int number=fromNumber; number<=toNumber; number++){
			if(isPrime(number)){ //if number is a prime number
				System.out.print(number+" ");//print it
				printedPrimes++;//increase the number of printed primes
				if(printedPrimes % primesPerLine==0){//if the number of printed primes is divisible by primesPerLine
					System.out.println();//go to the next line
				}
			}
		}
	}
	
	/**
	 * This method checks if the number is prime or not and depending on that returns a boolean.
	 * 
	 * @param number
	 * @return true if it is a prime number, false if its not.
	 */
	public static boolean isPrime(int number) {
		//check if the number is greater then 1
	    if (number > 1){
		    for (int i = 2; i <= number/2; i++) {//chek if the number is divisible 
		    	//by any number: from 2 up to the half of the number
		    	//(to the half of the number because the other half is multiple of 2)
		    	if (number % i == 0) //if it is then its not a prime number so return false
		            return false;
		    }
		    return true;//if false wasnt returned then it is a prime so return true
	    }else{ //if its not then for sure its not a prime number
	    	return false;
	    }
	}
	
	public static void main(String[] args) {
		printPrimeNumbers(1, 120, 4);
	}
}
