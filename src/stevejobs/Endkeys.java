package stevejobs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Endkeys {
	private static CharSequence ENTER;

	public static void main(String[] args) throws Exception {
		//Open Chrome Browser 
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		driver.findElement(By.name("firstname")).sendKeys("Ra-one");
		act.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("Pa-one")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("8019910880")
		.sendKeys(Keys.TAB)
		.sendKeys("Pavan123456")
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB)
		.sendKeys("14")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("jan")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("2000")
		.sendKeys(Keys.TAB)
		.build().perform();
		Dimension dim=new Dimension(300,500);
		driver.manage().window().setSize(dim);
		
		
	}

}
