package stevejobs;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class Test16 
{
	private static final Select s = null;
	private static final boolean WebElement = false;
	private static WebElement i;

	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver",
                                                   "G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(5000);
		//Locate drop-down in page
		WebElement e=driver.findElement(By.name("nights"));
		Select s=new Select(e);
		//Collect all items in drop-down
		//List<WebElement> loi=s.getOptions();
		//System.out.println(loi.size());
		//for(WebElement i:loi)
		{
	//		System.out.println(i.getText());
		}
		//close site
		driver.close();
		
		
		
		

	}

}
