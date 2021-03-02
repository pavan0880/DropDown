package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Test10
{
	public static void main(String[] args) 
	{
		// Get browser name from keyboard
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn=SC.nextLine();
		//Cross browser
		WebDriver driver=null;
		if(bn.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\Pavan Sekhar\\chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOutput","true");
			//To hide browser logs 
			driver=new ChromeDriver();
		}
		else if(bn.equalsIgnoreCase("fire fox"))
		{
			System.setProperty("webdriver.gecko.driven", "G:\\Pavan Sekhar\\geckodriver.exe");
			//to send browser logs to seperate file 
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"G:\\sample.txt");
			driver=new FirefoxDriver();
		}
		else if(bn.equalsIgnoreCase("opera"))
		{
			System.setProperty("webdriver.opera.driverr","G:\\Pavan Sekhar\\OperaSetup.exe");
			OperaOptions oo=new OperaOptions();
			oo.setBinary("C:\\Users\\sekha\\AppData\\Local\\Programs\\Opera\\launcher.exe");
			driver=new OperaDriver(oo);
		
			
			
			
			
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		
		
		
			
		
			
		}
			
		
		
		

	}

}
