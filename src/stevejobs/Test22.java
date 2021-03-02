package stevejobs;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22 {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a skill");
		String x=sc.nextLine();
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver",
                "G:\\Pavan Sekhar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//Locate <div> tag multi-select drop-down
		WebElement dropdown=driver.findElement(
				By.xpath("//h4[text()='Multiple Selection']/following-sibling::div"));        
		//Open that multi-select drop down items list
		dropdown.click();
		Thread.sleep(5000);
		//Collect all items of that multi-select dropdown
		List<WebElement> allitems=dropdown.findElements(By.xpath("child::div[2]/div"));
		int flag=0;
		for(WebElement e:allitems)
		{
			if(e.getText().equalsIgnoreCase(x))
			{
				flag=1;
				e.click();
				Thread.sleep(5000);
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Item not found");
		}
		else
		{
			System.out.println("Item found");
		}
		//Close site
		driver.close();
	}

	}


