package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws Exception 
	{
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver",
				                      "G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.goindigo.in");
		Thread.sleep(5000);
		//Select a radio button 
		driver.findElement(By.xpath("//*[@for='roundTrip']")).click();
		//Get details of radio button (Pseudo element ::before )
		driver.executeScript("var x=window.getComputedstyle(document.queryselector('lable[for=roundTrip]'),'::before').setPropertyValue('border-colour');return(x);");
		//close site 
		driver.close();
		
		
		
		
				

	}

}
