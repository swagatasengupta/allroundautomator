package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenPageChrome {

	public static void main(String[] args) {
		String url = "http://automationpractice.com/index.php";
		//Setting system property is optional as long as the directory
		// having all the executable drivers is available in path (Windows environment variable) variable.
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swagat\\Desktop\\drivers\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	}

}
