package zadaci_13_08_2015;

import zadaci_10_08_2015.AlgebraLinearEquations;
import zadaci_12_08_2015.MyPoint;

/*(Geometry: the Triangle2D class) Define the Triangle2D class that contains:
 - Three points named p1, p2, and p3 of the type MyPoint with getter and
setter methods. MyPoint is defined in Programming Exercise 10.4.
 - A no-arg constructor that creates a default triangle with the points (0, 0), (1,1), and (2, 5).
 - A constructor that creates a triangle with the specified points.
 - A method getArea() that returns the area of the triangle.
 - A method getPerimeter() that returns the perimeter of the triangle.
 - A method contains(MyPoint p) that returns true if the specified point
p is inside this triangle
 - A method contains(Triangle2D t) that returns true if the specified
triangle is inside this triangle.
 - A method overlaps(Triangle2D t) that returns true if the specified
triangle overlaps with this triangle.*/

/**
 * @author Marina Sljivic
 *
 */
public class Triangle2D {
	//three point that are tjemena trougla
	private MyPoint p1, p2, p3;

	/**
	 * No-arg constructor that creates a default triangle with the points (0, 0), (1,1), and (2, 5).
	 */
	public Triangle2D(){
		setP1(new MyPoint());
		setP2(new MyPoint(1, 1));
		setP3(new MyPoint(2, 5));
	}
	
