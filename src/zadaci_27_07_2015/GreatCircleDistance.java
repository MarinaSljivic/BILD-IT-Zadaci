package zadaci_27_07_2015;

import extrapackage.Numbers;

/* Great circle distance predstavlja udaljenost izme�u dvije ta�ke na povr�ine sfere. 
 * Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku �irinu i du�inu dvije ta�ke. 
 * Great circle distance izme�u ove dvije ta�ke mo�e biti izra�unata koriste�i se sljede�om formulom: 
 * d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
 * Napisati program koij pita korisnika da unese geografsku �irinu i du�inu u stepenima dvije ta�ke 
 * na povr�ini zemlje te mu ispisuje great circle distance. Prosje�ni radius zemlje je 6.371.01 km. 
 * Stepene koje korisnik unese trebamo promijeniti u radianse koriste�i se Math.toRadians metodom 
 * jer Java trigonometrijske metode koriste radianse. 
 * �irina i du�ina u ovoj formuli se odnose na zapad i sjever. 
 * Koristimo negativne vrijednosti da ozna�imo istok i jug.*/

/**
 * @author Marina Sljivic
 *
 */
public class GreatCircleDistance {

	/**
	 * This method asks the user to enter the latitude and longitude in degrees of two points on 
	 * the surface of the earth and prints out their great circle distance.
	 */
	static void calculateDistance(){
		double radius = 6371.01;//ordinary Earth radius
		System.out.println("Enter the latitude and longitude in degrees of two points on "
				+ "the surface of the earth to see their great circle distance. ");
		
		//ask the user to enter the first point latitude and longitude
		System.out.println("Enter the latitude and longitude for the first point: ");
		//using the helper method for the input of a double
		//The degrees that the user enters we need to change in radians using the method Math.toRadians
		//because Java trigonometric methods use radians
		double firstPointLatitude = Math.toRadians(Numbers.inputDouble());
		double firstPointLongitude = Math.toRadians(Numbers.inputDouble());

		//ask the user to enter the second point latitude and longitude
		System.out.println("Enter the latitude and longitude for the second point: ");
		//same like above
		double secondPointLatitude = Math.toRadians(Numbers.inputDouble());
		double secondPointLongitude = Math.toRadians(Numbers.inputDouble());
		
		//the formula for the distance is d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
		double distance = radius* Math.acos( Math.sin(firstPointLatitude) * Math.sin(secondPointLatitude) 
				+ Math.cos(firstPointLatitude) * Math.cos(secondPointLatitude) 
				* Math.cos(firstPointLongitude - secondPointLongitude) );
		
		System.out.println("The greate circle distance between the two points is: "+distance);
	}
	
	public static void main(String[] args) {
		calculateDistance();

	}

}
