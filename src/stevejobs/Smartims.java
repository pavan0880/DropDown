package stevejobs;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Smartims {

	public static void main(String[] args) throws Exception {
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.smartims.com/"); 
		//Get Current Url is secured or not 
		String x=driver.getCurrentUrl();
		if (x.contains("https:"))
		{
			System.out.println("Smart ims is secured");
		}
		else
		{
			System.out.println("Smaet ims is unsecured");
		}
		WebElement e=driver.findElement(By.xpath("(//a[@class='nav-link m-dn'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(e).build().perform();
		driver.findElement(By.id("logo")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(2500,-1000)");
		//Get Screen Shot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File src=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("I:\\Pa-one\\sims.png");
		FileHandler.copy(src,dest);
		driver.findElement(By.xpath("(//a[@class='ab-link'])[13]")).click();
		Set<String> handle=driver.getWindowHandles();
		ArrayList<String>  arry=new ArrayList<String>(handle);
		driver.switchTo().window(arry.get(1));
		
		
		
		
		

	}

}
