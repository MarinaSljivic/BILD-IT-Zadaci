package zadaci_17_08_2015;

import java.util.Scanner;

/*(The Triangle class) Design a class named Triangle that extends
GeometricObject. The class contains:
- Three double data fields named side1, side2, and side3 with default
values 1.0 to denote three sides of the triangle.
- A no-arg constructor that creates a default triangle.
- A constructor that creates a triangle with the specified side1, side2, and
side3.
- The accessor methods for all three data fields.
- A method named getArea() that returns the area of this triangle.
- A method named getPerimeter() that returns the perimeter of this triangle.
- A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Programming Exercise 2.19.
The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
" side3 = " + side3;
Draw the UML diagrams for the classes Triangle and GeometricObject and
implement the classes. Write a test program that prompts the user to enter three
sides of the triangle, a color, and a Boolean value to indicate whether the triangle
is filled. The program should create a Triangle object with these sides and set
the color and filled properties using the input. The program should display
the area, perimeter, color, and true or false to indicate whether it is filled or not.
*/

/**
 * @author Marina Sljivic
 *
 */
public class Triangle extends GeometricObject{

	private double side1, side2, side3;
	
	/**
	 * Constructs a newly allocated default Triangle object, all the sides have value 1.
	 */
	public Triangle(){
		setSide1(1);
		setSide2(1);
		setSide3(1);
	}

	/**
	 * Constructs a newly allocated Triangle object with the specified<br>
	 * sides if they defines a triangle, otherwise a default triangle is created.
	 * @param side1 double
	 * @param side2 double
	 * @param side3 double
	 */
	public Triangle(double side1, double side2, double side3){
		this(); //create a default triangle
		//if the specified sides defines a triangle then set them
		if(side1+side2>side3 && side1>0 && side2>0 && side3>0){
			setSide1(side1);
			setSide2(side2);
			setSide3(side3);
		}
	}
		
	//accessor methods for all three data fields
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	/**
	 * @return the area of this Triangle
	 */
	public double getArea(){
		double s = getPerimeter()/2;
		double area = Math.sqrt(s*(s-getSide1())*(s-getSide2())*(s-getSide3()));
		return area;
	}
	/**
	 * @return the perimeter of this Triangle
	 */
	public double getPerimeter(){
		return getSide1()+getSide2()+getSide3();
	}
	
	@Override
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
	
	public static void main(String[] args) {
		//test program:
		Scanner scan = new Scanner(System.in);
		try{
			//ask to enter the sides, the color and if it is filled
			System.out.print("Enter the three sides of the triangle "
				+ "\nside1 = ");
			double side1 = scan.nextDouble();
			System.out.print("side2 = ");
			double side2 = scan.nextDouble();
			System.out.print("side3 = ");
			double side3 = scan.nextDouble();
			System.out.print("Enter the color of the triangle: ");
			String color = scan.next();
			System.out.print("Is filled (true or false)? ");		
			Boolean filled = scan.nextBoolean();
			
			//create a triangle object and set the color and filled properties
			Triangle triangle = new Triangle(side1, side2, side3);
			triangle.setColor(color);
			triangle.setFilled(filled);
			
			//display the triangle properties
			System.out.print(triangle+"\nArea: "+triangle.getArea()
					+"\nPerimeter: "+triangle.getPerimeter()
					+"\nColor: "+triangle.getColor()
					+"\nIs filled? "+triangle.isFilled());
		}catch(Exception e){
			System.out.println("Invalid input.");
		}
		scan.close();
	}
}

class GeometricObject {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	/** Construct a geometric object with the specified color
	* and filled value */
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/** Return color */
	public String getColor() {
		return color;
	}
	
	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}
	
	/** Return filled. Since filled is boolean,
	its getter method is named isFilled */
	public boolean isFilled() {
		return filled;
	}
	
	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	/** Return a string representation of this object */
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
				" and filled: " + filled;
	}
	
}
