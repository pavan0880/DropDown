package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		    
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement element=driver.findElement(By.name("q"));
		String s=null;
		element.sendKeys(s);
		
		

	}

}
