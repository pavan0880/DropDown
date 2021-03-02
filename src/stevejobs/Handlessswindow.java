package stevejobs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlessswindow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		String parrent= driver.getWindowHandle();
		System.out.println("parrent window id id :"+parrent);
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		Set<String> allwindoows=driver.getWindowHandles();
		int count=allwindoows.size();
		System.out.println("total window "+count);
		for(String child1:allwindoows) {
		if(!parrent.equalsIgnoreCase(child1)) {
		driver.switchTo().window(child1);
		String url=driver.getCurrentUrl();
		System.out.println("url of child is :" +url);
		}
		}
		driver.switchTo().window(parrent);
		Thread.sleep(2000);
		String parrenturl=driver.getCurrentUrl();
		System.out.println("parrent url is "+parrenturl);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		for(String child2:allwindoows) {
		if(!parrent.equalsIgnoreCase(child2)) {
		driver.switchTo().window(child2);
		String child2url=driver.getCurrentUrl();
		System.out.println("child2 current url is :"+child2url);
		Thread.sleep(2000);
		}
		}
		driver.switchTo().window(parrent);
		Thread.sleep(2000);
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(2000);
		for(String child3:allwindoows) {
		if(!parrent.equalsIgnoreCase(child3)) {
		driver.switchTo().window(child3);
		String child3url=driver.getCurrentUrl();
		System.out.println("child3 current url is :"+child3url);
		Thread.sleep(2000);
		}
		}
		driver.quit();
		

	}

}
