package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test30 {

	public static void main(String[] args) throws Exception 
	{
		// Open chrome browser 
		System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Open Website 
		driver.get("https://www.andhrabank.in/english/home.aspx");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='cssmenu']")).click();
		driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[1]/ul/li[1]/a")).click();
		

	}

}
