package zadaci_31_07_2015;

import zadaci_22_07_2015.Primes;

/* Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti broj 
 * i kada ispišemo naopako. Na primjer, broj 17 i broj 71 su prosti brojevi tako da su 
 * brojevi i 17 i 71 emirp brojevi. Napisati program koji ispisuje prvih 100 emirp brojeva,
 * 10 brojeva po liniji.*/

/**
 * @author Marina Sljivic
 *
 */
public class Emirp {

	/**
	 * This method takes as parameter how many emirps you want to print and prints that numbers.
	 * Emirps are prime numbers which reverses are primes too, but they are not palindromes.
	 * 
	 * @param howMany int
	 */
	public static void printEmirp(int howMany){
		int number = 0;//number will be the test number if its emirp
		
		while(howMany>0){//while the number of how many we want to print is bigger than 0
			int reverse = ReverseNumbersOrder.reverse(number); //this is the reverse number
			
			if(number != reverse //if the number is not a palindrome
					&& Primes.isPrime(number)//and if it and its reverse are prime numbers
					&& Primes.isPrime(reverse)){
				System.out.print(number+" ");//print that number
				howMany--;//when it prints an emirp decrease the counter
				if(howMany%10==0){//if how many emirps we have printed is divisible by 10
					System.out.println();//go to new line
				}
			}
			number++;//increase the number
		}
	}
	public static void main(String[] args) {
		printEmirp(100);//print the first 100 emirps
	}

}
