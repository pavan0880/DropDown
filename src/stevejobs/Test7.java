package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws Exception
	{
		// open chrome browser
		System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Lauch site
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//Fill fields for login
		driver.findElement(By.name("identifier")).sendKeys("sekhar.pavan171@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("PSpavan@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		//Click on compose
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(5000);
		//Fill fileds 
		driver.findElement(By.xpath("//*[@name='to']")).sendKeys("sekhar.pavan181@gmail.com");
		driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("HAI PAVAN");
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("hi raone How are you");
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		//Get output message
		String x=driver.findElement(By.xpath("(//*[@class='vh'])[1]/child::span[1]")).getText();
		System.out.println(x);
		Thread.sleep(5000);
		//Do logout
		driver.findElement(By.xpath("//*[contains(@aria-label'Google Account')])/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		//close site 
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
				
				
		
		
		
		
		

	}

}
