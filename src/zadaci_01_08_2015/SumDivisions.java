package zadaci_01_08_2015;

/* Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99*/

/**
 * @author Marina Sljivic
 *
 */
public class SumDivisions {

	public static void main(String[] args) {
		double sum = 0;//will contain the sum 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99
		for(double i=1; i<98; i+=2 ){//i will be the odd numbers from 1 to 97, start from 1 and increments for 2 to 97
			sum += i/(i+2);//add to the sum the division i/(i+2)
		}
		//print the sum
		System.out.println("1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99 = "+sum);
	}

}
