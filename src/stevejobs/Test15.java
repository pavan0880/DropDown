package stevejobs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Test15
{
	public static void main(String[] args) 
	{
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		FluentWait w=new FluentWait(driver);
		w.pollingEvery(Duration.ofMillis(100));
		w.withTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//Lauch site 
		driver.get("https://in.ebay.com/");
		//Locates ads-list / spinner element
		WebElement e=driver.findElement(By.xpath("(//ul[@class='carousel_list'])[1]"));
		List<WebElement> l=e.findElements(By.xpath("child::li"));
		System.out.println("Total count of Ads in Ad-list is");
		//Ads are rotating or not 
		String t=e.getCssValue("transform");
		if (t!=null)
		{
			System.out.println("Ad-list is rotating / spinning");
		}
		else
		{
			System.out.println("Ad-list is not rotating / spinning");
			System.exit(0); // stop execution
		}
		//check for 2D or 3D
		
			
			
			
		
		
		
		
		
		
		
		
		

	}

}
