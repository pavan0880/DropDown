package stevejobs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshow1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/hyderabad");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("preSignIn")).click();
		Thread.sleep(2000);
		WebElement tabbeWindowButton =driver.findElement(By.xpath("//div[@id='signinPopup']/div/div[2]/div/aside[1]/div[1]/a[1]/div"));
		tabbeWindowButton.click();
		Thread.sleep(2000);
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> iter = windowIds.iterator();
		String mainWindow =iter.next();
		String childWindow = iter.next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.name("email")).sendKeys("sekhar.pavan171@gmail.com");
		
		
		}
		
		
	
	}


