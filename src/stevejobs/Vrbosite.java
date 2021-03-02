package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vrbosite {

	public static void main(String[] args) throws Exception {
		//Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "G:\\browser version 81\\browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Open Vrbo Site 
		driver.get("https://www.vrbo.com/");
		Thread.sleep(5000);
		//Click Vrbo Logo Automatically it will refresh 
		driver.findElement(By.xpath("//*[@itemprop='logo']")).click();
		Thread.sleep(5000);
		//Click Login Button
		driver.findElement(By.id("site-header__login")).click();
		//Click Traveller Login 
		driver.findElement(By.xpath("//*[@class='se-traveler-login']")).click();
		Thread.sleep(5000);
		//Enter Email id 
		driver.findElement(By.xpath("//*[@aria-label='Email address']")).sendKeys("sekhar.pavan171@gmail.com");
		

	}

}
