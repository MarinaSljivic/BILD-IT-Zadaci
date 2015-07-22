package zadaci_21_07_2015;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Marina Sljivic
 *
 */
public class FileCounter {

	/**
	 * This method takes as parameter a String that represents the path to a file.
	 * It prints out how many characters, words and lines has the file.
	 * 
	 * @param filePath
	 * @throws IOException
	 */
	public static void numberOfCharsWordsLines(String filePath) throws IOException{
		File file = new File(filePath); //create a new File object with that file path
        BufferedReader buffer = new BufferedReader(new FileReader(file));//and a BufferdReader to read the file
        
        //set the counters to 0
        int numberOfChars =0;
        int numberOfWords =0;
        int numberOfLines =0;
        
        String line; //this takes every line of the file and converts it to String
        while ((line = buffer.readLine()) != null) { //while there are lines in the file (the line is not null)
            numberOfLines++; //increase the number of lines
            
            String[] arrayLine = line.split(" ");//split the line by white spaces,so we have an array of file's words
            numberOfWords += arrayLine.length;//the number of words is the size of the array that contains them
            
            for(String word : arrayLine){ //for every word of the line
                numberOfChars += word.length(); //add to the counter numberOfChars every word's length 
                //to see how many chars there are, assume the white space is not a character
            }
        }
        //print how many characters, word and lines there are
        System.out.println("Characters: "+numberOfChars+"\t Words: "+numberOfWords+"\t Lines: "+numberOfLines);
        
        buffer.close();
	}
	
	public static void main(String[] args) throws IOException {
		numberOfCharsWordsLines("file");
	}

}
