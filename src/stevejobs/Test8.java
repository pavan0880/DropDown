package stevejobs;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws Exception
	{
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver","G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		//Locate ads-list/spinner element
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("HP laptops");
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		//Collect ads from ad rotator/spinner 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
