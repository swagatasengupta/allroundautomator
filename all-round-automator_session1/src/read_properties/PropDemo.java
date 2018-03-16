package read_properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lib.FrameworkUtil;

public class PropDemo {
	
	
	public static void main(String[] args) throws IOException  {
		
/*		FileInputStream fis = new FileInputStream(new File("src/resources/test.properties").getAbsoluteFile());
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println("prop.getProperty(\"path\"): " + prop.getProperty("path")); 
		System.out.println("prop.getProperty(\"URL\"): " + prop.getProperty("URL")); */
		
		Properties prop = FrameworkUtil.propUtil("src/resources/test.properties");
		System.out.println("prop.getProperty(\"path\"): " + prop.getProperty("path")); 
		System.out.println("prop.getProperty(\"URL\"): " + prop.getProperty("URL"));
		System.out.println("prop.size(): " + prop.size());
		System.out.println("prop.getProperty(\"keyWithoutValue\"): " + prop.getProperty("keyWithoutValue"));

	}

}
