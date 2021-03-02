package stevejobs;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class Newtab {

	public static void main(String[] args) throws InterruptedException {
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site 1 and get window handle
		driver.get("https://www.suntechnoservices.com:2096/");
		String x=driver.getWindowHandle();
		Thread.sleep(5000);
		//Launch site 2 get windows handle 
		WebDriver newtab1=driver.switchTo().newWindow(WindowType.TAB);
		newtab1.get("https://www.facebook.com");
		Set<String> y=driver.getWindowHandles();
		//Launch site 3
		WebDriver newtab2=driver.switchTo().newWindow(WindowType.TAB);
		newtab2.get("https://www.gmail.com");
		Set<String> z=driver.getWindowHandles();
		//Launch site 4
		WebDriver newtab3=driver.switchTo().newWindow(WindowType.TAB);
		newtab3.get("https://www.vrbo.com/");
		String l=driver.getWindowHandle();
		
		
		
		
		

	}

}
