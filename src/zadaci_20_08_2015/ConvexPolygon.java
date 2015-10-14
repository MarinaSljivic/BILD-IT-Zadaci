package zadaci_20_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/*A polygon is convex if it contains any line segments
that connects two points of the polygon. Write a program that prompts the user to
enter the number of points in a convex polygon, then enter the points clockwise,
and display the area of the polygon.*/

/**
 * @author Marina Sljivic
 *
 */
public class ConvexPolygon {
	
	/**
	 * @param points ArrayList of points, a point is an array size 2 for the coordinates (x,y)
	 * @return the area of the convex polygon that the points form
	 */
	public static double area(ArrayList<Double[]> points){
		//add to the area (X_(n-1)*Y_0 - Y_(n-1)*X_0) 
		double area = ((points.get(points.size()-1)[0] * points.get(0)[1]) 
				- (points.get(points.size()-1)[1] * points.get(0)[0]));
		//the formula is: sum (X_i*Y_(i+1) - Y_i*X_(i+1)) 
		//where i goes from 0 to n-1 included, n is the number of points
		//for every point in points: point[0] is for X, point[1] is for Y
		for(int i=0;i<points.size()-1;i++){
			area += ((points.get(i)[0] * points.get(i+1)[1]) 
					- (points.get(i)[1] * points.get(i+1)[0]));
		}
		
		return Math.abs(area)/2;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//list of points will hold the inputed points 
		ArrayList<Double[]> pointsList = new ArrayList<>();
		
		try{
			//take the number of points and their coordinates
			System.out.print("Enter the number of the points: ");
			int numberOfPoints = scan.nextInt();
			System.out.print("\nEnter the coordinates of the points: ");
			for(int i=0;i<numberOfPoints;i++){
				Double[] point = new Double[2];//to hold the coordinates (x,y)
				point[0] = scan.nextDouble();
				point[1] =scan.nextDouble();
				pointsList.add(point);//add the point to the list
			}
			//print the area
			System.out.println("The area of the polygon is "+area(pointsList));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		scan.close();
	}

}
