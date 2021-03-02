package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoptionsall {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://omayo.blogspot.com/");
        
         //Write your code here
        WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
        Select select = new Select(multiSelectionBoxField);
        
         select.selectByVisibleText("Audi");
         Thread.sleep(2000);
         select.selectByIndex(1);
         Thread.sleep(2000);
         select.selectByValue("Hyundaix");
         Thread.sleep(5000);
         select.deselectByValue("Hyundaix");
         select.selectByVisibleText("Volvo");
         Thread.sleep(2500);
         select.deselectByVisibleText("Audi");
 
        List<WebElement> selectedoptions = select.getAllSelectedOptions();
        
        
         for(WebElement option : selectedoptions) {
               
               System.out.println(option.getText());
               
        }
        
        
         driver.quit();
        
 }



	}


