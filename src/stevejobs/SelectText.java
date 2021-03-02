package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectText {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver2.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// Launch the URL 
        driver.get("https://www.mercurytravels.co.in/");
        driver.findElement(By.xpath("(//span[@aria-hidden='true'])[3]")).click();
        WebElement e=driver.findElement(By.xpath("//select[@id='duration_d']"));
        Select s=new Select(e);
        s.selectByVisibleText("5Nights+6Days");
        Thread.sleep(2000);
        String y=e.findElement(By.xpath("option[12]")).getText();
        System.out.println("Selected item is"+y); 
        List<WebElement> items=e.findElements(By.xpath("option"));
        System.out.println("Count of items is"+items.size());
        e.click();
        Thread.sleep(2000);
        //Display items text 
        for(WebElement item:items)
        {
        	String x=item.getText();
        	System.out.println(x);
        }

	}

}
