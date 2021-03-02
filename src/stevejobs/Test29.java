package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test29 {

	public static void main(String[] args) throws Exception {

		//Open chrome browser
		System.setProperty("webdriver.chrome.driver",
                                      "G:\\Pavan Sekhar\\New folder\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//Locate <div> tag multi-select drop-down
		WebElement dropdown=driver.findElement(
				        By.xpath("//h4[text()='Multiple Selection']/following-sibling::div"));        
		//Open that multi-select drop down items list
		dropdown.click();
		Thread.sleep(5000);
		//Collect all items of that multi-select dropdown
		List<WebElement> allitems=dropdown.findElements(By.xpath("child::div[2]/div"));
		System.out.println("All items count is "+allitems.size());
		//Select multiple items
		allitems.get(0).click(); //1st item
		Thread.sleep(5000);
		allitems.get(5).click(); //6th item
		Thread.sleep(5000);
		allitems.get(17).click(); //18th item
		Thread.sleep(5000);
		allitems.get(8).click(); //9th item
		Thread.sleep(5000);
		allitems.get(2).click(); //2 nd item
		Thread.sleep(5000);
		allitems.get(18).click(); //18 th item 
		WebElement dropdown1=driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[9]/div/div[1]"));
		//Open that multi-select section 
		dropdown1.click();
		Thread.sleep(5000);
		//Collect all itens of that multi search selection
		List<WebElement> allitems1=dropdown1.findElements(By.xpath("child::div[2]/div"));
		System.out.println("All items count is "+allitems1.size());
		//select multiple items 
		allitems1.get(2).click(); //2 nd item
		Thread.sleep(5000);
		allitems1.get(5).click(); //5th item
		
		

	}

}
