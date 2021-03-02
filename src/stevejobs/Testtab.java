package stevejobs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testtab {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Get current url of current page
		String x=driver.getCurrentUrl();
		if(x.contains("https:"))
		{
			System.out.println("Amazon Site is secured");
		}
		else
		{
			System.out.println("Amazon Site is unsecured");
		}
		//G
		Actions act=new Actions(driver);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone mobiles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 11 (64GB) - White'])[1]")).click();
		Thread.sleep(2000);
 		
        String MainWindow=driver.getWindowHandle();		
        		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
		
		driver.executeScript("window.scrollTo(0,450)");
		Thread.sleep(2000);
		WebElement buy=driver.findElement(By.id("buy-now-button"));
		driver.executeAsyncScript("arguments[0].click();", buy);
		driver.findElement(By.name("email")).sendKeys("sekhar.pavan171@gmail.com");
		
	}

}
}
}

