package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cacctionsa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.vrbo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement w=driver.findElement(By.id("react-destination-typeahead"));
		w.sendKeys("america");
		Actions lav=new Actions(driver);
		for (int i=1;i<=5;i++) {
			Thread.sleep(2000);
			lav.sendKeys(Keys.DOWN).build().perform();
			
		}
		lav.sendKeys(Keys.ENTER).build().perform();

	}

}
