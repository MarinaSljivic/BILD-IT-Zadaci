package zadaci_09_08_2015;

import java.util.Scanner;

/*(The Location class) Design a class named Location for locating a maximal
 value and its location in a two-dimensional array. The class contains public data
 fields row, column, and maxValue that store the maximal value and its indices
 in a two-dimensional array with row and column as int types and maxValue as
 a double type.
 Write the following method that returns the location of the largest element in a
 two-dimensional array:
 public static Location locateLargest(double[][] a) 
 The return value is an instance of Location. 

 Write a test program that prompts
 the user to enter a two-dimensional array and displays the location of the largest
 element in the array. Here is a sample run:
 Enter the number of rows and columns in the array: 3 4
 Enter the array:
 23.5 35 2 10
 4.5 3 45 3.5
 35 44 5.5 9.6
 The location of the largest element is 45 at (1, 2)
 */

/**
 * @author Marina Sljivic
 *
 */
class Location {
	// data fields
	private int row;
	private int column;
	private double maxValue;

	/**
	 * The constructor that creates a location with the specified row, column and maxValue
	 * 
	 * @param row
	 *            int
	 * @param column
	 *            int
	 * @param maxValue
	 *            double
	 */
	Location(int row, int column, double maxValue) {
		setRow(row);
		setColumn(column);
		setMaxValue(maxValue);
	}

	// getters and setters for the data fields
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public double getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(double maxValue) {
		this.maxValue = maxValue;
	}

	// overriding the method to print the largest element and its location(row,
	// column)
	@Override
	public String toString() {
		return "The location of the largest element is " + getMaxValue()
				+ " at (" + getRow() + ", " + getColumn() + ")";
	}
}

/**
 * @author Marina Sljivic
 *
 */
public class LocationTest {

	/**
	 * @param a
	 *            double[][]
	 * @return the location (an instance of Location) of the largest element in
	 *         a two-dimensional array
	 */
	public static Location locateLargest(double[][] a) {
		Location largest = new Location(0, 0, a[0][0]); // set the location of
														// the largest to be the
														// first element

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > largest.getMaxValue()) { // if there is an element
														// in a that is largest
					// than the current largest element, change the location of
					// the largest
					largest.setRow(i);
					largest.setColumn(j);
					largest.setMaxValue(a[i][j]);
				}
			}
		}
		// return the location of the largest element
		return largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			// ask to enter the array's size
			System.out
					.println("Enter the rows and the columns in the 2D array: ");
			int rows = scan.nextInt(), columns = scan.nextInt();
			double[][] array = new double[rows][columns];

			// ask to enter the array's elements
			System.out.println("Enter the 2D array: ");
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = scan.nextDouble();
				}
			}

			// print the largest element
			System.out.println(locateLargest(array));

		} catch (Exception e) {
			System.out.println("Bad input.");
		}
		scan.close();

	}

}
