package stevejobs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DDT {

	public static void main(String[] args) throws Exception {
		// //Open text file for test data reading
		File f1=new File("G:\\TEST RESUT");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		//Open other file for results writing
		File f2=new File("G:\\TEST RESUT");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		//Create date format and date objects
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		Date dt=new Date(0);
		//DDT using text file data
		WebDriver driver=null;
		String line;
		while((line=br.readLine())!=null)
		{
			String[] pieces=line.split(",");
			String bn=pieces[0];
			String uid=pieces[1];
			String uidcriteria=pieces[2];
			String pwd=pieces[3];
			String pwdcriteria=pieces[4];
			try    //Need to continue all iterations by handling exceptions if raised
			{
				//Browser specific code
				if(bn.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","G:\\Pavan Sekhar\\New folder\\chromedriver.exe");
					driver=new ChromeDriver();
				}
				else if(bn.equalsIgnoreCase("firefox"))
				{
					System.setProperty("webdriver.gecko.driver","E:\\batch246\\geckodriver.exe");
					driver=new FirefoxDriver();
				}
				else if(bn.equalsIgnoreCase("opera"))
				{
					System.setProperty("webdriver.opera.driver",
							                   "E:\\batch246\\operadriver_win64\\operadriver.exe");
					driver=new OperaDriver();
				}
				else if(bn.equalsIgnoreCase("edge"))
				{
					EdgeOptions eo=new EdgeOptions();
					eo.setBinary("C:\\Program Files (x86)\\microsoft\\Edge Beta\\Application\\msedge.exe");
					System.setProperty("webdriver.edge.driver","E:\\batch246\\msedgedriver.exe");
					driver=new EdgeDriver(eo);
				}
				else
				{
					//Set "ie" browser zoom level to exact 100% manually
					System.setProperty("webdriver.ie.driver","E:\\batch246\\iedriverserver.exe");
					driver=new InternetExplorerDriver();
				}
				//common code
				driver.manage().window().maximize();
				driver.get("https://www.gmail.com");
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
				driver.findElement(By.name("identifier")).sendKeys(uid);
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(5000); //Fixed wait before going to validations
				//User-id Validations
				if(uidcriteria.equalsIgnoreCase("blank") && 
					driver.findElement(By.xpath("(//*[contains(text(),'Enter an email')])[2]"))
					                                                            .isDisplayed())
				{
					bw.write("Login test passed for blank userid");
					bw.newLine();
				}
				else if(uidcriteria.equalsIgnoreCase("invalid") && driver.findElement(By.xpath(       
					"((//*[contains(text(),'find your Google Account')])[2])|((//*[contains(text(),'Enter a valid email')])[2])")).isDisplayed())
				{
					bw.write("Login test passed for invalid userid");
					bw.newLine();
				}
				else if(uidcriteria.equalsIgnoreCase("valid") && 
					                         driver.findElement(By.name("password")).isDisplayed())
				{
					//Enter Password and perform password validations
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
					driver.findElement(By.name("password")).sendKeys(pwd);
					driver.findElement(By.xpath("//span[text()='Next']")).click();
					Thread.sleep(5000);//Fixed wait before going to validations
					if(pwdcriteria.equalsIgnoreCase("blank") && 
						driver.findElement(By.xpath("//*[text()='Enter a password']")).isDisplayed())
					{
						bw.write("Login test passed for blank password");
						bw.newLine();
					}
					else if(pwdcriteria.equalsIgnoreCase("invalid") && 
						driver.findElement(By.xpath("//*[contains(text(),'Wrong password')]"))
						                                                       .isDisplayed())
					{
						bw.write("Login test passed for invalid pasword");
						bw.newLine();
					}
					else if(pwdcriteria.equalsIgnoreCase("valid") && 
						driver.findElement(By.xpath("//*[text()='Compose']")).isDisplayed())
					{
						bw.write("Login test passed for valid userid and password");
						bw.newLine();
					}
					else
					{
						//Get Screenshot and attach to extent reports
						String ssname=sf.format(dt)+".png";
						File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						File dest=new File(ssname);
						FileHandler.copy(src,dest);
						bw.write("Gmail Password test failed"+dest.getAbsolutePath());
						bw.newLine();
					}
				}
				else
				{
					//Get Screenshot and attach to extent reports
					String ssname=sf.format(dt)+".png";
					File src=
						((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					File dest=new File(ssname);
					FileHandler.copy(src,dest);
					bw.write("Gmail Userid test failed"+dest.getAbsolutePath());
					bw.newLine();
				}
			}
			catch(Exception ex)
			{
				//Get Screenshot and attach to extent reports
				String ssname=sf.format(dt)+".png";
				File src=
					((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File(ssname);
				FileHandler.copy(src,dest);
				bw.write(ex.getMessage()+dest.getAbsolutePath());
			}
			finally
			{
				//Close site
				driver.close();
			}
		} //while loop ending
		//Save and close results file
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}



		

	}


