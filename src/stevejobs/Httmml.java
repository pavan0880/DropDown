package stevejobs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Httmml {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Open chrome browser
				System.setProperty("webdriver.chrome.driver",
						                                      "F:\\chromedriver_win32\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				Thread.sleep(5000);
				//Launch site
				driver.get("https://www.vrbo.com/");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				//Click List your Property 
				driver.findElement(By.xpath("//a[text()='List your Property']")).click();
				Thread.sleep(2000);
				//Collect browser windows/tabs handles,  which are unique and string type
				Set<String> wins1=driver.getWindowHandles();
				ArrayList<String> al1=new ArrayList<String>(wins1); 
				//Switch to 2nd browser window/tab
				driver.switchTo().window(al1.get(1)); //2nd
				for (int i=0; i<5; i++) {
					driver.findElement(By.xpath("(//span[@class='SVGIcon SVGIcon--16px flex-center'])[2]")).click();
				}
				for (int i=0; i<6; i++) {
					driver.findElement(By.xpath("(//span[@class='SVGIcon SVGIcon--16px flex-center'])[4]")).click();
				}
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(5000);
				WebElement e=driver.findElement(By.xpath("//div[@class='typeahead']/input"));

				driver.executeScript("arguments[0].click()", e);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[@class='typeahead']/input")).sendKeys("Canada");
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//li[@class='typeahead-prediction-item'])[3]")).click();
				Thread.sleep(2000);
				
				
				
	}

}
