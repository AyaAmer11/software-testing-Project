
@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
  Given user go to login page
    When user login with "test@example.com" and "P@ssw0rd"
  And user press on login button
  Then user login to the system successfully
    And user should be redirected to the home page
    And the "My account" tab should be displayed


  Scenario: User could login with invalid email and password
    Given user is on the login page
    When user login with "wrong@example.com" and "P@ssw0rd"
   And user presses the login button
  Then user should not be able to login to the system

    And the error message should contain "Login was unsuccessful."
    And the color of the error message should be "rgba(228, 67, 75, 1)"

