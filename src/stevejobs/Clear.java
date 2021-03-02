package stevejobs;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.jam.internal.elements.VoidClassImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Clear {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("palaa sjidj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();
		String pavanURL=driver.getCurrentUrl();
        System.out.println(pavanURL);
       String shashank= driver.getTitle();
       System.out.println(shashank);
       driver.switchTo().newWindow(WindowType.TAB);
       Thread.sleep(2000);
       TakesScreenshot scrShot =((TakesScreenshot)driver);
       File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
       File DestFile=new File("I:\\Pa-one\\google.png");
       FileHandler.copy(SrcFile, DestFile);
       Set<String> handle=driver.getWindowHandles();
		ArrayList <String> arr=new ArrayList<String>(handle);
		driver.switchTo().window(arr.get(1));
		driver.get("https://www.vrbo.com/");
		String raoneurl=driver.getCurrentUrl();
		System.out.println(raoneurl);
		String vrbo=driver.getTitle();
		System.out.println(vrbo);
		WebElement w=driver.findElement(By.id("react-destination-typeahead"));
		w.sendKeys("america");
		Actions act=new Actions(driver);
		for (int i=1;i<=5;i++)
		{
			
			act.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(2000);
		}
			act.sendKeys(Keys.ENTER).build().perform();
			 TakesScreenshot scrShot1 =((TakesScreenshot)driver);
			 File src=scrShot1.getScreenshotAs(OutputType.FILE);
				File dest=new File("I:\\Pa-one\\vrbo.png");
				FileHandler.copy(src,dest);
				
				driver.findElement(By.xpath("//a[text()='List your Property']")).click();
				Set<String> hand=driver.getWindowHandles();
				ArrayList <String> ary=new ArrayList<String>(hand);
				TakesScreenshot scrShot2 =((TakesScreenshot)driver);
				File SrcFile2=scrShot1.getScreenshotAs(OutputType.FILE);
				File DestFile2=new File("I:\\Pa-one\\vrbo1.png");
				FileHandler.copy(SrcFile2, DestFile2);
				driver.switchTo().window(ary.get(2));
				Thread.sleep(2000);
				for (int i=0; i<8; i++) {
					driver.findElement(By.xpath("(//span[@class='SVGIcon SVGIcon--16px flex-center'])[2]")).click();
				}
				for (int i=0; i<6; i++) {
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[3]/button[2]/span[2]")).click();
				}
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@aria-label='Enter address...']")).sendKeys("London");
				Thread.sleep(2000);
				driver.switchTo().window(arr.get(0));
				
				
			
		
       
    }   

	}


