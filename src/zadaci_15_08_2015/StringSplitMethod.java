package zadaci_15_08_2015;

import java.util.ArrayList;
import java.util.List;

/* The split method in the String class returns an
array of strings consisting of the substrings split by the delimiters. However, the
delimiters are not returned. Implement the following new method that returns
an array of strings consisting of the substrings split by the matching delimiters,
including the matching delimiters.
public static String[] split(String s, String regex)
For example, split("ab#12#453","#") returns ab, #, 12, #, 453 in an
array of String, and split("a?b?gf#e", "[?#]") returns a, ?, b, ?, gf,
#, and e in an array of String.
*/

/**
 * @author Marina Sljivic
 *
 */
public class StringSplitMethod {
	
	/**
	 * @param s String
	 * @param regex String
	 * @return an array of strings consisting of the substrings<br>
	 * split by the matching delimiters, including the matching delimiters.
	 */
	public static String[] split(String s, String regex){
		List<String> list = new ArrayList<>();//this list will contain the substrings of the string
		
		int i=0;//the index of the characters in s
		
		while(i<s.length()){//while the index is less then the s' length
			String substring = "";//the substring is an empty string
			
			if(regex.contains(s.charAt(i)+"")){//if the regex contains the char at i
				list.add(s.charAt(i)+"");//add it to the list
				i++;//and pass to the next char so i++
			}else{
				//else, while i is less then the s' length and the regex doesn't contain the chars at i
				while(i<s.length() && !regex.contains(s.charAt(i)+"")){
					substring += s.charAt(i);//add the chars to substring
					i++;//pass to the next char
				}
				list.add(substring);//when finished add the substring to the list
			}
		}
		return toStringArray(list);//return the array of strings
	
	}
	
	/**
	 * @param list List of Strings
	 * @return an array of Strings with the same content as the argument list.
	 */
	public static String[] toStringArray(List<String> list){
		  String[] array = new String[list.size()]; //the array is the same length as the list
		  for(int i=0;i<array.length;i++){
		    array[i] = list.get(i); //at the same positions as in the list, add to the array the Strings
		  }
		  return array;
	}
	
	public static void main(String[] args) {
		//testing the method
		String s = "#ab#cd?#e#";
		String[] array = split(s,"?#");
		for(String a : array){
			System.out.print(a+"   ");
		}
	}

}
