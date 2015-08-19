package zadaci_13_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/*(Geometry: the bounding rectangle) A bounding rectangle is the minimum rectangle
that encloses a set of points in a two-dimensional plane, as shown in
Figure 10.24d. Write a method that returns a bounding rectangle for a set of
points in a two-dimensional plane, as follows:
public static MyRectangle2D getRectangle(double[][] points)
The Rectangle2D class is defined in Programming Exercise 10.13. Write a
test program that prompts the user to enter five points and displays the bounding
rectangle’s center, width and height.*/

/**
 * @author Marina Sljivic
 *
 */
public class BoundingRectangle {
	
	/**
	 * @param ds double...
	 * @return the greatest number in ds
	 */
	public static double max(double...ds){
		double max=ds[0]; //set the maximum to be the first element
		for(int i=1;i<ds.length;i++){
			max=Math.max(ds[i],max); //compare the current max with the i element and return the greater
		}
		return max;
	}
	/**
	 * @param ds double...
	 * @return the lowest number in ds
	 */
	public static double min(double...ds){
		double min=ds[0]; //set the minimum to be the first element
		for(int i=1;i<ds.length;i++){
			min=Math.min(ds[i],min); //compare the current min with the i element and return the lower
		}
		return min;
	}
	
	public static MyRectangle2D getRectangle(double[][] points){
		MyRectangle2D rectangle = new MyRectangle2D();//create a rectangle
		
		//find the max and min x-coordinate and y-coordinate of the points
		double minX = min(points[0][0],points[1][0],points[2][0],points[3][0],points[4][0]);
		double maxX = max(points[0][0],points[1][0],points[2][0],points[3][0],points[4][0]);
		double minY = min(points[0][1],points[1][1],points[2][1],points[3][1],points[4][1]);
		double maxY = max(points[0][1],points[1][1],points[2][1],points[3][1],points[4][1]);
		
		rectangle.setWidth(Math.abs(maxX-minX));
		//the width is the distance between the max X-coordinate and the min X-coordinate
		rectangle.setHeight(Math.abs(maxY-minY));
		//the height is the distance between the max Y-coordinate and the min Y-coordinate
		
		rectangle.setX(minX + rectangle.getWidth()/2);
		//the center's X is in the middle of the distance between minX and maxX
		rectangle.setY(minY + rectangle.getHeight()/2);
		//the center's Y is in the middle of the distance between minY and maxY
		
		return rectangle;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//create a scanner object that will scan the inputs
		double[][] points = new double[5][2];//five points with two coordinates (x,y)
		//ask the user to enter five points
		System.out.println("Enter five points x1,y1, x2,y2, x3,y3, x4,y4, x5,y5: ");
		
		try{
			for(int i=0;i<5;i++){
				for(int j=0;j<2;j++){
					points[i][j] = scan.nextDouble();//take the coordinate j for point i
				}
			}
			scan.close();//close the scanner object
			
			MyRectangle2D rectangle = getRectangle(points);//take the bounding rectangle and print it
			System.out.println("The bounding rectangle's center ("+rectangle.getX()
					+", "+rectangle.getY()+"), width "+rectangle.getWidth()+" and height "+rectangle.getHeight()+".");
		
		}catch(InputMismatchException e){//catch exception if the input is not a number
			System.out.println("Bad input! Point's coordinates are numbers!");
		}
		
	}

}
