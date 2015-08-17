package zadaci_12_08_2015;

/*(The MyPoint class) Design a class named MyPoint to represent a point with
x- and y-coordinates. The class contains:
 - The data fields x and y that represent the coordinates with getter
methods.
 - A no-arg constructor that creates a point (0, 0).
 - A constructor that constructs a point with specified coordinates.
 - A method named distance that returns the distance from this point to a
specified point of the MyPoint type.
 - A method named distance that returns the distance from this point to
another point with specified x- and y-coordinates.
Draw the UML diagram for the class and then implement the class. Write a
test program that creates the two points (0, 0) and (10, 30.5) and displays the
distance between them.*/

/**
 * @author Marina Sljivic
 *
 */
class MyPoint{
	//data field x and y are the coordinates of MyPoint
	private double x, y;
	
	/**
	 * No-arg constructor that creates a point (0, 0).
	 */
	public MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Constructor that constructs a point with specified coordinates.
	 * @param x double first coordinate
	 * @param y double second coordinate
	 */
	public MyPoint(double x, double y){
		//set the value of x and y to the specified coordinates
		this.x = x;
		this.y = y;
	}
	
	//getters for x and y
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	/**
	 * @param point double
	 * @return the distance from this point to a specified point of the MyPoint type
	 */
	public double distance(MyPoint point){
		//return the distance using the method with the given x and y coordinates
		return distance(point.getX(), point.getY());
	}
	
	/**
	 * @param x
	 * @param y
	 * @return the distance from this point to another point with specified x- and y-coordinates.
	 */
	public double distance(double x, double y){
		//return the distance using the formula for the distance between two points
		return Math.sqrt( Math.pow( x-getX(), 2) + Math.pow( y-getY(), 2));
	}
	
	//overriding the method toString() for an easy printing the MyPoint
	@Override
	public String toString(){
		return "("+getX()+", "+getY()+")";
	}
}

/**
 * @author Marina Sljivic
 *
 */
public class TestMyPoint {

	public static void main(String[] args) {
		//create the two points (0, 0) and (10, 30.5) and displays the distance between them
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);
		System.out.printf("The distance between "+point1+" and "+point2+" is %.2f",point1.distance(point2));
	}

}
