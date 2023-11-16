package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

	public HomePage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	
	// Elements
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[2]")
	WebElement lnkAccount;
	
	@FindBy(xpath="(//a[(text()='Register')])[1]")
	WebElement lnkRegister;
	
	//Action Methods
	
	public void clickmyaccount()
	{
		lnkAccount.click();
	}
	
	public void clickregister()
	{
		lnkRegister.click();
	}

}
