package inputOutput.classes.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.FileNotFoundException;


public class ReadingText {
	// String variable to store text data
	static String text;
	//Method reads text from text file
	private static String readText() {
		try {
			Path path = Paths.get("textDocument.txt");
			List<String> list = Files.readAllLines(path);
			text = list.toString().replace('[', ' ').replace(']', ' ').trim();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return text;
	}
	
	//Method prints text to console
	private static void printText() {
		System.out.println(text);
	}
	
	// Method main to run java program
	public static void main(String [] str) {
		// Calling method readText()
		ReadingText.readText();
		
		// Calling method printText(String text)
		ReadingText.printText();
	}

}
