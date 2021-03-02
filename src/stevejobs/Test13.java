package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 
{
	public static void main(String[] args) throws Exception
	{
		// Open chrome browser
				
		System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/results?search_query=jara+jara+song");
		Thread.sleep(5000);
		driver.findElement(By.xpath("ltr")).click();
		
		

	}

}
