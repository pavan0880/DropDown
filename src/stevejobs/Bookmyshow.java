package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\83.0\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// Launch the URL 
        driver.get("https://in.bookmyshow.com/kakinada");
        Thread.sleep(2000);
        driver.findElement(By.id("wzrk-cancel")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@href='/kakinada/movies']")).click();
        driver.executeScript("window.scrollTo(0,2100)");
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//a[@href='/static/list-your-show/'])[1]")).click();
	}

}
