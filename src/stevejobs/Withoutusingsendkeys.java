package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Withoutusingsendkeys {

	public static void main(String[] args) throws Exception {
		// Open Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		js.executeScript("arguments[0].value=arguments[1]",search, "pavan sekhar");
		

	}

}
