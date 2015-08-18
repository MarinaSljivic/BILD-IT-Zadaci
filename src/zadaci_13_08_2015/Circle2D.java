package zadaci_13_08_2015;

import zadaci_12_08_2015.MyPoint;

/*(Geometry: the Circle2D class) Define the Circle2D class that contains:
 - Two double data fields named x and y that specify the center of the circle
with getter methods.
 - A data field radius with a getter method.
 - A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
for radius.
 - A constructor that creates a circle with the specified x, y, and radius.
 - A method getArea() that returns the area of the circle.
 - A method getPerimeter() that returns the perimeter of the circle.
 - A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this circle (see Figure 10.21a).
 - A method contains(Circle2D circle) that returns true if the specified
circle is inside this circle (see Figure 10.21b).
 - A method overlaps(Circle2D circle) that returns true if the specified
circle overlaps with this circle*/

/**
 * @author Marina Sljivic
 *
 */
public class Circle2D {
	private double x, y; //the center of the circle
	private double radius; //its radius

	//getters for x, y and radius
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	
	/** No-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius.*/
	public Circle2D(){
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	/**A constructor that creates a circle with the specified x, y, and radius.<br>
	 * If the radius is less than 1 it will be set to 1.
	 * @param x double
	 * @param y double
	 * @param radius double*/
	public Circle2D(double x, double y, double radius){
		//set the values for x and y coordinates of the centre
		this.x = x;
		this.y = y;
		//if the radius is greater than 1 it will be set to the specified value, else it will be set to 1.
		if(radius>1){
			this.radius = radius;
		}else{
			this.radius = 1;
		}
	}
	
	/** @return the area of the circle */
	public double getArea(){
		return Math.pow(getRadius(), 2) * Math.PI;
	}
	/** @return the perimeter of the circle */
	public double getPerimeter(){
		return 2 * getRadius() * Math.PI;
	}
	
	/**
	 * @param x double
	 * @param y double
	 * @return true if the specified point (x, y) is inside this circle, false if it's not.
	 */
	public boolean contains(double x, double y){
		//create a new point with the specified x and y
		MyPoint point = new MyPoint(x,y);
		//if the distance between the point and the center is <= than the radius
		//returns true, else it's false
		return point.distance(getX(), getY()) <= getRadius();
	}
	
	/**
	 * @param circle Circle2D
	 * @return true if this circle contains the circle, false if it don't.
	 */
	public boolean contains(Circle2D circle){
		//create a new point with the center of the circle
		MyPoint circleCenter = new MyPoint(x,y);
		//if the distance between the center's of the two circles + the radius of the specified circle 
		//is <= than the radius of this circle returns true, else it's false
		return circleCenter.distance(getX(), getY()) + circle.getRadius() <= getRadius();
	}
	
	/**
	 * @param circle Circle2D
	 * @return true if this circle overlaps the circle, false if it don't.
	 */
	public boolean overlaps(Circle2D circle){
		//create a new point with the center of the circle
		MyPoint circleCenter = new MyPoint(circle.getX(),circle.getY());
		//if the distance between the center's of the two circles  
		//is <= than the sum of the two circle's radiuses returns true, else it's false
		return circleCenter.distance(getX(), getY()) <= getRadius() + circle.getRadius() ;
	}
}
