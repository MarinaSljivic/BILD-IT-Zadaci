package zadaci_10_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*(Geometry: area of a triangle) Write a method that returns the area of a triangle
using the following header:
public static double getTriangleArea(double[][] points)
 The points are stored in a 3-by-2 two-dimensional array points with points[0]
[0] and points[0][1] for (x1, y1). The triangle area can be computed using the
formula in Programming Exercise 2.19. The method returns 0 if the three points
are on the same line. Write a program that prompts the user to enter three points of
a triangle and displays the triangle's area. */

/**
 * @author Marina Sljivic
 *
 */
public class GeometryTriangleArea {
	
	/**
	 * @param points double[][] 3-by-2, points of the triangle
	 * @return the area of the triangle given its three points, <br>
	 * 			if the points are on the same line returns 0 <br>
	 * 			(In some cases, because of the double I think, returns NaN and 0.0<br>
	 * 			see: 2 2 4.5 4.5 6 6 and 1 1 5 5 7 7)
	 */
	public static double getTriangleArea(double[][] points){
		double[] size = new double[3]; //the triangle's sizes
		//the first size is sqrt((x1-x2)^2+(y1-y2)^2)
		size[0] = Math.sqrt(Math.pow(points[0][0]-points[1][0], 2) + Math.pow(points[0][1]-points[1][1], 2));
		size[1] = Math.sqrt(Math.pow(points[0][0]-points[2][0], 2) + Math.pow(points[0][1]-points[2][1], 2));
		size[2] = Math.sqrt(Math.pow(points[1][0]-points[2][0], 2) + Math.pow(points[1][1]-points[2][1], 2));
		
		//formula for the triangle's area
		double s = (size[0]+size[1]+size[2])/2;
		double area = Math.sqrt(s*(s-size[0])*(s-size[1])*(s-size[2]));
		
		return area;
	}
	public static void main(String[] args) {
		//tell the user to input the triangle's points
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the three triangle's points x1,y1,x2,y2,x3,y3: ");
		double[][] points = new double[3][2]; //array with points
		try{
			//try to take the input from the user
			for(int i=0; i<points.length; i++){
				for(int j=0; j<points[0].length; j++){
					points[i][j]= scan.nextDouble(); //(points[0][0], points[0][1]) for (x1, y1)
				}
			}
			if(getTriangleArea(points) != 0){
				System.out.printf("The area of the triangle is %.2f",getTriangleArea(points));
			}else{
				System.out.println("The three points are on the same line");
			}
		}catch(InputMismatchException e){ //if the user didn't input a number
			System.out.println("Wrong input!");
		}
		
		scan.close();

	}

}
