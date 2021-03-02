package stevejobs;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26 
{
	public static void main(String[] args) throws Exception 
	{
		// open browser 
		System.setProperty("webdriver.chrome.driver","G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		//Get size of browser window 
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		System.out.println(w+" "+h);
		Dimension d=new Dimension(800,400);
		driver.manage().window().getSize();
		Thread.sleep(5000);
		// Get position of browser windows on desktop
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println(x+" "+y);
		//Set position of browser window 
		Point p=new Point(500,300); //X&Y Coordinates 
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		//close site 
		driver.close();
		
		
		

	}

}
