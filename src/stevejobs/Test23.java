package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 
{
public static void main(String[] args) throws Exception
	{
		// //Open chrome browser
		System.setProperty("webdriver.chrome.driver",
				                                "G:\\Pavan Sekhar\\chromedriver.exe");          
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//Launch flipkart site
		//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.MINUTES);
		//driver.manage().timeouts().setScriptTimeout(10,TimeUnit.MINUTES);
		driver.get("http://www.flipkart.com");
		Thread.sleep(5000);
		//Get size and position of browser window
		
		//Maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Full screen
		driver.manage().window().fullscreen();
		//Close site
		//driver.close();

	}

}
