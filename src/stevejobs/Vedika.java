package stevejobs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vedika {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.vedikas.com/coming-soon");
		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("info@suntechnoservices.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Vedikas@2021");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Get current url of current page
				String x=driver.getCurrentUrl();
				if(x.contains("https:"))
				{
					System.out.println("Vedika's Site is secured");
				}
				else
				{
					System.out.println("Vedika's Site is unsecured");
				}
		

	}

}
