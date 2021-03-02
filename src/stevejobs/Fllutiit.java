package stevejobs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Fllutiit {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.vrbo.com/");
		
		WebDriverWait pav=new WebDriverWait(driver,20000);
	    pav.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Login']")));
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		pav.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-destination-typeahead")));
		driver.findElement(By.id("react-destination-typeahead")).sendKeys("America");
		
			Actions lav=new Actions(driver);
			for (int i=1;i<=5;i++)
			{
				
				lav.sendKeys(Keys.DOWN).build().perform();
				Thread.sleep(2000);
			}
				lav.sendKeys(Keys.ENTER).build().perform();
				pav.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@aria-label='November 11, 2020']")));
				driver.findElement(By.xpath("//td[@aria-label='November 11, 2020']")).click();
				pav.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@aria-label='November 21, 2020']")));
				driver.findElement(By.xpath("//td[@aria-label='November 21, 2020']")).click();
				
	
				for (int i=1;i<=6;i++) {
					pav.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[@data-id='SVG_PLUS__16'])[1]")));
				
					driver.findElement(By.xpath("(//*[@data-id='SVG_PLUS__16'])[1]")).click();
				}
				pav.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='List your Property']")));
				driver.findElement(By.xpath("//a[text()='List your Property']")).click();
				Set<String> handle=driver.getWindowHandles();
				ArrayList<String> arry=new ArrayList<String>(handle);
				driver.switchTo().window(arry.get(1));
				Thread.sleep(2000);
				for (int i=1;i<6;i++) {
					pav.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='SVGIcon SVGIcon--16px flex-center'])[2]")));
					driver.findElement(By.xpath("(//span[@class='SVGIcon SVGIcon--16px flex-center'])[2]")).click();
					driver.switchTo().window(arry.get(0));
					pav.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
					driver.findElement(By.xpath("//button[@type='submit']")).click();
					
				}
		}
	
	
		
		
	
		

		
			
		}

	


