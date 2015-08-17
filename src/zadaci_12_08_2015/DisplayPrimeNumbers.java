package zadaci_12_08_2015;

import extrapackage.Numbers;

/*(Displaying the prime numbers) Write a program that displays all the prime
numbers less than 120 in decreasing order. Use the StackOfIntegers class
to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
reverse order*/

/**
 * @author Marina Sljivic
 *
 */
public class DisplayPrimeNumbers {
	/**
	 * Display all the prime numbers less than number in decreasing order.
	 * @param number int
	 */
	public static void displayPrimes(int number){
		//create a new stack
		StackOfIntegers stack = new StackOfIntegers();
		
		for(int i=2; i<=number; i++){ //i is all the numbers from 2 to number
			 if(MyInteger.isPrime(i)){ //if the number i is a prime number 
				 stack.push(i); //push the prime number i to the top of the stack
			 }
		 }
		
		System.out.println("The prime numbers less than "+number+":");
		while (!stack.empty()){ //while the stack is not empty
			 System.out.print(stack.pop() + " "); //print and remove the top element
		}
	}
	
	public static void main(String[] args) {
		//ask the user to enter the number
		System.out.println("Enter a positive integer to display all prime numbers less than it: ");
		int number = Numbers.inputPositiveInteger();//take the input
		displayPrimes(number);//display the primes
	}

}
