package LeetcodeProblems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {

	public static void main(String[] args) {
		
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		
		String path = "C:\\Users\\samarjain\\Desktop\\Sample.txt";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			String line = br.readLine();
			
			while(br != null)
			{
				lineCount++;
				
				String[] word = line.split(" ");
				wordCount = wordCount + word.length;
				
				for(String s : word)
				{
					charCount = charCount + s.length();
				}
				
				line = br.readLine();
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
