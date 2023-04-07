package org.example.stepDefs;
import org.openqa.selenium.*;
import io.cucumber.java.en.*;
import org.example.pages.P02_login;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class D02_loginStepDef {


    P02_login    loginPage = new P02_login();



        @Given("user go to login page")
        public void navigateToLoginPage() {
            loginPage.navigateToLoginPage();
        }

        @When("user login with {string} and {string}")
        public void enterEmailAndPassword( String email, String password) {

                loginPage.enterEmail(email);
                loginPage.enterPassword(password);
            }


        @And("user press on login button")
        public void clickLoginButton() {
            loginPage.clickLoginButton();
        }

        @Then("user login to the system successfully")
        public void verifyUserLoggedIn() {
            assert(loginPage.isUserLoggedIn());
        }

    @Then("^user should be redirected to the home page$")
    public void user_should_be_redirected_to_the_home_page() {
        Assert.assertEquals("User is not redirected to the home page", "https://demo.nopcommerce.com/login",Hooks. driver.getCurrentUrl());
    }

    @Then("^the \"([^\"]*)\" tab should be displayed$")
    public void the_tab_should_be_displayed(String tabName) {
        Assert.assertTrue(tabName + " tab is not displayed", loginPage.isMyAccountTabDisplayed());
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.navigateToLoginPage();
    }

//    @When("user logs in with{string} and {string}")
//    public void user_logs_in_with( String email, String password) {
//            loginPage.loginWithValidCredentials(email, password);
//            loginPage.loginWithInvalidCredentials(email, password);
//        }

    @When("user logs in with {string} and {string}")
    public void user_logs_in_with( String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }
    @And("user presses the login button")
    public void user_presses_the_login_button() {
        loginPage.clickLoginButton1();
    }

    @Then("user should not be able to login to the system")
    public void user_should_not_be_able_to_login_to_the_system() {
        Assert.assertFalse(loginPage.isLoggedIn());
    }

    @And("the error message should contain {string}")
    public void the_error_message_should_contain(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.getErrorMessage();
        SoftAssert softAssertion= new SoftAssert();
        softAssertion.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
                "Expected error message: " + expectedErrorMessage + "\nActual error message: " + actualErrorMessage);
    }


    @And("the color of the error message should be {string}")
    public void the_color_of_the_error_message_should_be(String expectedColor) {
        String actualColor = loginPage.getErrorMessageColor();
        SoftAssert softAssertion= new SoftAssert();
        softAssertion.assertEquals(actualColor, expectedColor,
                "Expected error message color: " + expectedColor + "\nActual error message color: " + actualColor);
        softAssertion.assertAll();
    }

}
