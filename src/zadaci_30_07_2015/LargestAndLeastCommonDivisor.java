package zadaci_30_07_2015;

import extrapackage.Numbers;

/* Napisati program koji pita korisnika da unese dva cijela, 
 * pozitivna broja te ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.*/


/**
 * @author Marina Sljivic
 *
 */
public class LargestAndLeastCommonDivisor {

	public static void main(String[] args) {
		//ask the user to enter two integers, using helper methods
		System.out.println("Enter the first integer: ");
		int first = Numbers.inputPositiveInteger();
		System.out.println("Enter the second integer: ");
		int second = Numbers.inputPositiveInteger();
		
		//find the largest common divisor, the least common divisor is always 1
		System.out.println("Largest common divisor: "+largestCommonDivisor(first,second)
				+"\nLeast common divisor: 1");
	}

	/**
	 * @param first int
	 * @param second int
	 * @return the largest common divisor of the two integers
	 */
	private static int largestCommonDivisor(int first, int second) {
		int largest=1;//set the largest common divisor to 1
		for(int i=2;i<=first;i++){//the biggest possible divisor is smaller or equal to the smaller number of the two
			//so 'i' goes from 2(not from 1 becuse largest is already 1) to one of the two numbers
			//in this case first
			if(first%i==0 && second%i==0){//if both the numbers are divisible by 'i'
				largest=i;//largest becomes 'i'
			}
		}
		return largest;
	}

}
