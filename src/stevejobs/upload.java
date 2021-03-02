package stevejobs;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\83.20 chrome\\New folder\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easyupload.io/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h5[@class='title']")).click();
		Thread.sleep(5000);
		// Get handle file upload window (java ROBOT)
				Thread.sleep(5000);
				StringSelection fp=new StringSelection("F:\\stevejobs-20191029T102420Z-001.zip");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fp, null);
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_K);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(5000);
				driver.findElement(By.name("password")).sendKeys("Pavan@123");
				Thread.sleep(5000);
				driver.findElement(By.id("upload")).click();
				Thread.sleep(5000);
				
				
		
		
		
		

	}

}
