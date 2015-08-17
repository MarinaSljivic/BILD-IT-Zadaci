package zadaci_12_08_2015;

/*(The MyInteger class) Design a class named MyInteger. The class contains:
 - An int data field named value that stores the int value represented by this
object.
 - A constructor that creates a MyInteger object for the specified int value.
 - A getter method that returns the int value.
 - The methods isEven(), isOdd(), and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
 - The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
 - The static methods isEven(MyInteger), isOdd(MyInteger), and
isPrime(MyInteger) that return true if the specified value is even, odd,
or prime, respectively.
 - The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
 - A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
 - A static method parseInt(String) that converts a string into an int
value.
Draw the UML diagram for the class and then implement the class. Write a client
program that tests all methods in the class. */

/**
 * @author Marina Sljivic
 *
 */
class MyInteger{
	private int value;
	
	public MyInteger(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	
	/**
	 * @return true if the value of MyInteger object is an even number, false if it's not
	 */
	public boolean isEven(){
		return getValue()%2==0;
	}
	/**
	 * @return true if the value of MyInteger object is an odd number, false if it's not
	 */
	public boolean isOdd(){
		return getValue()%2!=0;
	}
	/**
	 * @return true if the value of MyInteger object is a prime number, false if its not.
	 */
	public boolean isPrime(){
		//check if the value is greater then 1
	    if (getValue() > 1){
		    for (int i = 2; i <= getValue()/2; i++) {//check if the value is divisible 
		    	//by any number: from 2 up to the half of the value
		    	//(to the half of the value because the other half is multiple of 2)
		    	if (getValue() % i == 0) //if it is then its not a prime number so return false
		            return false;
		    }
		    return true;//if false wasn't returned then it is a prime so return true
	    }else{ //if its not greater than 1 then for sure its not a prime number
	    	return false;
	    }
	}
	

	/**
	 * @param value int
	 * @return true if the value is an even number, false if it's not
	 */
	public static boolean isEven(int value){
		return value%2==0;
	}
	/**
	 * @param value int
	 * @return true if the value is an odd number, false if it's not
	 */
	public static boolean isOdd(int value){
		return value%2!=0;
	}
	/**
	 * @param value int
	 * @return true if value is a prime number, false if its not.
	 */
	public static boolean isPrime(int value){
		//check if the value is greater then 1
	    if (value > 1){
		    for (int i = 2; i <= value/2; i++) {//check if the value is divisible 
		    	//by any number: from 2 up to the half of the value
		    	//(to the half of the value because the other half is multiple of 2)
		    	if (value % i == 0) //if it is then its not a prime number so return false
		            return false;
		    }
		    return true;//if false wasn't returned then it is a prime so return true
	    }else{ //if its not greater than 1 then for sure its not a prime number
	    	return false;
	    }
	}
	
	
	/** 
	 * @param myInt MyInteger
	 * @return true if the value of myInt is an even number, false if it's not.
	 */
	public static boolean isEven(MyInteger myInt){
		return isEven(myInt.getValue()); //get the int value of myInt and test if it's even with method isEven(int)
	}
	/** 
	 * @param myInt MyInteger
	 * @return true if the value of myInt is an odd number, false if it's not.
	 */
	public static boolean isOdd(MyInteger myInt){
		return isOdd(myInt.getValue()); //get the int value of myInt and test if it's odd with method isOdd(int)
	}
	/** 
	 * @param myInt MyInteger
	 * @return true if the value of myInt is a prime number, false if it's not.
	 */
	public static boolean isPrime(MyInteger myInt) {
		return isPrime(myInt.getValue()); //get the int value of myInt and test if it's prime with method isPrime(int)
	}

	/**
	 * @param value int
	 * @return return true if the value in this object is equal to the specified value
	 */
	public boolean equals(int value){
		return value == getValue(); //is the passed value is equal to the value of this object
	}
	/**
	 * @param myInt MyInteger
	 * @return return true if the value in this object is equal to the specified value of myInt 
	 */
	public boolean equals(MyInteger myInt){
		return equals(myInt.getValue()); //is the value of the passed myInt is equal to the value of this object
	}

	
	/**
	 * @param charArray char[]
	 * @return The integer value of the converted array of numeric characters<br>
	 * 			If the char array contains non number characters, prints it's not possible
	 * 			to convert to an integer and returns 0.
	 */
	public static int parseInt(char[] charArray){ 
		int value = 0;//this will be the value of the char array
		
		for(int i=0; i<charArray.length; i++){
			if((charArray[i]=='-' || charArray[i]=='+') && i==0) i++;//skip the first character if it is a - or a +
			
			if(charArray[i]>47 && charArray[i]<58){ 
				//if the char at position i is a number
				//add it to the value after multiply by 10^k (k=charArray.length-1-i)
				//for ex. 123 '1' is the first at position 0 so we have to multiply by 100=10^2, 2 = 3-1-0
				value += (charArray[i]-48) * Math.pow(10, (charArray.length-1-i));
			}else{
				//if the char is not a number, print it's not possible to convert to int and return 0
				System.out.println("What you try to convert to an integer contains non number characters. "
						+ "So 0 is returned.");
				return 0;
			}
		}
		
		if(charArray[0]=='-') return -value;//if the first char is a - then value is negative
		else
			return value; //else it's positive
	}
	
	/**
	 * @param s String
	 * @return int value of the converted string s of numeric characters
	 */
	public static int parseInt(String s){
		return parseInt(s.toCharArray()); //convert the string to a char array and parseInt(the char array)
	}
	
}

/**
 * @author Marina Sljivic
 *
 */
public class TestMyInteger {

	public static void main(String[] args) {
		//testing all the methods in class MyInteger
		MyInteger number = new MyInteger(5);
		
		System.out.println(number.isEven()+" even,"+number.isOdd()+" odd,"+number.isPrime()+" prime.");
		System.out.println(MyInteger.isEven(number)+" even,"+MyInteger.isOdd(number)+" odd,"+MyInteger.isPrime(number)+" prime.");
		System.out.println(MyInteger.isEven(0)+" even,"+MyInteger.isOdd(1)+" odd,"+MyInteger.isPrime(1)+" prime.");
		
		System.out.println(number.equals(5));
		System.out.println(number.equals(new MyInteger(-5)));
		
		char[] c={'-','0','1','0','3','0'};
		System.out.println(MyInteger.parseInt(c));
		System.out.println(MyInteger.parseInt("+0111"));
		System.out.println(MyInteger.parseInt("76a01"));
	}

}
