package zadaci_17_08_2015;

import java.util.ArrayList;
import zadaci_13_08_2015.MyDate;
import javafx.scene.shape.Circle;

/*Write a program that creates an ArrayList and adds a Loan
object, a Date object, a string, and a Circle object to the list, and use a loop
to display all the elements in the list by invoking the object’s toString()
method.*/

/**
 * @author Marina Sljivic
 *
 */
public class ArrayListObjects {

	public static void main(String[] args) {
		//create an ArrayList
		ArrayList<Object> list = new ArrayList<>();
		
		//add some objects
		list.add(new MyDate(2015, 10, 11));
		list.add(new String("Java"));
		list.add(new Circle());
		list.add(new Triangle(3, 4, 5));
		
		//invoke the toString() method on every element in the list
		for(Object o : list){
			System.out.println(o.toString());
		}
	}

}
