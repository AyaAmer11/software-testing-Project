package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.example.pages.RegisterAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.Color;
public class D01_registerStepDef {

    private RegisterAction registerPage = new RegisterAction();

    @Given("I am on the registration page")
    public void navigateToRegister() {
        registerPage.navigateToRegisterPage();
    }


    @When("I enter my first name as {string}")
    public void iEnterMyFirstNameAs(String name) {
        registerPage.sendFirstName(name);
        Assert.assertEquals(registerPage.getFirstNameTextfeild(), name);
    }

    @And("I enter my last name as {string}")
    public void iEnterMyLastNameAs(String name) {
        registerPage.sendLastName(name);
        Assert.assertEquals(registerPage.getlastNametextfeild(), name);
    }

    @And("I select {string} as my gender")
    public void i_select_as_my_gender(String gender) {
        registerPage.selectGenderFemale();
        Assert.assertTrue(registerPage.getgenderFemaleLocator());
        Assert.assertEquals(gender, "Female");
    }

    @When("^I select my date of birth as \"([^\"]*)\" day, \"([^\"]*)\" month, and \"([^\"]*)\" year$")
    public void select_date_of_birth(String day, String month, String year) {
        registerPage.selectDateOfBirth(day, month, year);
    }

    @Then("^I verify that my selected date of birth is displayed correctly$")
    public void verify_selected_date_of_birth() {
        String SelectedDateOfBirth = registerPage.getSelectedDateOfBirth();
        // Perform assertion or validation on selectedDateOfBirth
    }


    @When("I enter my company name as {string}")
    public void i_enter_my_company_name_as(String companyName) {
        registerPage.sendCompanyName(companyName);

    }

    @Given("the user is on the registration page")
    public void user_is_on_registration_page() {
        // Navigate to the registration page
    }


    @And("the company name field should display {string}")
    public void the_company_name_field_should_display(String expectedCompanyName) {
        Assert.assertEquals(registerPage.getcompanynamefeild(), expectedCompanyName);
    }

    @When("I enter my email as {string}")
    public void i_enter_my_email_as(String email) {
        registerPage.sendEmail(email);
    }

    @And("the email should display {string}")
    public void the_email_should_display(String expectedEmail) {
        Assert.assertEquals(registerPage.getemailFieldregister1(), expectedEmail);
    }

    @When("I enter my password as {string}")
    public void i_enter_passwords_as(String passwords) {
        registerPage.sendPassword(passwords);
    }

    @And("the password should be written {string}")
    public void the_password_should_be_written_as(String expectedpassword) {
        Assert.assertEquals(registerPage.getPasswordField(), expectedpassword);
    }


    @And("I confirm my password as {string}")
        public void i_confirm_my_password(String expectedConfirmedPassword) {
            registerPage.sendConfirmPassword(expectedConfirmedPassword);
            String actualConfirmedPassword = registerPage.getConfirmPasswordField().getAttribute("value");
            Assert.assertEquals(actualConfirmedPassword, expectedConfirmedPassword);
        }




    @When("I click the register button")
    public void iClickTheRegisterButton() {
        registerPage.getRegisterButton().click();
    }

    @Given("I am on the registration confirmation page")
    public void i_am_on_registration_confirmation_page() {
        // Code to navigate to the registration confirmation page
    }

    @Then("I should see the success message and its color")
    public void i_should_see_the_success_message_and_its_color() {
       registerPage .verifySuccessMessage();
    }



    }



