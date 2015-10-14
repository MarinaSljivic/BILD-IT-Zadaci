package zadaci_20_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Write a program that prompts the user to enter an integer
 m and find the smallest integer n such that m * n is a perfect square. (Hint:
 Store all smallest factors of m into an array list. n is the product of the factors that
 appear an odd number of times in the array list. For example, consider m = 90,
 store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
 in the array list. So, n is 10.) Here are sample runs:

 Enter an integer m: 1500
 The smallest number n for m * n to be a perfect square is 15
 m * n is 22500

 Enter an integer m: 63
 The smallest number n for m * n to be a perfect square is 7
 m * n is 441
 */

/**
 * @author Marina Sljivic
 *
 */
public class AlgebraPerfectSquare {

	public static void main(String[] args) {
		// ask the user to enter the integer m
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Enter and integer m: ");
			int m = scan.nextInt();

			// store m's factors in a list
			ArrayList<Integer> factors = new ArrayList<>();
			int mcopy = m;// create a copy of m
			for (int i = 2; i <= m ; i++) {
				while (mcopy % i == 0) { // while i is a factor of m add it to the list
					factors.add(i);
					mcopy /= i; // divide m by i
				}
			}
			// set n to be the smallest integer n such that m * n is a perfect square
			int n = 1;

			// find the factors that appear an odd number of times in the list
			// and multiply n by them
			for (int i =0; i<factors.size(); i++) {
				// count how many times i is in the list factors
				int count = 0;
				for (int j=0; j< factors.size(); j++) {
					if (factors.get(i) == factors.get(j)) {
						count++;
					}
				}
				// if it is an odd times in the list multiply n by it
				if (count % 2 != 0) {
					n *= factors.get(i);
					factors.add(factors.get(i)); 
					//and add one extra, so it would be an even number of times in the list
				}
			}
			//print the result
			System.out
					.print("\nThe smallest number n for m * n to be a perfect square is "
							+ n + " m * n is " + (n * m));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}

}
