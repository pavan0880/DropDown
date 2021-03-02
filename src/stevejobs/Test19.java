package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test19 {

	public static void main(String[] args) throws Exception {
		//Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Enter URL Page Name
		driver.get("https://www.vrbo.com/");
		Thread.sleep(2000);
		//Login 
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		//Traveller Login
		driver.findElement(By.xpath("//a[@class='se-traveler-login']")).click();
		Thread.sleep(2000);
		//EnterEmail id 
		driver.findElement(By.name("emailAddress")).sendKeys("sekhar.pavan171@gmail.com");
		
		
	}
	}
	