package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


    public class RegisterPO {

        public By FirstNameTextfeild = By.name("FirstName");
        public By lastNametextfeild = By.name("LastName");
        public By genderFemaleLocator = By.id("gender-female");
        public By DateOfBirthDayDropDown = By.name("DateOfBirthDay");
        public By DateOfBirthMonthDropDown = By.name("DateOfBirthMonth");
        public By DateOfBirthYearDropDown = By.name("DateOfBirthYear");

        public By emailFieldregister1 = By.id("Email");
        public By companynamefeild = By.id("Company");

        public By passwordField = By.id("Password");
        public By confirmPasswordField = By.id("ConfirmPassword");
        public By registerButton = By.id("register-button");

//        private WebDriver driver;
//        private By errorMessage = By.id("error-message");
//        private By successMessage = By.className("result");
//
//        public boolean isErrorMessageDisplayed() {
//            WebElement errorElement = driver.findElement(errorMessage);
//            return errorElement.isDisplayed();
//        }
//
//        public String getErrorMessageText() {
//            WebElement errorElement = driver.findElement(errorMessage);
//            return errorElement.getText();
//        }
//
//        public String getRegistrationSuccessMessage() {
//            WebElement successElement = driver.findElement(successMessage);
//            return successElement.getText();
//        }
//
//
//
//        public void enterRegistrationDetails(String firstName, String lastName, String email, String company, String password, String confirmPassword) {
//            driver.findElement(FirstNameTextfeild).sendKeys(firstName);
//            driver.findElement(lastNametextfeild).sendKeys(lastName);
//            driver.findElement(emailFieldregister1).sendKeys(email);
//            driver.findElement(companynamefeild).sendKeys(company);
//            driver.findElement(passwordField).sendKeys(password);
//            driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
//        }
//
//        public void verifyRegistrationSuccess() {
//            String actualMessage = getRegistrationSuccessMessage();
//            String expectedMessage = "Your registration completed";
//            Assert.assertEquals(actualMessage, expectedMessage, "Registration not successful");
//            WebElement firstNameField = driver.findElement(FirstNameTextfeild);
//            Assert.assertNotNull(firstNameField.getAttribute("value"), "First name text field is empty");
//        }
  }








