package zadaci_03_08_2015;

/* Pretpostavimo da �kolarina za godinu dana na fakultetu ko�ta 10.000 i da se pove�ava za 5% svake godine. 
 * Godinu dana od danas, �kolarina �e iznositi 10.500. Napisati program koji izra�unava koliko �e �kolarina 
 * za godinu dana iznositi kroz 10 godina.*/

/**
 * @author Marina Sljivic
 *
 */
public class Scholarships {
	
	/**
	 * @param scholarship int
	 * @param afterYears int
	 * @return the amount of the scholarship for one year after passed years from the first scholarship
	 */
	public static int calculateAmount(int scholarship, int afterYears){
		
		for(int i=0; i<afterYears; i++){ //we need afterYears iterations (calculations)
			scholarship += scholarship * 5/100; 
			//every year 'i' the scholarship increases for 5% of the previous
		}
		
		return scholarship;//return the scholarship
	}
	
	public static void main(String[] args) {
		System.out.println("The scholarship for one year after 10 years is "+calculateAmount(10000, 10)+".");

	}

}
