package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) throws Exception
	{
		// open chrome browser
		System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//Locate <div>tag drop down
		WebElement e=driver.findElement(By.xpath("//*[@id='multiple-Search-selection]/following-sibling::*[2]"));
		String x=e.getAttribute("class");
		if (x.contains("multiple"));
		{
			System.out.println("multi select drop-down");
		}
		{
			System.out.println("single select drop-down");
		}
		//close site
		driver.close();
		
		
		
		

	}

}
