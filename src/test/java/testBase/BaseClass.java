package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;// Logger

public class BaseClass 
{
	public WebDriver driver;
	public Logger logger;
	
	@BeforeClass
	public void setup()
	{
		logger=LogManager.getLogger(this.getClass());
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	
	public String randomString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomnumber()
	{
		String generatednumber=RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
	
	public String Alphanumeric()
	{
		String st=RandomStringUtils.randomAlphabetic(3);
		String nm=RandomStringUtils.randomNumeric(3);
		return (st+nm);	
	}
	
	

}
