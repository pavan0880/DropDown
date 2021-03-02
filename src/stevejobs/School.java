package stevejobs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class School {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				Actions act=new Actions(driver);
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone mobiles");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value='Go']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//span[text()='Apple iPhone 11 (64GB) - White'])[1]")).click();
				Thread.sleep(2000);
		 		
				Set<String> wins=driver.getWindowHandles();
				ArrayList<String> al=new ArrayList<String>(wins); 
				driver.switchTo().window(al.get(1)); //2nd browser window/tab
				//Get current url of current page
				String y=driver.getCurrentUrl();
				
				driver.executeScript("window.scrollTo(0,450)");
				Thread.sleep(2000);
				WebElement buy=driver.findElement(By.id("buy-now-button"));
				driver.executeAsyncScript("arguments[0].click();", buy);
				Thread.sleep(2000);
				driver.findElement(By.name("email")).sendKeys("sekhar.pavan171@gmail.com");
				
			}

		
		}
		


