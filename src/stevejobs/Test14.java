package stevejobs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 {

	public static void main(String[] args)throws Exception
	{
		// Open chrome browser
		
				System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.google.co.in");
				Thread.sleep(5000);
				driver.findElement(By.className("q")).sendKeys("kalam");
				
				
				
				
				
					
					
				}
			
				
				
				
				

	}
