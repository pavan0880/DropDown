package stevejobs;

import java.awt.Button;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vrbo {

	public static void main(String[] args) throws Exception {
		//Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "G:\\browser version 81\\browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Open Vrbo Site 
		driver.get("https://www.vrbo.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("input1-dates")).sendKeys("Arrive");
		driver.findElement(By.xpath("//*[@aria-label='May 30, 2020']")).click();
		driver.findElement(By.id("input2-dates")).sendKeys("Depart");
		driver.findElement(By.xpath("//*[@aria-label='June 5, 2020']")).click();
        driver.findElement(By.id("input-guests__help")).sendKeys("Guests");
        WebElement button = driver.findElements(By.xpath("//div/div[1]/div/div[1]/div/button[2]")).get(3);
        button.click();
        
      
        	
        
		
		
		

	}

}