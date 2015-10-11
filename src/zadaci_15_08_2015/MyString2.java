package zadaci_15_08_2015;

/**
 * @author Marina Sljivic
 *
 */
public class MyString2 {
	private String s;
	
	/**
	 * Constructs a newly allocated MyString1 object that represents the specified String value
	 * @param s String
	 */
	public MyString2(String s){
		this.s = s;
	}
	
	/**
	 * @param s String
	 * @return -0 if this string is equal to s<br>
	 * -their length difference, if this string contains s or s contains this string<br>
	 * -the difference of the two character values at position k in the two string,<br>
	 * if that k.th char is the first non equal char.	
	 */
	public int compare(String s){
		int result=0;//set the result to 0
		
		if(this.s.equals(s)){
			//if this string is equal to s, the result is 0, nothing changes
		}else if(this.s.contains(s) || s.contains(this.s)){
			//if this string contains s or s contains this string
			//the result is their length difference
			result = this.s.length() - s.length();
		}else{
			//else find the first non equal character
			for(int k=0;k < this.s.length();k++){
				if(this.s.charAt(k) != s.charAt(k)){
					//and the result is their k.th chars difference 
					result = this.s.charAt(k) - s.charAt(k);
					break;//break when find it
				}
			}	
		}
		return result;
	}
	/**
	 * @param begin
	 * @return Returns a string that is a substring of this string.<br>
	 * 			The substring begins at the specified begin and extends<br> 
	 * 			to the last character of this string. 
	 */
	public MyString2 substring(int begin){
		//substring will contain the substring, it's length is the length of this string - begin
		String substring = "";
		//i start from the begin to the length of this string
		for(int i=begin;i<this.s.length();i++){
			substring += this.s.charAt(i);//copy the characters
		}
		return new MyString2(substring);//return the substring
	}
	/**
	 * @return a new MyString1 with all uppercase letters
	 */
	public MyString2 toUpperCase(){
		//create a char array of the same length
		String uppercase="";
		
		for(int i=0; i<this.s.length();i++){
			//if a char is a lowercase letter add to the uppercase the respective uppercase letter 
			if(this.s.charAt(i)>='a' && this.s.charAt(i)<='z'){
				uppercase += (char)(this.s.charAt(i) - 32); //(in ASCII lowercase-32=uppercase)
			}else{
				uppercase += this.s.charAt(i);//else just copy the uppercase letter or symbol whatever it is
			}
		}
		return new MyString2(uppercase);//and return the new MyString2
	}
	/**
	 * @return a newly allocated character array whose length is the length of this string<br> 
	 * and whose contents are initialized to contain the character sequence represented by this string.
	 */
	public char[] toChars(){
		//charArray will contain all the chars of this string
		char[] charArray = new char[this.s.length()];
		for(int i=0;i<this.s.length();i++){
			charArray[i] = this.s.charAt(i); //copy the chars in the array
		}
		return charArray;
	}
	
	/**
	 * @param b boolean
	 * @return if the argument is true, a string equal to "true" is returned; <br>
	 * otherwise, a string equal to "false" is returned.
	 */
	public static MyString2 valueOf(boolean b){
		return new MyString2(""+b);
	}
}
