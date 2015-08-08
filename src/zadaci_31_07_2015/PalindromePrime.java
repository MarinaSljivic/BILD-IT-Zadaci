package zadaci_31_07_2015;

import zadaci_22_07_2015.Primes;

/* Palindrome prime je prosti broj koji je takoğer i palindrom. 
 * Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
 * Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji.*/

public class PalindromePrime {

	/**
	 * This method takes as parameter how many palindrome primes you want to print and prints that numbers.
	 * Palindrome primes are prime numbers which reverses are primes too and they are palindromes.
	 * 
	 * @param howMany int
	 */
	public static void printPalindromePrime(int howMany){
		int number = 0;//number will be the test number if its palindrome prime
		
		while(howMany>0){//while the number of how many we want to print is bigger than 0
			int reverse = ReverseNumbersOrder.reverse(number); //this is the reverse number
			
			if(number == reverse //if the number is a palindrome
					&& Primes.isPrime(number)//and if it and its reverse are prime numbers
					&& Primes.isPrime(reverse)){
				System.out.print(number+" ");//print that number
				howMany--;//when it prints a palindrome prime decrease the counter
				if(howMany%10==0){//if how many palindrome primes we have printed is divisible by 10
					System.out.println();//go to new line
				}
			}
			number++;//increase the number
		}
	}
	public static void main(String[] args) {
		printPalindromePrime(100);//print the first 100 palindrome primes
	}

}
