package stevejobs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsHandle {

	public static void main(String[] args) {
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vrbo.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handle=driver.getWindowHandles();
		ArrayList <String> arr=new ArrayList<String>(handle);
		driver.switchTo().window(arr.get(1));
		driver.get("https://www.google.com");
		driver.switchTo().window(arr.get(0));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		
		
		
		

	}

}
