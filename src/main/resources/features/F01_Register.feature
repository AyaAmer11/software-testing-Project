@smoke
  Feature: F01_Register | User can create new Account
    Scenario: Successful registration
    Given I am on the registration page
   When I enter my first name as "automation"
     And I enter my last name as "tester"
    And I select "Female" as my gender
      When I select my date of birth as "14" day, "December" month, and "2020" year
      Then I verify that my selected date of birth is displayed correctly
    And I enter my email as "test1234@test.com"
 And I enter my company name as "Test Company"
 And I enter my password as "password"
 And I confirm my password as "password"
      When I click the register button
  Then I should see the success message and its color
