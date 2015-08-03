package zadaci_23_07_2015;

import java.util.Random;

//Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100 nasumiènih brojeva, 10 po liniji.

/**
 * @author Marina Sljivic
 *
 */
public class PrintCharsAndNumbers {

	/*
	 * This method prints 100 random generated uppercase chars and 100 random generated integers, ten per lines.
	 * 
	 */
	public static void print(){
		
		for(int i=0;i<100;i++){//from 0 to 99 (we want 100 prints)
			if(i%10==0 && i>0){ //if we have printed ten numbers 'i' will be equal to 10 so
				//and if i is not equal to 0(if its 0, we dont need to go to a new line, we are at the first line)
				System.out.println();//print (go to) a new line
			}
			Random random = new Random(System.nanoTime());//create a new Random object
			int asciiNumber = random.nextInt(26)+65; //we want to random generate an upper char, 
			//in ASCII code they are from number 65 to 90 (we have 26 chars),
			//so generate a number between 0 and 25 from wich depends 
			//what char is generated and then add 65.
			System.out.print((char)asciiNumber+"  ");//cast the asciiNumber to the char and print it
		}
		
		for(int i=0;i<100;i++){//same like above
			if(i%10==0){
				System.out.println();
			}
			Random random = new Random(System.nanoTime());
			int number = random.nextInt(10); //we want to random generate an integer from 0 to 9
			System.out.print(number+"  "); //print the number
			
		}
	}
	
	public static void main(String[] args) {
		print();	
	}

}
