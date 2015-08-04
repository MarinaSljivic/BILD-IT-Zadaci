package zadaci_25_07_2015;

import extrapackage.Numbers;

/* Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeæe v, možemo izraèunati minimalnu dužinu piste 
 * potrebne da avion uzleti koristeæi se sljedeæom formulom: dužina = v * v / 2a. Napisati program koji pita 
 * korisnika da unese v u m/s i a u m/s*s te ispisuje korisniku minimalnu dužinu piste.
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je 514.286)*/

/**
 * @author Marina Sljivic
 *
 */
public class PlaneStuff {

	/**
	 * @param acceleration double
	 * @param speedTakeoff double
	 * @return the length of the runaway depending on the acceleration and on the speed takeoff
	 */
	public static double lengthOfTheRunway(double acceleration, double speedTakeoff){
		return speedTakeoff*speedTakeoff/(2*acceleration);//this is the formula for the length
	}
	
	public static void main(String[] args) {
		//asko to enter the acceleration(a) and the takeoff speed(v)
		System.out.println("Enter the plane's takeoff speed: ");
		double v = Numbers.inputPositiveDouble(); //this method is from the helper class
		System.out.println("Enter the plane's acceleration: ");
		double a = Numbers.inputPositiveDouble();
		
		//print the length of the runaway
		System.out.println("The length of the runway is "+lengthOfTheRunway(a, v)+".");
	}

}
