package zadaci_12_08_2015;

import extrapackage.Numbers;

/*(Displaying the prime factors) Write a program that prompts the user to enter
a positive integer and displays all its smallest factors in decreasing order. For
example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
retrieve and display them in reverse order.*/

/**
 * @author Marina Sljivic
 *
 */
public class DisplayPrimeFactorsReverse {
	
	/**
	 * Display the numbers smallest factors in decreasing order.
	 * @param number int
	 */
	public static void displayFactors(int number){
		//create a new stack
		StackOfIntegers stack = new StackOfIntegers();
		
		int cloneNumber = number; //because we are going to change the value of number, 
		//we need its clone, so number will keep its value
		for(int i=2; i<=cloneNumber; i++){ //i is all the numbers from 2 to cloneNumber
			 while(cloneNumber%i==0){ //while the cloneNumber is divisible by i
				 cloneNumber=cloneNumber/i; //cloneNumber became the cloneNumber divided by i
				 stack.push(i); //push the int i to the top of the stack
			 }
		 }
		System.out.println("The number's smallest factors in decreasing order: ");
		while (!stack.empty()){ //while the stack is not empty
			 System.out.print(stack.pop() + " "); //print and remove the top element
		}
	}
	
	public static void main(String[] args) {
		//ask the user to enter the number
		System.out.println("Enter a positive integer to display all its smallest factors in decreasing order: ");
		int number = Numbers.inputPositiveInteger();//take the input
		displayFactors(number);//display the number's factors
	}

}
