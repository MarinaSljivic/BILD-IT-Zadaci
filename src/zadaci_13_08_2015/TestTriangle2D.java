package zadaci_13_08_2015;

import zadaci_12_08_2015.MyPoint;

/* Write a test program that creates a Triangle2D objects t1 using the constructor
new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3),
new MyPoint(5, 3.5)), displays its area and perimeter, and displays the
result of t1.contains(3, 3), r1.contains(new Triangle2D(new
MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))), and t1.
overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4,
-3), MyPoint(2, 6.5))).*/

/**
 * @author Marina Sljivic
 *
 */
public class TestTriangle2D {

	public static void main(String[] args) {
		//testing the methods of Triangle2D
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3),
				new MyPoint(5, 3.5));
		
		System.out.printf("The triangle's area is %.2f and perimeter is %.2f\n", t1.getArea(), t1.getPerimeter());
		
		System.out.println("t1 contains point (3,3): "+t1.contains(new MyPoint(3, 3)));
		
		System.out.println("t1 contains triangle: "+t1.contains(new Triangle2D
				(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
		
		System.out.println("t1 overlaps triangle: "+t1.overlaps(new Triangle2D
				(new MyPoint(2, 5.5), new MyPoint(4,-3), new MyPoint(2, 6.5))));
	}

}
