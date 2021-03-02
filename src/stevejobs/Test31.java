package stevejobs;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test31 {

	public static void main(String[] args) throws Exception {
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//Launch site
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		//Locate Element 
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys("pavan");
		Thread.sleep(5000);
		//Get size
		Rectangle r=e.getRect();
		int w=r.getWidth();
		int h=r.getHeight();
		//Get loaction
		int x=r.getX();
		int y=r.getY();
		System.out.println(x+" "+y+" "+w+" "+h);
		//Get screen short
		File src=e.getScreenshotAs(OutputType.FILE);
		File dest=new File("elementss.png");
		FileHandler.copy(src, dest);
		
		
		
		
		

	}

}
