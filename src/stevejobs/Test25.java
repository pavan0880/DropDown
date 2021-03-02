package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test25 
{
	public static void main(String[] args) throws Exception 
	{
		//Open Chrome Browser 
		System.setProperty("webdriver.chrome.driver","G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("htttps://www.xe.co.in");
		Thread.sleep(5000);
		//Get current URL of current page 
		String x=driver.getCurrentUrl();
		if(x.contains("https"));
		{
			System.out.println("xe site is secured");
		}
		//else
		{
			System.out.println("xe site is unsecure");
		}
			
	
			
		
		
		

	}

}
