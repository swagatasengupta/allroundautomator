package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import misc.TimeStampDemo;

public class AppendToFileExample {

	private static final String FILENAME = "src/resources/textfile2.txt";

	public static void main(String[] args) {

		BufferedWriter bw = null;
		FileWriter fw = null;
		boolean appendMode = true;

		try {

			String content = "[" + TimeStampDemo.getTimeStamp() + "]: This is the content to write into file.\r\n";

			fw = new FileWriter(new File(FILENAME).getAbsolutePath(), appendMode);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

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