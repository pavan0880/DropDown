package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listvenue {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vrbo.com/");
		Thread.sleep(5000);
		driver.findElementByCssSelector("a[href*=\"https://www.vrbo.com/list?icid=IL___O_Text___top_nav_link_hp\"]").click();
		Thread.sleep(5000);
		WebElement buttonElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/button[2]"));
		int i;
		for(i=0;i<=5;i++) {
		buttonElement.click();
		}
		

}
}