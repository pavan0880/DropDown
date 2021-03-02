package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
public class Test6 {

	public static void main(String[] args) throws Exception
	{
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\New folder\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys("laung gawacha song");
		Thread.sleep(5000);
		//Search for a video (SWD)
		driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a")).click();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
