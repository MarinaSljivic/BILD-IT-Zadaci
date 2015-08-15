package zadaci_10_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*(Geometry: intersecting point) Write a method that returns the intersecting point of
two lines. The intersecting point of the two lines can be found by using the formula
shown in Programming Exercise 3.25:
the result this linear equations's system (x,y) is the intersecting point:
		(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
		(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3

Assume that (x1, y1) and (x2, y2) are the
two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header is
public static double[] getIntersectingPoint(double[][] points)
 The points are stored in a 4-by-2 two-dimensional array points with
(points[0][0], points[0][1]) for (x1, y1). The method returns the intersecting
point or null if the two lines are parallel. Write a program that prompts
the user to enter four points and displays the intersecting point.*/

/**
 * @author Marina Sljivic
 *
 */
public class GeometryIntersectiongPoint {
	
	/**
	 * This method finds the intersecting point of two lines.<br>
	 * The result of this linear equations's system (x,y) is the intersecting point:<br>
		(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1 <br>
		(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3 <br>
	 * @param points double[][] four points, <br>
	 * 					the first two points are on the first line and the last two are on the second line
	 * @return the intersecting point of the two lines or null if the two lines are parallel.
	 */
	public static double[] getIntersectingPoint(double[][] points){

		double[][] a = new double[2][2]; //the coefficients
		a[0][0] = points[0][1]-points[1][1]; //y1-y2
		a[0][1] = -(points[0][0]-points[1][0]); //-(x1-x2)
		a[1][0] = points[2][1]-points[3][1]; //y3-y4
		a[1][1] = -(points[2][0]-points[3][0]); //-(x3-x4)
		
		double[] b = new double[2]; //the constant terms
		//b[0] is (y1 - y2)x1 - (x1 - x2)y1
		b[0] = a[0][0]*points[0][0] + a[0][1]*points[0][1];
		//b[1] is (y3 - y4)x3 - (x3 - x4)y3
		b[1] = a[1][0]*points[2][0] + a[1][1]*points[2][1];
		
		//the intersecting point is the result of a system of linear equations
		return AlgebraLinearEquations.linearEquation(a, b); 
	}
	
	public static void main(String[] args) {
		//tell the user to input the points
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the four points: ");
		double[][] points = new double[4][2]; //array with points
		try{
			//try to take the input from the user
			for(int i=0; i<points.length; i++){
				System.out.println("Enter (x"+(i+1)+", y"+(i+1)+")");
				for(int j=0; j<points[0].length; j++){
					points[i][j]= scan.nextDouble(); //(points[0][0], points[0][1]) for (x1, y1)
				}
			}
			
			//print the intersection result
			double[] result = getIntersectingPoint(points);
			if(result == null){
				System.out.println("The two lines are parallel.");
			}else{
				System.out.printf("The intersecting point is (%.2f,%.2f).", result[0], result[1]);
			}
		}catch(InputMismatchException e){ //if the user didn't input a number
			System.out.println("Wrong input!");
		}
		
		scan.close();
	}

}
