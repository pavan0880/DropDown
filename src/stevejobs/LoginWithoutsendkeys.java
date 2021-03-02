package stevejobs;

import java.awt.Dimension;

import java.awt.Point;
import java.util.Set;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithoutsendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		js.executeScript("arguments[0].value=arguments[1]", search,"Iphones");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handle=driver.getWindowHandles();
		ArrayList<String> array=new ArrayList<String>(handle);
		driver.switchTo().window(array.get(0));
		driver.switchTo().window(array.get(1));
		driver.get("https://www.facebook.com/");
		WebElement login=driver.findElement(By.name("email"));
		js.executeScript("arguments[0].value=arguments[1]",login,"8019910880");
		Dimension d = new Dimension(480,620);
        
        
		
		
	
		
		
		
		

	}

}
