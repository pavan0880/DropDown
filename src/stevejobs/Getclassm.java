package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getclassm {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver2.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vrbo.com/");
		Thread.sleep(2000);
		Dimension dime=driver.findElement(By.id("react-destination-typeahead")).getSize();
		System.out.println("Height of the search box field is:"+dime.height);
		System.out.println("Height of the search box field is:"+dime.width);

	}

}
