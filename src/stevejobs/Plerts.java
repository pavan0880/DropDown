package stevejobs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Plerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
				ChromeDriver lavanya=new ChromeDriver();
				lavanya.get("https://www.snapdeal.com/");
				lavanya.manage().window().maximize();
				System.out.println(lavanya.getTitle());
				Thread.sleep(2000);
				 Actions action= new Actions(lavanya);
				 
				   WebElement ele1=lavanya.findElement(By.linkText("All Offers")); 
				   action.moveToElement(ele1).build().perform();
				   Thread.sleep(3000);
					lavanya.findElement(By.linkText("Slippers")).click();
					System.out.println(lavanya.getTitle());
					Thread.sleep(2000);	
					
					String a=lavanya.getWindowHandle();
					
					WebDriver newtab1=lavanya.switchTo().newWindow(WindowType.TAB);
					newtab1.get("https://www.amazon.in/");
					String b=newtab1.getWindowHandle();
					lavanya.findElement(By.id("twotabsearchtextbox")).sendKeys("apple i phones");
			
					WebDriver newtab2=lavanya.switchTo().newWindow(WindowType.TAB);
					newtab2.get("https://www.facebook.com");
					String z=newtab2.getWindowHandle();
					Thread.sleep(5000);
					lavanya.findElement(By.name("email")).sendKeys("Ra-one@gmail.com");
					
					lavanya.switchTo().window(b);
					lavanya.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
					lavanya.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - White']")).click();
					Thread.sleep(2000);
					
				
					WebElement gbs=lavanya.findElement(By.xpath("(//span[text()='128 GB'])[2]"));
					lavanya.executeScript("arguments[0].click();", gbs);
					
					
					Thread.sleep(5000);
					lavanya.findElement(By.id("submit.buy-now-announce")).click();
					Thread.sleep(2000);
					
					
					
					
					
					
					
							
	
	}

}
