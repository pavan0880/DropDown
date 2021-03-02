package stevejobs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vrbo.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handle=driver.getWindowHandles();
		ArrayList <String> arr=new ArrayList<String>(handle);
		driver.switchTo().window(arr.get(0));
		Thread.sleep(2000);
		driver.close();

	}

}
