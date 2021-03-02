package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver2.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//Launch site
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_elem_input");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
	    List<WebElement>	f=driver.findElements(By.xpath("//input[@id='fname']"));
		driver.switchTo().defaultContent();
		System.out.println("total number"+f.size());

	}

}
