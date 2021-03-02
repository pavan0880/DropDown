  package stevejobs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17 {

	public static void main(String[] args) throws Exception
	{
		// Open Chrome Browser 
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Launch site 1 and get window handle
		driver.get("https://www.gmail.com");
		String x=driver.getWindowHandle();
		Thread.sleep(5000);
		
		//Launch site 2 and get window handle
		WebDriver newtab1=driver.switchTo().newWindow(WindowType.TAB);
		newtab1.get("https://www.google.com");
		Set<String> y=newtab1.getWindowHandles();
		Thread.sleep(5000);
		
		//Launch site 3 and get window handle
		WebDriver newtab2=driver.switchTo().newWindow(WindowType.TAB);
		newtab2.get("https://www.facebook.com");
		String z=newtab2.getWindowHandle();
		Thread.sleep(5000);
		
		//Switch to requried using windows using window handles
		driver.switchTo().window(x);
		driver.findElement(By.name("identifier")).sendKeys("ra-one@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Pa-one@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().window(z);
		driver.findElement(By.name("q")).sendKeys("kalam");
		Thread.sleep(5000);
		
		driver.switchTo().window(z);
		driver.findElement(By.name("email")).sendKeys("Pa-one@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ra-one@123");
		Thread.sleep(5000);

	}

}
