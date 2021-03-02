package stevejobs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vrbo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='List your Property']")).click();
		Set<String> handle=driver.getWindowHandles();
		ArrayList<String> arry=new ArrayList<String>(handle);
		driver.switchTo().window(arry.get(1));
		Thread.sleep(2000);
		for (int i=1;i<6;i++) {
			driver.findElement(By.xpath("(//span[@class='SVGIcon SVGIcon--16px flex-center'])[2]")).click();
			
		}
		Thread.sleep(2000);
		driver.switchTo().window(arry.get(0));
		
		
		
	}

}
