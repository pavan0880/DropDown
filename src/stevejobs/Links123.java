package stevejobs;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Links123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vrbo.com/");
		driver.manage().window().maximize();
		  String url="";
	      List<WebElement> allURLs = driver.findElements(By.tagName("a"));
	      System.out.println("Total links on the Wb Page: " + allURLs.size());
	      
	      Iterator<WebElement> iterator = allURLs.iterator();
	      while (iterator.hasNext()) {
	    	  url = iterator.next().getText();
	    	  System.out.println(url);
	      }

	}

}
