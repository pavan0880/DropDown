package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Displayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Boolean Display = driver.findElement(By.xpath("//*[@aria-label=\"Search\"]")).isDisplayed();
		//To print the value
		System.out.println("Element displayed is :"+Display);
		Boolean Enable = driver.findElement(By.xpath("//a[text()='Sign in']")).isEnabled();
		System.out.println("Element enabled is :"+Enable);
		
		

	}

}
