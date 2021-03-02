package stevejobs;

import org.openqa.selenium.edge.EdgeDriver;

public class Test12
{
	public static void main(String[] args)
	{
		// open chrome browser
		System.setProperty("webdriver.edge.driver", "G:\\Pavan Sekhar\\MicrosoftWebDriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.google.com");
		
		
		

	}

}
