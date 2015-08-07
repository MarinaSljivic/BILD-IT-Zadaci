package zadaci_26_07_2015;

/*Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca,
 * iskljuèujuæi sebe. Na primjer, 6 je prvi savršeni broj jer 6 = 3 + 2 + 1. 
 * Sljedeæi savršeni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1.
 * Samo 4 savršena broja postoje u rasponu od 0 do 10.000. Napišite program koji ispisuje sva 4.*/

/**
 * @author Marina Sljivic
 *
 */
public class PerfectNumber {

	/**
	 * Given an integer number, this method returns true if its a perfect number, false if its not.
	 * 
	 * @param number int
	 * @return boolean value, true if its a perfect number, false if its not
	 */
	public static boolean isPerfectNumber(int number){
		int sum = 0;//this is the sum of the dividers, set to 0

		//for every number, check who are its divisors from 1 to number
		for (int i=1; i<number; i++) {
			if (number % i == 0) {//if the number is divisible by i then
				sum += i;//add it to the sum
			}
		}
		if (sum==number) {//if the sum of all the dividers equals to number, than its a perfect number
			return true;//return true
		}else{
			return false;//else its not perfect and return false
		}
	}
	
	/**
	 * This method prints the four perfect numbers from 0 to 10000
	 */
	public static void printFourPerfectNumbers() {

		//we are going to check all the numbers from 0(0:0 its not defined so its from 1) to 10000
		for (int i=1; i<=10000; i++) {
			if(isPerfectNumber(i)){ //if number i is perfect
				System.out.println(i); //print it
			}
		}
	}
	public static void main(String[] args) {
		printFourPerfectNumbers(); //print the 4 numbers
	}

}
