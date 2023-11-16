package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage 
{
   public MyAccountPage(WebDriver driver) 
	{
		super(driver);
	}
   
   //Elements
   
   @FindBy(id="input-firstname")
   WebElement txtfirstname;
   
   @FindBy(id="input-lastname")
   WebElement txtlastname;
   
   @FindBy(id="input-email")
   WebElement txtemail;
   
   @FindBy(id="input-password")
   WebElement txtpassword;
   
   @FindBy(xpath="//input[@name='agree']")
   WebElement agreecheckbox;
   
   @FindBy(xpath="//button[@class='btn btn-primary']")
   WebElement buttonsubmit;
   
   @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
   WebElement conformmesseage;
   
  
   
   
   //Action Methods
   
   public  void setFirstName(String Fname)
   {
	   txtfirstname.sendKeys(Fname);
   }
   
   public  void setLastNamename(String Lname)
   {
	   txtlastname.sendKeys(Lname);
   }
   
   public  void setemail(String email)
   {
	   txtemail.sendKeys(email);
   }
   
   public  void setPassword(String Pword)
   {
	   txtpassword.sendKeys(Pword);
   }
   
   
   public void clickCheckBox() 
   {   
	   agreecheckbox.click();
   }
   
   public void clickSubmit() 
   {
	 
	   buttonsubmit.click();
   }
   
   public String getconfmsg()
   {
	   try {
	   return conformmesseage.getText();
	   }
	   catch(Exception e)
	   {
		   return(e.getMessage());
	   }
   }
   
   
   
   
   
   
   
   
   
   

}
