package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import errorhandling.ErrArrOutIOfBound;

public class CopyTextFile {

	//Define source and destination file paths
	public static String SRC_REL_LOC="myfiles/textfile3.txt";
	public static String DEST_REL_LOC="myfiles/CopyOfTextfile3.txt";
	public static String EOL = "\r\n";
	
	public static void main(String[] args) {
		//define and initialize all fire reader and write classes and related variables.
		FileReader fr=null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		String fileLineContent=null;
		String contentToWrite="";
		boolean srcFileEmpty=true;
		
		try {
			fr = new FileReader(new File(SRC_REL_LOC).getAbsoluteFile());
			br = new BufferedReader(fr);
			fw= new FileWriter((new File(DEST_REL_LOC).getAbsoluteFile()));
			bw = new BufferedWriter(fw);
			
			fileLineContent = br.readLine();
			while(fileLineContent!=null) {
				srcFileEmpty = false;
				if(fileLineContent.trim()=="") {
					contentToWrite += fileLineContent;
				} else {
					contentToWrite += fileLineContent + EOL;
				}
				
				fileLineContent = br.readLine();
			}
			
			if(srcFileEmpty) {
				System.out.println("File is empty... nothing to read and write!");
			} else {
				bw.write(contentToWrite);
			}
			
			
			
		} catch (FileNotFoundException e) {
			ErrArrOutIOfBound.customErrorDisplayGeneric(e);
		} catch (IOException e) {
			ErrArrOutIOfBound.customErrorDisplayGeneric(e);
		} finally {
			try {
				if (br != null) br.close();
				if (fr != null) fr.close();
				if (bw != null) bw.close();
				if (fw != null) fw.close();

			} catch (IOException e) {
				ErrArrOutIOfBound.customErrorDisplayGeneric(e);
			}

		}
		

	}

}
