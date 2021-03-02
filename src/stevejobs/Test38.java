package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test38 {

	public static void main(String[] args) throws Exception {
		// Open Chrome Browser 
		System.setProperty("webdriver.chrome.driver", "G:\\\\Pavan Sekhar\\\\New folder\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch Sun Techno Web Site
		driver.get("https://www.suntechnoservices.com:2096/");
		Thread.sleep(5000);
		//Go to VRBO Web Site
		driver.navigate().to("https://www.vrbo.com/");
		Thread.sleep(5000);
		//Back to Web Mail Sun Techno
		driver.navigate().back();
		Thread.sleep(5000);
		//Forward to VRBO Site 
		driver.navigate().forward();
		Thread.sleep(5000);
		//Refresh Gmail
		driver.navigate().refresh();
		Thread.sleep(5000);
		//Close Site
		driver.close();

	}

}
