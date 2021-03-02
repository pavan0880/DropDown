package stevejobs;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24 
{
	public static void main(String[] args) throws Exception 
	{
		//Open chrome browser 
		System.setProperty("webdriver.chrome.driver","G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch Site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//Locate <div> tag drop down element
		WebElement e=driver.findElement(By.xpath("//a[@id='selection']/following-sibling::*[3]"));
		//Open that Drop down
		e.click();
		//collect items from that drop down 
		WebElement Listl = e.findElement(By.xpath("child::div[2]/div"));
		//System.out.println(l.size());
		boolean WebElement;
	//	For(WebElement i:l)
		{
	//		System.out.println(i.getText());
		}
		//select an item
	//	l.get(1).click(); // 2nd item 
		
		
		
		

	}

}
