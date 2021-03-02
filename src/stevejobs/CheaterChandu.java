package stevejobs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheaterChandu {

	public static void main(String[] args) throws Exception {
		//Opening Google Web Site 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		// search the name of the cheater 
		driver.findElement(By.name("q")).sendKeys("narra chandra shekhar naidu",Keys.ENTER);
		driver.findElement(By.xpath("//*[text()='Images']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@jsname='uy6ald'])[12]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(8000);
		String parent=driver.getWindowHandle();
		Set<String> handle=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1= handle.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
			driver.switchTo().window(parent);
		}
		driver.findElement(By.xpath("(//a[@jsname='uy6ald'])[9]")).click();
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1500)");
		
		
		
		

	}
		}
	}


