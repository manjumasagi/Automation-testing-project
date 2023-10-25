package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPage extends BaseClass {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement userid;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement btn_login;
	
	
	public void enterUserId(String text)
	{
		userid.sendKeys(text);
	}
	
	public void enterPassword(String text1)
	{
		password.sendKeys(text1);
	}
	
	public void clickOnSubmit()
	{
		btn_login.submit();
	}
	
	
	
	
	
	

}
