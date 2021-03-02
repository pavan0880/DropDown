package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test36 {

	private static List<WebElement> allitems;

	public static void main(String[] args) throws Exception 
	{
		// Open chrome Browser
		System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\New folder\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Launch Site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//Locate <div> tag drop down
		WebElement dropdown=driver.findElement(
		        By.xpath("//h4[text()='Multiple Selection']/following-sibling::div"));  
		dropdown.click();
		Thread.sleep(5000);
		// open that search selection drop down items list
		dropdown.click();
		Thread.sleep(5000);
		List<WebElement> allitems=dropdown.findElements(By.xpath("child::div[2]/div"));
		System.out.println("all items count is "+allitems.size());
		//select multiple items
		allitems.get(0).click(); // 1st item
		Thread.sleep(5000);
		allitems.get(4).click(); // 4 th item
		Thread.sleep(5000);
		allitems.get(14).click(); // 14 th item
		Thread.sleep(5000);
		allitems.get(8).click(); // 8th item
		Thread.sleep(5000);
		WebElement dropdown1=driver.findElement(By.xpath("//h4[text()='Multiple Search Selection']/following-sibling::div      "));
		dropdown1.click();
		Thread.sleep(5000);
		List<WebElement> allitems1=dropdown1.findElements(By.xpath("child::div[3]/div"));
		System.out.println("all items1 count is "+allitems1.size());
		//select multiple items
		allitems1.get(0).click();
		Thread.sleep(5000);
		allitems1.get(5).click();
		Thread.sleep(5000);
		allitems1.get(9).click();
		
		
		
		
		
		
		
		
			
		
		
		

	}

}
