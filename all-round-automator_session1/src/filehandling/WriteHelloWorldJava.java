package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteHelloWorldJava {

	private static final String HW_FILE_LOCATION = "src/resources/HelloWorld.java";
	private static final String TAB="\t";
	private static final String CRLF="\r\n";
	public static void main(String[] args) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String content = "";
			content += "/* This java program was created by"
					+ " another program */"+ CRLF;
			content += "public class HelloWorld {" + CRLF;
			content += TAB + "public static void main(String[] args) {" + CRLF;
			content += TAB + TAB + "System.out.println(\"Hello World!\");" + CRLF;
			content += TAB + "}" + CRLF;
			content += "}";
			fw = new FileWriter(new File(HW_FILE_LOCATION).getAbsolutePath());
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done... " + HW_FILE_LOCATION + " is ready to be compiled and executed.");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}