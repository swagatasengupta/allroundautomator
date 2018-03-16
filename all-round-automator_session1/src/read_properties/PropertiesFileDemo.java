package read_properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) throws IOException {
		
		String relPropPath = "src/resources/test.properties";
		File f = new File(relPropPath);
		String absFilePath = f.getAbsolutePath();
		FileInputStream fis = new FileInputStream(f);
		//FileInputStream fis = new FileInputStream(f.getAbsolutePath());
		Properties p = new Properties();
		p.load(fis);
		System.out.println(p.getProperty("key1"));
		

	}

}
