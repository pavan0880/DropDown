package stevejobs;

import java.util.List;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver2.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		Thread.sleep(1000);
		driver.findElement(By.name("uid")).sendKeys("mngr281121");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("ryqUdev");
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		String actual=driver.getTitle();
		String expected="Guru99 Bank Manager HomePage";
		
		driver.close();
		
		
	


	}

}
