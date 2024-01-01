package LeetcodeProblems;

import java.io.File;

public class FilePermission {

	public static void main(String[] args) {

		String path = "C:\\Users\\samarjain\\Desktop\\Sample.txt";
		
		File f = new File(path);
		
		f.setExecutable(true);
		f.setReadable(false);
		f.setWritable(true);
		
		
		System.out.println("done...");

	}

}
