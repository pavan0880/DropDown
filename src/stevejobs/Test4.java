package stevejobs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{

	public static void main(String[] args) throws Exception
	{
		// open chrome browser
		System.setProperty("webdriver.chrome.driver",  
				                        "G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site 
		driver.get("http://www.sentia.in");
		Thread.sleep(5000);
		//Click on pay-online
		driver.findElement(By.xpath("//img[contains(@src,'pay_online')]")).click();
		Thread.sleep(5000);
		//Click on is term fee
		driver.findElement(By.xpath("//*[@id='payol']/a")).click();
		Thread.sleep(5000);
		//Collect browser windows / tabs handles /(unique)(string type)
		
		
		
		
		
				
		
		
		

	}

}
