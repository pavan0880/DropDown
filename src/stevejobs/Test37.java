package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test37 {

	public static void main(String[] args) throws Exception {
		//open chrome browser 
		System.setProperty("webdriver.chrome.driver", "G:\\83.20 chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Open Sun Techno Web Mail 
		driver.get("https://www.suntechnoservices.com:2096/");
		//Enter mail ID
		driver.findElement(By.id("user")).sendKeys("p.pavan@suntechnoservices.com");
		Thread.sleep(5000);
		//Enter Password
		driver.findElement(By.id("pass")).sendKeys("Pavan@2020");
		//Login Web Mail
		driver.findElement(By.id("login_submit")).click();
		Thread.sleep(2000);
		//Fill Fileds
		//driver.findElement(By.id("lblUserNameTxt")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("lnkUserPrefhorde")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.id("lblUserNameTxt")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.id("lnkUserPrefroundcube")).clear();
		//Compose and attachment
		driver.findElement(By.id("rcmbtn108")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("_to")).sendKeys("hr@suntechnoservices.com");
		Thread.sleep(5000);
		driver.findElement(By.id("togglecc")).click();
		driver.findElement(By.xpath("//*[@id=\"sendcc\"]/td[2]/div/ul/li/input")).sendKeys("venkat.m@suntechnoservices.com");
		Thread.sleep(5000);
		driver.findElement(By.id("subject")).sendKeys("Work Reort 02-06-2020");
		driver.findElement(By.id("compose_upload_add")).click();
		Thread.sleep(5000);
		//Logout the Web Mail
		driver.findElement(By.id("lnkHeaderLogout")).click();
		//Close Site 
		driver.close();

	}

}
