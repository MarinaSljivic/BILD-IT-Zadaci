package zadaci_15_08_2015;

/**
 * @author Marina Sljivic
 *
 */
public class MyCharacter {
	private char value;
	
	/**
	 * Constructs a newly allocated MyCharacter object that represents the specified char value.
	 * @param value
	 */
	public MyCharacter(char value){
		this.value = value;
	}
	
	/**
	 * @return Returns the value of this MyCharacter object.
	 */
	public char charValue(){
		return this.value;
	}
	
	/**
	 * Compares two Character objects numerically.
	 * @param mychar MyCharacter
	 * @return the value 0 if the value of this character == mychar;<br> 
	 * a value less than 0 if the value of this character < mychar;<br>
	 * and a value greater than 0 if the value of this character > mychar.
	 */
	public int compareTo(MyCharacter mychar){
		return charValue() - mychar.charValue();
	}
	
	/**
	 * @param ch
	 * @return a boolean that determines if the specified character is a letter.
	 */
	public static boolean isLetter(char ch){
		return (ch>='a' && ch<='z') || (ch>='A' && ch<='Z');
	}
	
	/**
	 * @param ch
	 * @return a boolean that determines if the specified character is a digit.
	 */
	public static boolean isDigit(char ch){
		return ch>='1' && ch<='0';
	}
	
	/**
	 * @param ch
	 * @return a boolean that determines if the specified character is a lowerCase letter.
	 */
	public static boolean isLowerCase(char ch){
		return ch>='a' && ch<='z';
	}

	/**
	 * @param ch
	 * @return a boolean that determines if the specified character is an upperCase letter.
	 */
	public static boolean isUpperCase(char ch){
		return ch>='A' && ch<='Z';
	}
	
	/**
	 * @param ch
	 * @return the character argument to lowerCase
	 */
	public static char toLowerCase(char ch){
		if(isUpperCase(ch)){
			return (char)(ch+32);
		}else{
			return ch;
		}
	}
	
	/**
	 * @param ch
	 * @return the character argument to upperCase
	 */
	public static char toUpperCase(char ch){
		if(isLowerCase(ch)){
			return (char)(ch-32);
		}else{
			return ch;
		}
	}
	
	/**
	 * @param ch
	 * @return Returns a String object representing the specified char.
	 */
	public static String toString(char ch){
		return ch+"";
	}
	
	/**
	 * @param ch
	 * @return Returns a Character instance representing the specified char value.
	 */
	public static MyCharacter valueOf(char ch){
		return new MyCharacter(ch);
	}
}
