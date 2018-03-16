package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FrameworkUtil {

	public static Properties propUtil(String relPath) throws IOException {
		
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(new File(relPath).getAbsoluteFile());
		p.load(fis);
		return p;
	}
	
}