	/**
	 * Constructor that creates a triangle with the specified points.<br>
	 * If the three points aren't a valid triangle creates the default triangle<br>
	 * (0, 0), (1,1), (2, 5).
	 * 
	 * @param p1 MyPoint
	 * @param p2 MyPoint
	 * @param p3 MyPoint
	 */
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3){
		this();//create a default triangle in case the points are not a valid triangle
		
		if (areCollinear(p1, p2, p3)){ //if they are collinear print that and will have default triangle
			System.out.println("The points don't make a triangle, they are collinear!"
					+ "Default triangle (0,0),(1,1),(2,5) has been created.");
		}else{ //else create a triangle with specified points
			setP1(p1);
			setP2(p2);
			setP3(p3);
		}
	}
	//getters and private setters so the triangle can't never be invalid
	public MyPoint getP1() {
		return p1;
	}
	private void setP1(MyPoint p1) {
		this.p1 = p1;
	}
	public MyPoint getP2() {
		return p2;
	}
	private void setP2(MyPoint p2) {
		this.p2 = p2;
	}
	public MyPoint getP3() {
		return p3;
	}
	private void setP3(MyPoint p3) {
		this.p3 = p3;
	}
	
	/**
	 * @param p1 MyPoint
	 * @param p2 MyPoint
	 * @param p3 MyPoint
	 * @return true if p1,p2,p3 are on same line, false if they're not
	 */
	public boolean areCollinear(MyPoint p1, MyPoint p2, MyPoint p3){
		//the points(a,b), (m,n) and (x,y) are collinear if and only if:
		//(n-b)(x-m)=(y-n)(m-a)
		return (p2.getY()-p1.getY()) * (p3.getX()-p2.getX()) 
				== (p3.getY()-p2.getY()) * (p2.getX()-p1.getX());
	}
	
	/**
	 * @return the area of this triangle
	 */
	public double getArea(){
		//formula for the triangle's area
		double s = getPerimeter()/2.0;
		double area = Math.sqrt(s * (s-getP1().distance(getP2()))
				*(s-getP1().distance(getP3())) *(s-getP2().distance(getP3())));
		//return the area
		return area;
	}
	
	/**
	 * @return the perimeter of this triangle
	 */
	public double getPerimeter(){
		return getP1().distance(getP2())
					+getP1().distance(getP3()) +getP2().distance(getP3());
	}
	
	/**
	 * @param point MyPoint
	 * @return true if this triangle contains point, otherwise false
	 */
	public boolean contains(MyPoint point){
		//if the point P is inside triangle ABC then it divides the triangle in 1, 2 or 3 triangles
		//the sum of the little 3 triangle's areas is equal to the triangle area
		
		//find the areas of the three little triangles P forms with A, B, C
		double ABP = Math.abs (getP1().getX() * (getP2().getY() - point.getY()) 
				+ getP2().getX() * (point.getY() - getP1().getY()) + point.getX() 
				* (getP1().getY() - getP2().getY()));
		
		double APC = Math.abs (getP1().getX() * (point.getY() - getP3().getY()) 
				+ point.getX() * (getP3().getY() - getP1().getY()) + getP3().getX() 
				* (getP1().getY() - point.getY()));
		
		double PBC = Math.abs (point.getX() * (getP2().getY() - getP3().getY()) 
				+ getP2().getX() * (getP3().getY() - point.getY()) + getP3().getX() 
				* (point.getY() - getP2().getY()));

		//return true if the sum of these 3 areas are equal to the area of triangle ABC
		//else return false (P is outside the triangle and the sum area is bigger than ABC's area)
		return ABP + APC + PBC == getArea();
	}
	
	/**
	 * @param t Triangle2D
	 * @return true if this triangle contains the specified triangle t, otherwise false.
	 */
	public boolean contains(Triangle2D t){
		//this triangle contains t if it contains all t's points
		return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
	}
	
	/**
	 * @param p1 MyPoint
	 * @param p2 MyPoint
	 * @param p3 MyPoint
	 * @param p4 MyPoint
	 * @return true if the segment p1p2 has one intersecting point with segment p3p4<br>
	 * 			otherwise return false
	 */
	public static boolean hasIntersectingPoint(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4){
				
		//find if the two lines p1p2 and p3p4 have an intersecting point
		double[][] a = new double[2][2]; //the coefficients
		a[0][0] = p1.getY()-p2.getY(); //y1-y2
		a[0][1] = -(p1.getX()-p2.getX()); //-(x1-x2)
		a[1][0] = p3.getY()-p4.getY(); //y3-y4
		a[1][1] = -(p3.getX()-p4.getX()); //-(x3-x4)
		
		double[] b = new double[2]; //the constant terms
		//b[0] is (y1 - y2)x1 - (x1 - x2)y1
		b[0] = a[0][0] * p1.getX() + a[0][1] * p1.getY();
		//b[1] is (y3 - y4)x3 - (x3 - x4)y3
		b[1] = a[1][0] * p3.getX() + a[1][1] * p3.getY();
		
		//the intersecting point is the result of a system of linear equations
		double[] result = AlgebraLinearEquations.linearEquation(a, b);
		//if the result is not null the intersecting point exists
		if(result != null){
			//if the intersecting point(x,y) exists then x must be between the x-coordinates of the segments
			if(result[0]>Math.min(p1.getX(), p2.getX()) && result[0]<Math.max(p1.getX(), p2.getX())
					&&
				result[0]>Math.min(p3.getX(), p4.getX()) && result[0]<Math.max(p3.getX(), p4.getX())){
				return true; 
			}
		}
		return false;//else they don't have intersecting point so return false
	}
	
	/**
	 * @param t Triangle2D
	 * @return true if this triangle overlaps with the specified triangle, otherwise returns false.
	 */
	public boolean overlaps(Triangle2D t){
		//if one of three sides of this triangle have an intersecting point with 
		//any side of t, then they overlaps
		
				//if side p1 p2 has an intersecting point with side t.p1 t.p2
		if ( 		hasIntersectingPoint(getP1(), getP2(), t.getP1(), t.getP2())
				//or p1 p2 with t.p2 t.p3
				|| hasIntersectingPoint(getP1(), getP2(), t.getP2(), t.getP3())
				//or p1 p2 with t.p1 t.p3
				|| hasIntersectingPoint(getP1(), getP2(), t.getP1(), t.getP3())
				
				//or p1 p3 with t.p1 t.p2
				|| hasIntersectingPoint(getP1(), getP3(), t.getP1(), t.getP2())
				//or p1 p3 with t.p2 t.p3
				|| hasIntersectingPoint(getP1(), getP3(), t.getP2(), t.getP3())
				//or p1 p3 with t.p1 t.p3
				|| hasIntersectingPoint(getP1(), getP3(), t.getP1(), t.getP3())
				
				//or p2 p3 with t.p1 t.p2
				|| hasIntersectingPoint(getP2(), getP3(), t.getP1(), t.getP2())
				//or p2 p3 with t.p2 t.p3
				|| hasIntersectingPoint(getP2(), getP3(), t.getP2(), t.getP3())
				//or p2 p3 with t.p1 t.p3
				|| hasIntersectingPoint(getP2(), getP3(), t.getP1(), t.getP3())
				
			){
				return true; //then they overlaps so return true
			}
		return false; //otherwise return false
	}
}
