package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test28 
{
	public static void main(String[] args) throws Exception 
	{
		//Open chrome browser
				System.setProperty("webdriver.chrome.driver",
						                             "G:\\Pavan Sekhar\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				Thread.sleep(5000);
				driver.manage().window().maximize();
				//Launch site
				driver.get("https://www.flipkart.com");
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//*[text()='Login'])[1]/preceding::button[1]")).click();       
				Thread.sleep(5000);
				WebElement e=driver.findElement(By.xpath("//*[text()='Women']"));
				Actions a=new Actions(driver);
				//a.moveToElement(e).perform();
				//a.moveToElement(e,20,5).perform();
				int x=e.getLocation().getX();
				int y=e.getLocation().getY();
				a.moveByOffset(x+20,y+5).perform();

	}

}
