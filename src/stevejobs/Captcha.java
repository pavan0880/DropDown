package stevejobs;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Captcha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.in.ckgs.us/myaccount");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().refresh();
		//prompting user to enter captcha			
		String captchaVal = JOptionPane.showInputDialog("Please enter the captcha value:");
		//Type the entered captcha to the text box
driver.findElement(By.id("recaptcha_response_field")).sendKeys(captchaVal);	

	}

}
