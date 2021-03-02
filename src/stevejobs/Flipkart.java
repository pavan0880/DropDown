package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\83.0\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Open Adactinhotel Url
		driver.get("http://adactinhotelapp.com/index.php");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("yaswanth");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("@Y2551383");
		driver.findElement(By.name("login")).click();
		//Date Picker 
		driver.findElement(By.xpath("//*[@id=\"checkin_span\"]")).click();
		driver.findElement(By.xpath("//*[@value='20/07/2020'")).click();
		
		
		
		

	}

}
