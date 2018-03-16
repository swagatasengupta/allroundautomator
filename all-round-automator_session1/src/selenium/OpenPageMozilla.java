package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenPageMozilla {

	public static void main(String[] args) {
		String url = "http://automationpractice.com/index.php";
		//Setting system property is optional as long as the directory
		// having all the executable drivers is available in path (Windows environment variable) variable.
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Swagat\\Desktop\\drivers\\chromedriver.exe");*/
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
	}

}
