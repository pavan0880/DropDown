package stevejobs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vrbo.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hi Hello VRBO')");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		js.executeScript("window.scrollBy(0,500)");
		driver.manage().window().setPosition(new Point(100,200));
		driver.manage().window().maximize();
		driver.manage().window().getPosition();
		
		
		
	}

}