package zadaci_13_08_2015;

/*Write a test program that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
displays its area and perimeter, and displays the result of c1.contains(3, 3), 
c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new Circle2D(3, 5, 2.3)).*/

/**
 * @author Marina Sljivic
 *
 */
public class TestCircle2D {

	public static void main(String[] args) {
		
		//testing the methods of Circle2D
		//create a new circle and print it's area and perimeter
		Circle2D c1 = new Circle2D(2,2,5.5);
		System.out.printf("The area of the circle is %.2f and the perimeter is %.2f \n"
				,c1.getArea(),c1.getPerimeter());
		//check if it contains the point (3,3)
		if(c1.contains(3, 3)){
			System.out.println("The circle contains the point");
		}else{
			System.out.println("The circle doesn't contain the point");
		}
		//check if it contains a circle
		if(c1.contains(new Circle2D(4, 5, 10.5))){
			System.out.println("the circle contains the circle");
		}else{
			System.out.println("The circle doesn't contain the circle");
		}
		//check if it overlaps another circle
		if(c1.overlaps(new Circle2D(3, 5, 2.3))){
			System.out.println("They overlap");
		}else{
			System.out.println("They don't overlap");
		}
		
	}

}
