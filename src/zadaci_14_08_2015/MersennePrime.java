package zadaci_14_08_2015;

import java.math.BigInteger;


/*(Mersenne prime) A prime number is called a Mersenne prime if it can be written
in the form 2^p - 1 for some positive integer p. Write a program that finds
all Mersenne primes with p <= 100 and displays the output as shown below.
(Hint: You have to use BigInteger to store the number, because it is too big to
be stored in long. Your program may take several hours to run.)
 p 2^p – 1
 2 3
 3 7
 5 31
...*/

/**
 * @author Marina Sljivic
 *
 */
public class MersennePrime {

	public static void main(String[] args) {
		
		System.out.println("p\t 2^p-1"); 
		
		for(int p=1; p<=100; p++){//p is from 1 to 100
			//create a maybe marsennePrime: 2^p - 1
			BigInteger marsennePrime = (new BigInteger(2+"").pow(p)).subtract(BigInteger.ONE);
			
			if(marsennePrime.isProbablePrime(1000000000)){//if it is a probable Marsenne prime
				//the probability marsennePrime is prime exceeds 1 - 1/2^1000000000
				System.out.println(p+"\t"+ marsennePrime.toString());//print the p and the marsennePrime
			}
		}

	}

}
