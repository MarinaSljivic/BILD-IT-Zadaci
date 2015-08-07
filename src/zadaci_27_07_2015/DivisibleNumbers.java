package zadaci_27_07_2015;

/* Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po liniji, 
 * koji su djeljivi i sa 5 i sa 6. Razmak izmeðu brojeva treba biti taèno jedan space.*/

public class DivisibleNumbers {

	/**
	 * This method prints out all the numbers between 100 and 1000 that are divisible by 5 and 6.
	 */
	public static void byFiveAndSix(){
		//this will count all the printed numbers, so when it arrives to a multiple of 10
		//we know that we have to go to next line
		int countPrintedNumbers=0;
		
		for(int i=100;i<=1000;i++){//i represents all the numbers between 100 and 1000
			if(i%5==0 && i%6==0){//if i is divisible by 5 and 6 the rest in both cases is 0
				System.out.print(i+" ");//so print i and
				countPrintedNumbers++;//increase the counter of printed numbers
				if(countPrintedNumbers%10==0){//if the counter is a multiple of 10
					System.out.println();//go to next line
				}
			}
		}
	}
	
	public static void main(String[] args) {
		byFiveAndSix();
	}

}
