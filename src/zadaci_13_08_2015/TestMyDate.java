package zadaci_13_08_2015;

/*Draw the UML diagram for the class and then implement the class. Write a
test program that creates two MyDate objects (using new MyDate() and new
MyDate(34355555133101L)) and displays their year, month, and day.
(Hint: The first two constructors will extract the year, month, and day from
the elapsed time. For example, if the elapsed time is 561555550000 milliseconds,
the year is 1987, the month is 9, and the day is 18. You may use the
GregorianCalendar class discussed in Programming Exercise 9.5 to simplify
coding.)*/

/**
 * @author Marina Sljivic
 *
 */
public class TestMyDate {

	public static void main(String[] args) {
		//testing the class MyDate
		MyDate mydate = new MyDate();
		System.out.println(mydate);
		
		MyDate mydate1 = new MyDate(34355555133101L);
		System.out.println(mydate1);
		
		
	}

}
