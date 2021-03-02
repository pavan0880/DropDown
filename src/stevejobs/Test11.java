package stevejobs;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test11
{
	public static void main(String[] args) 
	{
		//open chrome browser 
		System.setProperty("webdriver.gecko.driver", "G:\\Pavan Sekhar\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
		

	}

}
