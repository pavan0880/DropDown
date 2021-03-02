package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws Exception
	{
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver2.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Abdul");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();
		Dimension d=new Dimension(300, 400);
		driver.manage().window().setSize(d);
		
		
		
		
	}

}
