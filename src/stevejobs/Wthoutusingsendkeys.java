package stevejobs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wthoutusingsendkeys {
	public static void main(String[] args) throws Exception {
		//Open Chrome browser 
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		// Initialize JS object
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		// Enter username
		JS.executeScript("document.getElementById('email').value='sekhar'");
		// Enter password
		JS.executeScript("document.getElementById('pass').value='Ra-one123'");
		
	}

}
