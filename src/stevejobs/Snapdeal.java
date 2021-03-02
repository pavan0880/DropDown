package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//*[text()='All Offers']"));
		Actions act=new Actions(driver);
		act.moveToElement(e).build().perform();
		//Count the number of items
		List<WebElement> links=driver.findElements(By.cssSelector("span[class='catText']"));
		int count=links.size();
		System.out.println(count);

		for(int i=0;i<count;i++)
		{
			String sel=links.get(i).getText();
			System.out.println(sel);
			
			links.get(i).click();
			
			
			List<WebElement> linkss=driver.findElements(By.xpath("//span[@class='linkTest']"));
			int countt=linkss.size();
			System.out.println(countt);
			
			for(int j=0;j<countt;j++)
			{
				String sl=linkss.get(j).getText();
				System.out.println(sl);
			}
		}
		
		
	}

}
