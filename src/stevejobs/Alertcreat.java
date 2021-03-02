package stevejobs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertcreat {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("25803");
		driver.findElement(By.name("submit")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		alt.dismiss();
		Thread.sleep(2000);
		alt.accept();
		driver.navigate().to("https://www.vrbo.com/");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hi Hello Ra-one')");
		Thread.sleep(2000);
		String message=driver.switchTo().alert().getText();
		

	}

}
