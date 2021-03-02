package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\83.0\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// Launch the URL 
        driver.get("https://www.mercurytravels.co.in/");
        driver.findElement(By.xpath("(//span[@aria-hidden='true'])[3]")).click();
        Thread.sleep(2000);
        WebElement e=driver.findElement(By.xpath("//select[@id='duration_d']"));
        Select s=new Select(e);
       // s.selectByVisibleText("11Nights+12Days");
        
        
        

	}

}
