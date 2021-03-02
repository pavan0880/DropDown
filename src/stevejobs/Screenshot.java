package stevejobs;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Exception {
	////Open chrome browser
			System.setProperty("webdriver.chrome.driver",
					"F:\\chromedriver_win32\\chromedriver2.exe");
			ChromeDriver driver=new ChromeDriver();
			Thread.sleep(5000);
			//Launch site
			driver.get("https://www.amazon.in/ref=nav_logo");
			Thread.sleep(5000);
			//Get Screenshot of page
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("I:\\Pa-one\\paamazoncreen.png");
			FileHandler.copy(src,dest);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@class='nav-input'])[2]")).click();
			
			File sc=driver.getScreenshotAs(OutputType.FILE);
			File des=new File("I:\\Pa-one\\secondsreen.png");
			FileHandler.copy(sc, des);
			
			
			driver.close();

	}

}
