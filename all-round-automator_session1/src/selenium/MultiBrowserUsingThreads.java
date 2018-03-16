package selenium;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import lib.FrameworkUtil;

public class MultiBrowserUsingThreads {

	public static void main(String[] args) throws IOException {
		
		Properties prop = FrameworkUtil.propUtil("src/resources/seleniumThreads.properties");
		String[] selThreads = prop.getProperty("THREADS").split(";");
		
		for (String selThread : selThreads) {
			
			Thread t = new Thread(new Runnable(){
								@Override
									public void run() {
										String[] brwAndURL = selThread.split(">");
										String browser = brwAndURL[0].trim();
										String url = brwAndURL[1].trim();
										WebDriver driver = getDriver(browser);
										if(driver != null) {
											driver.get(url);
											driver.manage().window().maximize();
											
											if(url.contains("yahoo")) {
												driver.findElement(By.id("uh-search-box")).clear();
												driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
												driver.findElement(By.id("uh-search-button")).click();
											}
											
											if(url.contains("msn")) {
												driver.findElement(By.id("q")).clear();
												driver.findElement(By.id("q")).sendKeys("Appium");
												driver.findElement(By.id("sb_form_go")).click();
											}
											System.out.println(selThread + " is sleeping now");
											try {
												Thread.sleep(5000);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											System.out.println(selThread + " is quitting now");
											driver.quit();
										}

									}
							});
			t.start();
		}
		
		
	}


	public static WebDriver getDriver(String browser) {
		WebDriver driver = null;
		switch(browser.toUpperCase()) {
		case "CHROME":
			//System.setProperties("",""); //not setting properties as I have drivers directory
			//covered in PATH system variable
			driver = new ChromeDriver();
			break;
		case "MOZILLA":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("browser unsupported: " + browser);
			break;
						
		}
		return driver;
		
	}
}

