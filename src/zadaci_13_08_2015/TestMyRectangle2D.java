package zadaci_13_08_2015;



/* Write a test program that creates a MyRectangle2D object r1 (new MyRectangle2D(2,
2, 5.5, 4.9)), displays its area and perimeter, and displays the result of
r1.contains(3, 3), r1.contains(new MyRectangle2D(4, 5, 10.5,3.2)), 
and r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).*/

/**
 * @author Marina Sljivic
 *
 */
public class TestMyRectangle2D {

	public static void main(String[] args) {
		//testing the methods from class MyRectangle2D
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		
		System.out.printf("The rectangle's area is %.2f and perimeter is %.2f\n", r1.getArea(), r1.getPerimeter());
		
		System.out.println("r1 contains point (3,3): "+r1.contains(3,3));
		
		System.out.println("r1 contains rectangle: "+r1.contains(new MyRectangle2D(4, 5, 10.5,3.2)));
		
		System.out.println("r1 overlaps rectangle: "+r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.44)));
	}

}
