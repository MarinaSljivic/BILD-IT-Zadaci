package zadaci_13_08_2015;

/*(Geometry: the MyRectangle2D class) Define the MyRectangle2D class that
contains:
 -Two double data fields named x and y that specify the center of the rectangle
with getter and setter methods. (Assume that the rectangle sides are
parallel to x- or y- axes.)
 - The data fields width and height with getter and setter methods.
 - A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and
1 for both width and height.
 - A constructor that creates a rectangle with the specified x, y, width, and
height.
 - A method getArea() that returns the area of the rectangle.
 - A method getPerimeter() that returns the perimeter of the rectangle.
 - A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this rectangle (see Figure 10.24a).
 - A method contains(MyRectangle2D r) that returns true if the specified
rectangle is inside this rectangle (see Figure 10.24b).
 - A method overlaps(MyRectangle2D r) that returns true if the specified
rectangle overlaps with this rectangle (see Figure 10.24c).*/

/**
 * @author Marina Sljivic
 *
 */
public class MyRectangle2D {
	private double x, y; //the center of the rectangle, the sides are parallel with the axes
	private double width, height; //width and height of the rectangle
	
	//getters and setters of the data fields
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width>0){
			this.width = width;
		}else{
			System.out.println("Invalid width.");
		}
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height>0){
			this.height = height;
		}else{
			System.out.println("Invalid height.");
		}
	}

	/**No-arg constructor that creates a default rectangle with (0, 0) 
	 * for (x, y) and 1 for both width and height.*/
	public MyRectangle2D(){
		setX(0);
		setY(0);
		setWidth(1);
		setHeight(1);
	}
	
	/**A constructor that creates a rectangle with the specified x, y, width, and height.*/
	public MyRectangle2D(double x, double y, double width, double height){
		this(); //create a default rectangle in case width and height are negative
		
		if(width>0 && height>0){//if the width and the height are valid, create the specified rectangle
			setX(x);
			setY(y);
			setWidth(width);
			setHeight(height);
		}else{
			//else print that the default was created
			System.out.println("The specified rectangle is invalid! Default rectangle, "
					+ "with center (0, 0) and width and height both 1, has been created.");
		}
	}
	
	/**
	 * @return the area of this rectangle
	 */
	public double getArea(){
		return getWidth() * getHeight();
	}
	
	/**
	 * @return the perimeter of this rectangle
	 */
	public double getPerimeter(){
		return 2 * (getWidth() + getHeight());
	}
	
	/**
	 * @param x double
	 * @param y double
	 * @return true if this rectangle contains the point (x, y), otherwise false
	 */
	public boolean contains(double x, double y){
		//the point (x,y) is inside this rectangle ABCD
		//(A is in the left-lower corner, B right-lower, C right-above, D left-above) if its coordinates
		//are bigger than the smallest rectangle's coordinates, and lower than the biggest rectangle's coordinates
		// Ax <= x <= Bx and Ay <= y <= Dy
		double Ax = getX() - getWidth()/2; //the center's X minus the half-width
		double Bx = getX() + getWidth()/2; //the center's X plus the half-width
		double Ay = getY() - getHeight()/2; //the center's Y minus the half-height
		double Dy = getY() + getHeight()/2; //the center's Y plus the half-height
		
		return x>=Ax && x<=Bx && y>=Ay && y<=Dy;
	}
	
	/**
	 * @param r MyRectangle2D
	 * @return true if the specified rectangle is inside this rectangle, otherwise returns false
	 */
	public boolean contains(MyRectangle2D r){
		//this rectangle contains r if it contains its four points 
		return contains(r.getX() - r.getWidth()/2, r.getY() - r.getHeight()/2)  //if it contains A(x,y)
				&&  contains(r.getX() + r.getWidth()/2, r.getY() - r.getHeight()/2) //if it contains B(x,y)
				&& contains(r.getX() + r.getWidth()/2, r.getY() + r.getHeight()/2) //if it contains C(x,y)
				&& contains(r.getX() - r.getWidth()/2, r.getY() + r.getHeight()/2); //if it contains D(x,y)
	}
	
	/**
	 * @param r MyRectangle2D
	 * @return true if the specified rectangle overlaps with this rectangle, otherwise returns false
	 */
	public boolean overlaps(MyRectangle2D r){
		//to understand the condition draw two rectangles in the coordinate system
		//that overlaps and two that don't, watch where the coordinates
		//ends in the axis x and axis y and compare
		
		return Math.abs(getX() - r.getX()) <= 0.5 * Math.abs(getWidth() + r.getWidth()) 
				//if the distance from x-center to r.x-center is lower or equal to the half-sum of the width 
				|| Math.abs(getY() - r.getY()) <= 0.5 * Math.abs(getHeight() + r. getHeight());
				//or if the distance from y-center to r.y-center is lower or equal to the half-sum of the width
	}
}
