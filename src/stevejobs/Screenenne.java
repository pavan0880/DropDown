package stevejobs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenenne {

	public static void main(String[] args) throws Exception {
		//Open chrome browser
				System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver2.exe");
				ChromeDriver driver=new ChromeDriver();
				//Launch site
				driver.get("http://www.gmail.com");
				Thread.sleep(5000);
				//Page screenshot
				File pagesrc=driver.getScreenshotAs(OutputType.FILE);
				File pagedest=new File("pagescreeshot.png");
				FileHandler.copy(pagesrc, pagedest);
				//Element screenshot
				File elesrc=driver.findElement(By.name("identifier")).getScreenshotAs(OutputType.FILE);
				File eledest=new File("elementscreenshot.png");
				FileHandler.copy(elesrc, eledest);
				//close site
				driver.close();
				
			
		


	}

}
