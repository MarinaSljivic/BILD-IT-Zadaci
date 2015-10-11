package zadaci_15_08_2015;


/*(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString1):
public MyString1(char[] chars);
public char charAt(int index);
public int length();
public MyString1 substring(int begin, int end);
public MyString1 toLowerCase();
public boolean equals(MyString1 s);
public static MyString1 valueOf(int i);*/

/**
 * @author Marina Sljivic
 *
 */
public class MyString1 {
	
	private char[] chars;
	
	/**
	 * Constructs a newly allocated MyString1 object that represents the specified chars values
	 * @param chars char[]
	 */
	public MyString1(char[] chars){
		this.chars = new char[chars.length];
		for(int i=0;i<length();i++){
			this.chars[i] = chars[i];//copy all the characters
		}
	}
	/**
	 * @param index
	 * @return the character at the specified index
	 */
	public char charAt(int index){
		return this.chars[index];
	}
	/**
	 * @return the length of this MyString1
	 */
	public int length(){
		//it's the length of the array chars
		return this.chars.length;
	}
	/**
	 * @param begin
	 * @param end
	 * @return Returns a string that is a substring of this string.<br>
	 * 			The substring begins at the specified begin and extends<br> 
	 * 			to the character at index end - 1. 
	 */
	public MyString1 substring(int begin, int end){
		//newchars will contain the substring, it's length is end-begin
		char[] newchars = new char[end-begin];
		//i start from the begin to the end
		for(int i=begin;i<end;i++){
			newchars[i-begin] = charAt(i);//copy the characters
		}
		return new MyString1(newchars);//return the substring
	}
	
	/**
	 * @return a new MyString1 with all lowercase letters
	 */
	public MyString1 toLowerCase(){
		//create a char array of the same length
		char[] newchars = new char[length()];
		
		for(int i=0; i<length();i++){
			//if a char is an uppercase letter add to the newchars the respective lowercase letter
			if(charAt(i)>='A' && charAt(i)<='Z'){
				newchars[i] = (char)(charAt(i) + 32);
			}else{
				newchars[i] = charAt(i);//else just copy the lowercase letter or symbol whatever it is
			}
		}
		return new MyString1(newchars);//and return the new MyString1
	}
	
	/**
	 * @param s
	 * @return true if this MyString1 equals to s
	 */
	public boolean equals(MyString1 s){
		//if their length is not equal then they are not equal
		if(length() != s.length()) return false;
		
		for(int i=0;i<length();i++){
			//if they have one different character at same position
			if(s.charAt(i) != this.charAt(i)){
				return false;//they are not equal
			}
		}
		//else they are equal
		return true;
	}
	/**
	 * @param i
	 * @return the string representation of the int argument. 
	 */
	public static MyString1 valueOf(int i){
		int charsLength=0;//will contain the length of i (the number of digits)
		int cloneI=Math.abs(i);//clone the absolute value of i
		
		while(cloneI>0){
			//while we can divide cloneI, increase the charsLength
			cloneI/=10;
			charsLength++;
		}
		char[] iInChars;
		if(i<0){//if i is negative
			charsLength++;//increase the length because we need the first index of the char array for the '-'
			iInChars = new char[charsLength]; 
			iInChars[0]='-'; 
			//now take one digit per digit from i and put in the char array, from the last to the first
			cloneI=Math.abs(i);//in case it's negative
			for (int j=charsLength-1; j > 0; j--) {//j will never be 0, because at index 0 is '-'
				iInChars[j] = (char) (cloneI % 10 +'0');//so take the number add it to '0' because of the ASCII code
				//and put in the array
				cloneI /= 10;//then 'cut' that number
			}
		}else{//else just create the array with the length of the digits
			iInChars = new char[charsLength];
			//now take one digit per digit from i and put in the char array, from the last to the first
			cloneI=Math.abs(i);//in case it's negative
			for (int j=charsLength-1; j >= 0; j--) {
				iInChars[j] = (char) (cloneI % 10 +'0');//so take the number add it to '0' because of the ASCII code
				//and put in the array
				cloneI /= 10;//then 'cut' that number
			}
		}
		return new MyString1(iInChars);//return a new MyString1 of that number
	}
	
}
