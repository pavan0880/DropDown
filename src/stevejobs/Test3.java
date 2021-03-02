package stevejobs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.vrbo.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handle=driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(handle);
		driver.switchTo().window(arr.get(2));
		driver.get("https://www.gmail.com");
		driver.switchTo().window(arr.get(4));
		driver.get("https://www.facebook.com");
		driver.switchTo().window(arr.get(2));
		driver.switchTo().window(arr.get(0));
		driver.close();
		
		
	
	}

}
