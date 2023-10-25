@regression
Feature: Create a Customer with all the details

  Background: 
    Given User Opens the Application
    And User enter the "mngr530983"
    And User will enter the "pEsaqUm"
    When User will click on the submit button
    Then User will be navigated to the homepage

  Scenario Outline: Creating a new customer with all details
    Given user will click on New_Customer_link
    And User will enter the customername as "<customer_name>"
    Then user will select gender
    And User will enter the Date of birth as "<date_of_birth>"
    Then User will enter the address as "<address>"
    And User will enter the value of city as "<city>"
    And User will enter the value of state as "<state>"
    And User will enter the value of PINCODE as "<pincode>"
    And User will enter the value of email as "<Email_id>"
    And User will enter the value of MobileNumber as "<mobile_no>"
    And User will enter the value of password as "<password>"

    # And then the  User will click on the submit button in the form
    # And User will get the Customer Id from the page
    Examples: 
      | customer_name | date_of_birth | address    | city    | state | pincode | Email_id             | password     | mobile_no  |
      | Rohan         | 03-06-1991    | Ballygunge | kolkata | WB    |  700044 | pturrtr123@gmail.com | mhgtest45678 | 9005679854 |
