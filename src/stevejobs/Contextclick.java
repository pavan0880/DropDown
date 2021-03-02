package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick {

	public static void main(String[] args) throws Exception {
		//Open chrome browser
				System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Launch site
				driver.get("https://www.google.co.in");
				Thread.sleep(5000);
				//Right click on Gmail link
				WebElement e=driver.findElement(By.linkText("Gmail"));
				Actions a=new Actions(driver);
				a.moveToElement(e).perform();
				System.out.println();
			
		

	}

}
