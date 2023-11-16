package testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
	
	
	@Test
	public void test_accountregistration()
	{
		logger.debug("Application logs");
		logger.info("**** Starting TC_001_AccountRegistrationTest **** ");
		try {
		HomePage hp=new HomePage(driver);
		MyAccountPage map=new MyAccountPage(driver);
		
		
	
		hp.clickmyaccount();
		logger.info("Clicked on My Account");
		
		hp.clickregister();
		logger.info("Clicked on Register");
		
	
		logger.info("Providing customers data");
		map.setFirstName(randomString().toUpperCase());
		map.setLastNamename(randomString().toUpperCase());
		map.setemail(randomString()+"@gmail.com");
		
		map.setPassword("vk123");
		
	
		map.clickCheckBox();
		map.clickSubmit();
		logger.info("Clicked on Submit");
		String msg=map.getconfmsg();
		
		logger.info("Validating expected messeage");

		Assert.assertEquals(msg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			logger.error("Test failed");
			Assert.fail();
		}
		
		logger.error("finished login test");
		
		
		
		
		
		
		
		
	}

}
