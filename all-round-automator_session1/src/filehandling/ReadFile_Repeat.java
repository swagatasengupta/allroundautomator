package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile_Repeat {
	
	private static final String FILENAME = "src/resources/textfile1.txt";
	private static final String FILENAME2 = "myfiles/textfile3.txt";
	private static final String FILENAME3 = "textfile2.txt";
	
	public static void main(String[] args) throws IOException {
		
		File f = new File(FILENAME);
		System.out.println("f.isAbsolute(): " + f.isAbsolute());
		System.out.println("f.getPath(): " + f.getPath());
		System.out.println("f.getAbsolutePath(): " + f.getAbsolutePath());
		System.out.println("f.exists(): " + f.exists());

		File f2 = new File(FILENAME2);
		System.out.println("f2.isAbsolute(): " + f2.isAbsolute());
		System.out.println("f2.getPath(): " + f2.getPath());
		System.out.println("f2.getAbsolutePath(): " + f2.getAbsolutePath());
		System.out.println("f2.exists(): " + f2.exists());

		File f3 = new File(FILENAME3);
		System.out.println("f3.isAbsolute(): " + f3.isAbsolute());
		System.out.println("f3.getPath(): " + f3.getPath());
		System.out.println("f3.getAbsolutePath(): " + f3.getAbsolutePath());
		System.out.println("f3.exists(): " + f3.exists());

		System.out.println("------------------------------------------");
		FileReader fr = new FileReader(f.getAbsolutePath());
		BufferedReader br = new BufferedReader(fr);
		String sCurrentLine;
		sCurrentLine = br.readLine();
		while (sCurrentLine != null) {
			System.out.println(sCurrentLine);
			sCurrentLine = br.readLine();
			}
			
	}

}
