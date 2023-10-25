package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomerPage {
	
	WebDriver driver;
	public CreateCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='addcustomerpage.php']")
	WebElement New_Customer_link;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement Customer_name;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement Gender;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement date_Of_birth;
	
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	

	@FindBy(xpath="//input[@name='state']")
	WebElement State;
	
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement PinNo;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement MobileNo;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement EmailId;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement btn_Submit;
	
	@FindBy(xpath="//table[@id='customer']//tr[4]//td[2]")
	WebElement GetCustomerId;
	
	

	public void clickNewCustomerlink()
	{
		New_Customer_link.click();
	}
	
	public void addCustomername(String text)
	{
		Customer_name.sendKeys(text);
	}
	
	public void selectGender()
	{
		Gender.click();
	}
	
	public void enterDateOfBirth(String text2)
	{
		date_Of_birth.sendKeys(text2);
	}
	
	public void addAddress(String text3)
	{
		address.sendKeys(text3);
	}
	
	public void addCity(String text4)
	{
		City.sendKeys(text4);
	}
	
	public void addState(String text5)
	{
		State.sendKeys(text5);
	}
	
	
	public void addPin(String text6)
	{
		PinNo.sendKeys(text6);
	}
	
	public void addMobile(String text7)
	{
		MobileNo.sendKeys(text7);
	}
	
	public void addEmail(String text8)
	{
		EmailId.sendKeys(text8);
	}
	
	public void addPassword(String text9)
	{
		password.sendKeys(text9);
	}
	
	public void clickonSubmit()
	{
		btn_Submit.click();
	}
	
	public void GetCustomerId()
	{
		String text=GetCustomerId.getText();
		System.out.println(text);
	}
	

}
