package zadaci_10_08_2015;

import java.util.Scanner;

import extrapackage.Numbers;

/*Latin square) A Latin square is an n-by-n array filled with n different Latin letters,
each occurring exactly once in each row and once in each column. Write a 
program that prompts the user to enter the number n and the array of characters,
as shown in the sample output, and checks if the input array is a Latin square.
The characters are the first n characters starting from A.*/

/**
 * @author Marina Sljivic
 *
 */
public class LatinSquare {

	/**
	 * A two dimensional array is a Latin square when:<br>
	 * - all its elements are from A to the nth letter, where n is the size of the array<br>
	 * - no two elements in a row are equal<br>
	 * - no two elements in a column are equal
	 * 
	 * @param array char[][] the square with the letters
	 * 
	 * @return true if the array is a Latin square, false is its not
	 */
	public static boolean isLatin(char[][] array){
		//checking the elements within each row for equality         
	    for(int i=0; i<array.length; i++){
	    	for(int j=0; j<array[0].length; j++){//for every [i][j] element
	    		
	    		for(int k=0; k<array[0].length; k++){//compare it with every 'k' element in the same 'i' row
	    			if(array[i][j]==array[i][k] && j!=k){
	    				//if there is an equal element to a[i][j] at different position in the same row
	    				//the square is not Latin return false
	    				return false;
	    			}
	    			
	    		}
	    	} 
	    }
	      
	    //checking the elements within each column for equality
	    for(int i=0; i<array.length; i++){
	    	for(int j=0; j<array[0].length; j++){ //for every [i][j] element	  
	    		for(int k=0; k<array.length; k++){//compare it with every 'k' element in the same 'j' column
	    			if(array[i][j]==array[k][j] && i!=k){
	    				//if there is an equal element to a[i][j] at different position in the same column
	    				//the square is not Latin return false
	    				return false;
	    			}
	    		}
	    	} 
	    }     
	    //if nothing was returned, the square passed the test, it is Latin, return true
	    return true; 
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//create the scanner oject to read the input

		System.out.println("Enter number n (the square size n*n): ");
		int n = Numbers.inputPositiveInteger(); //take the size with helper method, n must be greater than 0
		char[][] array = new char[n][n]; //the array will contain the possible Latin square size n
		
		//ask to enter the letters
		System.out.println("Enter "+n+" rows of letters separated by spaces: ");
		for(int i=0; i<array.length; i++){
			
			array[i] = scan.nextLine().replaceAll("\\s*", "").toCharArray();
			//take the inputed line as String, with "\\s*" remove all white spaces in the input, 
			//then convert the String to a char array
			
			for(int j=0; j<array[0].length; j++){
				
				//checking if the char a[i][j] is in the range from A to the n.th char:
				//every char in the array must be in ASCII of the range: from 65 to the (65+n-1)character,
				//where n is the size of the array. Example: array is 4*4 then it must contain only A,B,C,D
				//in ASCII code 65,66,67,68(68=65+4-1)
				if(array[i][j]<65 || array[i][j]>=(65+array.length)){
					//if array[i][j] is not an uppercase letter or if it is equal 
					//or bigger than the n.th char from A, print the mistake and exit
					System.out.println("Wrong input: the letters must be from A to "+(char)(65+array.length-1));
					System.exit(1);
				}
			}
		}
		//print is the array a Latin square or not
		if(isLatin(array)){
			System.out.println("The input array is a Latin square.");
		}else{
			System.out.println("The input array is not a Latin square.");
		}
		scan.close();//close the scanner object
	}

}
