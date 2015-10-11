package zadaci_15_08_2015;

public class MyStringBuilder1 {
	private String s;
	
	/**
	 * Constructs a newly allocated MyStringBuilder1 object with the specified String value
	 * @param s String
	 */
	public MyStringBuilder1(String s){
		this.s = s;
	}
	/**
	 * @param s MyStringBuilder1
	 * @return a new MyStringBuilder1 that is this MyStringBuilder1 with the passed s appended
	 */
	public MyStringBuilder1 append(MyStringBuilder1 s){
		return new MyStringBuilder1(this.s+s.toString());
	}
	/**
	 * @param i int
	 * @return a new MyStringBuilder that is this MyStringBuilder with the passed i appended 
	 */
	public MyStringBuilder1 append(int i){
		return new MyStringBuilder1(this.s+i);
	}
	/**
	 * @return the length of this MyStringBuilder1
	 */
	public int length(){
		return this.s.length();
	}
	/**
	 * @param index int
	 * @return the char at position index in this MyStringBuilder1
	 */
	public char charAt(int index){
		return this.s.charAt(index);
	}
	/**
	 * @return a new MyStringBuilder1 that is this MyStringBuilder1 with all lowerCase letters
	 */
	public MyStringBuilder1 toLowerCase(){
		String lowerCaseString = "";
		for(int i=0; i<length();i++){
			//if a char is an upperCase letter add to the lowerCaseString the respective lowerCase letter
			if(charAt(i)>='A' && charAt(i)<='Z'){
				lowerCaseString += (char)(charAt(i) + 32);
			}else{
				lowerCaseString+= charAt(i);//else just copy the lowerCase letter or symbol whatever it is
			}
		}
		return new MyStringBuilder1(lowerCaseString);//and return a new MyStringBuilder of lowerCaseString
	}
	/**
	 * @param begin
	 * @param end
	 * @return Returns a MyStringBuilder1 that is a substring of this MyStringBuilder1.<br>
	 * 			The substring begins at the specified begin and extends<br> 
	 * 			to the character at index end - 1. 
	 */
	public MyStringBuilder1 substring(int begin, int end){
		//substring will contain the substring, it's length is end-begin
		String substring="";
		//i start from the begin to the end
		for(int i=begin;i<end;i++){
			substring += charAt(i);//copy the characters
		}
		return new MyStringBuilder1(substring);//return the substring
	}
	
	public String toString(){
		return this.s;
	}

	public static void main(String[] args) {
		//testing the methods
		MyStringBuilder1 msb = new MyStringBuilder1("JAVA ");
		msb = msb.append(8);
		msb = msb.append(new MyStringBuilder1(" hello"));
		System.out.println("\'"+msb.toString()+"\' length is "+msb.length());
		System.out.println("Char at 3 is "+msb.charAt(3));
		MyStringBuilder1 substring = msb.substring(3, msb.length());
		System.out.println("The substring from char 3 to the end is \'"+substring.toString()+"\'");
		System.out.println("To lowercase: "+msb.toLowerCase());
	}
}
