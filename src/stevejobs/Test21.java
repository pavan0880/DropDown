package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21 {

	public static void main(String[] args) throws Exception 
	{
		// open excel broad band bill pay site
		System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//open site
		driver.get("https://www.excellbroadband.com/billpay.html");
		Thread.sleep(5000);
		driver.findElement(By.id("customerid")).sendKeys("12260");
		
		
		
		
		

	}

}
