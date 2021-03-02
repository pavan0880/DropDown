package stevejobs;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test2 {

	private static RemoteWebDriver newtab;

	public static void main(String[] args) throws Exception
	{
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\New folder\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		//Go to gmail site
		driver.navigate().to("http:www.gmail.com");
		Thread.sleep(5000);
		//new tab 1
		String x=driver.getWindowHandle();
		WebDriver newtab1=driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.co.in");
		driver.navigate().to("https://www.amazon.com");
		//new tab 2
		String y=driver.getWindowHandle();
		WebDriver newtab2=driver.switchTo().newWindow(WindowType.TAB);
		newtab2.get("https://www.flipkart.com");
		//new tab 3
		String z=driver.getWindowHandle();
		WebDriver newtab3=driver.switchTo().newWindow(WindowType.TAB);
		newtab3.get("https://www.xe.com");
		driver.switchTo().window(x);
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("sekhar.pavan171@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("PSpavan@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@role='button'][text()='Compose']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='to']")).sendKeys("sekhar.pavan181@gmail.com");
		driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("Hi 57 TESTS");
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("hi pavan i am sending");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='Filedata']/preceding::div[2]")).click();
		//File upload Window 
		Thread.sleep(5000);
		StringSelection fp=new StringSelection("F:\\New folder\\Master Namaskram Master C.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fp, null);
		Thread.sleep(5000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_K);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		//Send mail
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
		
		
		
		
		
		
		
		
		
		
				
		
		

	}

}
