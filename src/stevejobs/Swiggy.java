package stevejobs;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Swiggy {

	public static <WebElement> void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("location")).sendKeys("kakinada");
		Actions pav=new Actions(driver);
		for(int i=1 ; i<=5 ; i++)
		{
			pav.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(2000);
		}
		pav.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		
		
		
		

	}

}
