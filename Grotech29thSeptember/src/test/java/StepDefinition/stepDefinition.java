package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageFactory.CreateCustomerPage;
import PageFactory.LoginPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition extends BaseClass {
	
	WebDriver driver=BaseClass.InitializeDriver();
	LoginPage obj=new LoginPage(driver);
	CreateCustomerPage obj1=new CreateCustomerPage(driver);
	
	
	
	@Given("User Opens the Application")
	public void user_opens_the_application() {
		System.out.println("Application Launched in chrome");
		
	    
	}
	
	
	

	@Given("User enter the {string}")
	public void user_enter_the(String username) {
		
		obj.enterUserId(username);
		
		
	   
	}

	@Given("User will enter the {string}")
	public void user_will_enter_the(String password) {
		
		obj.enterPassword(password);
	}

	@When("User will click on the submit button")
	public void user_will_click_on_the_submit_button() {
	    
	}

	@Then("User will be navigated to the homepage")
	public void user_will_be_navigated_to_the_homepage() 
	{
		obj.clickOnSubmit();
		try {
			takescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	
	@Given("user will click on New_Customer_link")
	public void user_will_click_on_new_customer_link() {
	   
		obj1.clickNewCustomerlink();
		ScrollDown();
		
	}
	

	
	@Given("User will enter the customername as {string}")
	public void user_will_enter_the_customername_as(String customer_name) 
	
	{
	    obj1.addCustomername(customer_name);
		
	}

	@Then("user will select gender")
	public void user_will_select_gender() 
	{
	    obj1.selectGender();
		
	}

	@Then("User will enter the Date of birth as {string}")
	public void user_will_enter_the_date_of_birth_as(String date_of_birth) 
	{
	   obj1.enterDateOfBirth(date_of_birth);
		
	}
	
	
	@Then("User will enter the address as {string}")
	public void user_will_enter_the_address_as(String address) 
	{
		obj1.addAddress(address);
	}

	@Then("User will enter the value of city as {string}")
	public void user_will_enter_the_value_of_city_as(String city) {
	    
		obj1.addCity(city);
		
	}

	@Then("User will enter the value of state as {string}")
	public void user_will_enter_the_value_of_state_as(String state) {
		
		obj1.addState(state);
	   
	}

	@Then("User will enter the value of PINCODE as {string}")
	public void user_will_enter_the_value_of_pincode_as(String pincode) {
		
		obj1.addPin(pincode);
	    
	}
	
	@Then("User will enter the value of MobileNumber as {string}")
	public void user_will_enter_the_value_of_mobile_number_as(String mobile_no) {
	 
		obj1.addMobile(mobile_no);
		
	}
	

	@Then("User will enter the value of email as {string}")
	public void user_will_enter_the_value_of_email_as(String Email_id) {
		
		obj1.addEmail(Email_id);
	    
	}

	@Then("User will enter the value of password as {string}")
	public void user_will_enter_the_value_of_password_as(String password) {
		
		obj1.addPassword(password);
	    
	}
	
	@Then("then the  User will click on the submit button in the form")
	public void then_the_user_will_click_on_the_submit_button_in_the_form() {
	    
		obj1.clickonSubmit();
		
	}
	
	@Then("User will get the Customer Id from the page")
	public void user_will_get_the_customer_id_from_the_page() {
	    obj1.GetCustomerId();
	}






	
	
	

}
