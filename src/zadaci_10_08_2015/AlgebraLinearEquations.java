package zadaci_10_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*(Algebra: solve linear equations) Write a method that solves the following
2 * 2 system of linear equations:
a00x + a01y = b0
a10x + a11y = b1
x = b0a11 - b1a01 / a00a11 - a01a10
y = b1a00 - b0a10 / a00a11 - a01a10
 The method header is
public static double[] linearEquation(double[][] a, double[] b)
 The method returns null if a00a11 - a01a10 is 0. Write a test program that
prompts the user to enter a00, a01, a10, a11, b0, and b1, and displays the result. If
a00a11 - a01a10 is 0, report that “The equation has no solution.” A sample run is
similar to Programming Exercise 3.3*/

public class AlgebraLinearEquations {
	
	/**
	 * This method solves a system of linear equations 
	 * 
	 * @param a double[][] the coefficients
	 * @param b double[] the constant terms
	 * @return the solution, a double[] that contains the result or null if there is no solution

	 */
	public static double[] linearEquation(double[][] a, double[] b){
		double detA = a[0][0]*a[1][1] - a[0][1]*a[1][0];//the determinant of a
		if(detA == 0){//if the determinant of a is 0 return null
			return null;
		}else{
			double[] solution = new double[2]; //solution of the system: the first element is x, the second is y
			solution[0] = (b[0]*a[1][1] - b[1]*a[0][1]) / detA; //calculate x
			solution[1] = (b[1]*a[0][0] - b[0]*a[1][0]) / detA; //calculate y
			return solution; //return the solution
		}
	}
	
	public static void main(String[] args) {
		
		//tell the user to input the coefficients and the constant terms
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a00, a01, a10, a11, b0, and b1: ");
		double[][] a = new double[2][2]; //array of coefficients
		double[] b = new double[2]; //array of constant terms
		try{
			//try to take the input from the user
			for(int i=0; i<a.length; i++){
				for(int j=0; j<a[0].length; j++){
					a[i][j]= scan.nextDouble();
				}
			}
			b[0] = scan.nextDouble();
			b[1] = scan.nextDouble();
			
			//print how the inputed system looks like
			System.out.println("You inputed the system \n"+a[0][0]+"x + "+a[0][1]+"y = "+b[0]+"\n"
					+a[1][0]+"x + "+a[1][1]+"y = "+b[1]);
			
			//print the result of the system
			double[] result = linearEquation(a, b);
			if(result == null){
				System.out.println("The equation has no solution.");
			}else{
				System.out.println("The result is\nx = "+result[0]+"\ny = "+result[1]);
			}
		}catch(InputMismatchException e){ //if the user didn't input a number
			System.out.println("Wrong input!");
		}
		scan.close();
	}
		
}
