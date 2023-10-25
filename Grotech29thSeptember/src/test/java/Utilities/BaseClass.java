package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CONSTANTS.constants;

public class BaseClass {
	
	
	
	public static WebDriver driver;
	
	public static WebDriver InitializeDriver()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.get(GetDataFromExcel.getURL());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
	}
	
	public static void takescreenshot() throws IOException
	{
		TakesScreenshot Srcshot=(TakesScreenshot)driver;
		File SrcFile=Srcshot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(constants.SCREENSHOTPATH);
		FileUtils.copyFile(SrcFile, DestFile);
		
		
	}
	
	public void ScrollDown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("windows.scrollBy(0,500)","");
	}
	
	public void addImplicitwait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	
	
	
	
	
	
	

}
