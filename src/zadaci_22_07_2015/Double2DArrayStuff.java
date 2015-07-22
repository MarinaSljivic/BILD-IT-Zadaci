package zadaci_22_07_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

//Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu. Metoda treba da koristi sljedeæi header:
//public static int[ ] locateLargest(double[ ][ ] a)
//Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju najveæeg elementa u nizu.

/**
 * @author Marina Sljivic
 *
 */
public class Double2DArrayStuff {
	
	/**
	 * This method takes a 2D array type double as parameter and returns the location, 
	 * an array with two integers that represents the location(indexes) of the largest element in the 2D array.
	 * If the 2D array is empty or null, returns null.
	 * 
	 * @param a 
	 * 			2D array type double
	 * @return location
	 * 			array with two integers that represents the location of the largest element in the 2D array
	 */
	public static int[] locateLargest(double[][] a){
		int[] location=null;
		
		try{
			//if the 2D array isnt empty, null and its subarray isnt empty too
			if (a.length != 0 && a != null && a[0].length!=0) {
				location = new int[2]; //the array with the location of the largest number in the 2D array,
				//the first element will be the index for the subarray, the second will be the index in the subarray
				
				double maxValue=a[0][0];//set the first element in the first subarray to be the largest value
				
				for(int i=0;i<a.length;i++){ //a.length is the number of subarrays, i-their index in the 2D array
					for(int j=0;j<a[0].length;j++){ //a[0].length is the length of every subarray, the number of elements
						//in the subarray, j-their index in the subarray
						if(a[i][j]>maxValue){ //if an element is bigger than the maxValue
							maxValue = a[i][j]; //maxValue becomes that element
							//the array location takes its indexes
							location[0]=i;
							location[1]=j;
						}
					}
				}
			}
		}catch(NullPointerException e) {
			e.getStackTrace();
		}
		return location;
	}

	/**
	 * These method asks the user to input the dimensions for the 2D array,
	 * and then its elements, double numbers, one number per line, when he wants to stop
	 *  he has to type 0. Then the method returns the 2D array that contains its inputs.
	 * 
	 * @return a 2Darray that contains user's inputs
	 */
	public static double[][] input2DArray(){
		Scanner scan = new Scanner(System.in);		
		
		
		System.out.println("Enter the dimensions of the 2D array.");
		int subarrays=0;//set the dimensions to 0
		int subarraysLength=0;
		
		boolean continueInput = true;//these means that we need to continue to take users inputs
		do {
			try {
				System.out.println("Enter the 2D array length: ");
				subarrays = scan.nextInt();// is the number of subarrays we want to have, the length of the 2D array
				continueInput = false;//then we dont need to continue input (it is false),
				//the right number has been entered
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: an integer is required)");
				scan.nextLine(); // discard the current input, pass to the nextLine
			}
		}while (continueInput);//while the number is not entered correctly(continueInput is true)
		continueInput = true;//these means that we need to continue to take users inputs
		do {
			try {
				System.out.println("Enter the subarrays' length: ");
				subarraysLength = scan.nextInt();// the length of every subarray
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: an integer is required)");
				scan.nextLine(); // discard the current input, pass to the nextLine
			}
		}while (continueInput);//while the number is not entered correctly(continueInput is true)
		
		double[][] array=new double[subarrays][subarraysLength]; //the 2D array that will contain user's inputs
		
		for(int i=0;i<subarrays;i++){
			for(int j=0;j<subarraysLength;j++){
				continueInput = true;//these means that we need to continue to take users inputs
				do {
					try {
						System.out.println("Enter the ["+i+"]["+j+"] element: ");
						
						double input = scan.nextDouble(); //try to take the user's input
						array[i][j]=input;//add the user's input in the array
						//if this passed without exceptions, errors
						continueInput = false; //then we dont need to continue input (it is false),
												//the right number has been entered
					} catch (InputMismatchException ex) {
						System.out.println("Try again. (Incorrect input: a double is required)");
						scan.nextLine(); // discard the current input, pass to the nextLine
					}
				}while (continueInput);//while the number is not entered correctly(continueInput is true)
			}	
		} 
		return array;
	}
	
	public static void main(String[] args) {
		//double[][] arr={{},{}};
		//double[][] arr={};
		//double[][] arr=null;
		
		double[][] arr=input2DArray(); //take the 2D array from the user
		
		if(locateLargest(arr)!=null){ //if the 2D array isnt null print the position
			System.out.println("The largest element is at position: "+locateLargest(arr)[0]+", "+locateLargest(arr)[1]);
		}else{//else print that there are no elements
			System.out.println("There are no elements in the array.");
		}
	}

}
