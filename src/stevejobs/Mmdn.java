package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mmdn {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver",
				                        "F:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		driver.executeScript("window.scrollTo(0,1300)");
		//Locate <div> tag drop down element
		WebElement e=driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div"));   
		//open that drop-down
		e.click(); 
		//collect items from that drop-down
		List<WebElement> l=e.findElements(By.xpath("child::div[2]/div"));
		System.out.println(l.size());
		for(WebElement i:l)
		{
			System.out.println(i.getText());
		}
		//Select an item
		l.get(0).click(); //1nd item 
		Thread.sleep(5000);
		l.get(5).click();
		Thread.sleep(5000);
		l.get(8).click();
		Thread.sleep(2000);
		l.get(17).click();
		Thread.sleep(2000);
		l.get(14).click();
		Thread.sleep(2000);
		
		
	
        
        

	}

}
