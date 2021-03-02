package stevejobs;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test27 
{
	public static void main(String[] args) throws Exception 
	{
		// Open Browser 
		System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Delete all existing cookies 
		driver.manage().deleteAllCookies();
		//Launch site
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		//Collect all cookies releated to that site page 
		Set <Cookie>cl=driver.manage().getCookies();
		ArrayList<Cookie>l=new ArrayList<Cookie>(cl);
		System.out.println("Count of cookies is "+l.size());
		//For (Cookie c:l)
		{
		//	System.out.println(c);
		}
		//close site
		driver.close();
		

	}

}
