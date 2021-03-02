package stevejobs;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test18 {

	public static void main(String[] args) throws Exception
	{
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// launch site
		driver.get("https://www.gmail.com");
		WebDriverWait w=new WebDriverWait(driver,2000);
		w.until(ExpectedConditions.elementToBeClickable(By.name("identifier")));
		//Fill fileds for login
		driver.findElement(By.name("identifier")).sendKeys("sekhar.pavan171@gmail.com");
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("PSpavan@123");
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button'][text()='Compose']")));
		//Click on Compose
		driver.findElement(By.xpath("//div[@role='button'][text()='Compose']")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='to']")));
		//Fill Fileds
		driver.findElement(By.xpath("//*[@name='to']")).sendKeys("sekhar.pavan181@gmail.com");
		driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("Hi 57 TESTS");
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("hi mounika i am sending");
		//Click Attachment link 
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Filedata']/preceding::div[2]")));
		driver.findElement(By.xpath("//*[@name='Filedata']/preceding::div[2]")).click();
		// Get handle file upload window (java ROBOT)
		Thread.sleep(5000);
		StringSelection fp=new StringSelection("F:\\stevejobs-20191029T102420Z-001.zip");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fp, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_K);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		//Send mail(SWD)
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[starts-with(@aria-label,'Uploading')]")));
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		try
		{
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Message sent.']")));
			System.out.println("message sent displayed");
		}
		catch(Exception ex)
		{
			System.out.println("message sent not displayed");
		}
		//Do logout (SWD)
		driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account')]/span")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out")));
		driver.findElement(By.linkText("Sign out")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='choose an account']")));
		//close site (SWD)
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
