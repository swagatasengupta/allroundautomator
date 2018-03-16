package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeClickSignIn {

	public static void main(String[] args) {
		String url = "http://automationpractice.com/index.php";
		//Setting system property is optional as long as the directory
		// having all the executable drivers is available in path (Windows environment variable) variable.
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swagat\\Desktop\\drivers\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		//driver.findElement(By.xpath("//img[@src='http://automationpractice.com/modules/themeconfigurator/img/banner-img6.jpg']")).click();;
		
		/*WebElement womensCoatImg = driver.findElement(By.xpath("//div[@id='htmlcontent_home']//img[contains(@src,'banner-img3.jpg')]"));
		womensCoatImg.click();
		*/

		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("swagata.sengupta@devop-trics.com");

	}
	
	

}
