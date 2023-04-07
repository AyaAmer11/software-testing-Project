package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.*;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;
    public class RegisterAction {

        RegisterPO registerPO ;

        public RegisterAction() {


            registerPO= new RegisterPO() ;
        }
        public void navigateToRegisterPage(){
            Hooks.driver.findElement(By.className("ico-register")).click();
        }


        public void sendFirstName(String name) {
            Hooks.driver.findElement(registerPO.FirstNameTextfeild).sendKeys(name);
        }

        public String getFirstNameTextfeild() {

            String Name = Hooks.driver.findElement(registerPO.FirstNameTextfeild).getAttribute("value");
            return Name;
        }

        public void sendLastName(String lastName) {
          Hooks.  driver.findElement(registerPO.lastNametextfeild).sendKeys(lastName);
        }

        public String getlastNametextfeild() {
            return Hooks.driver.findElement(registerPO.lastNametextfeild).getAttribute("value");
        }
        public void selectGenderFemale() {
            Hooks.driver.findElement(registerPO.genderFemaleLocator).click();
        }

        public boolean getgenderFemaleLocator(){
            boolean Gender = Hooks.driver.findElement(registerPO.genderFemaleLocator).isSelected();
            return Gender;
        }

        public void selectDateOfBirth(String day, String month, String year) {
          Hooks.driver.findElement(registerPO.DateOfBirthDayDropDown).sendKeys(day);
        Hooks. driver.findElement(registerPO.DateOfBirthMonthDropDown).sendKeys(month);
        Hooks. driver.findElement(registerPO.DateOfBirthYearDropDown).sendKeys(year);
        }

        public String getSelectedDateOfBirth() {
            return Hooks. driver.findElement(registerPO.DateOfBirthDayDropDown).getAttribute("value")
                    + "-" +Hooks. driver.findElement(registerPO.DateOfBirthMonthDropDown).getAttribute("value")
                    + "-" + Hooks.driver.findElement(registerPO.DateOfBirthYearDropDown).getAttribute("value");
        }


        public void sendEmail(String email) {
    Hooks.driver.findElement(registerPO.emailFieldregister1).sendKeys(email);
}

        public String getemailFieldregister1() {
            return Hooks.driver.findElement(registerPO.emailFieldregister1).getAttribute("value");
        }


        //
//
        public void sendCompanyName(String companyName) {
          Hooks.  driver.findElement(registerPO.companynamefeild).sendKeys(companyName);
        }

        public String getcompanynamefeild() {
            return Hooks.driver.findElement(registerPO.companynamefeild).getAttribute("value");
        }


        public void sendPassword(String password) {
            Hooks.driver.findElement(registerPO.passwordField).sendKeys(password);
        }

        public WebElement getPasswordField() {
            return Hooks. driver.findElement(registerPO.passwordField);
        }

        public void sendConfirmPassword(String confirmPassword) {
          Hooks.  driver.findElement(registerPO.confirmPasswordField).sendKeys(confirmPassword);
        }

        public WebElement getConfirmPasswordField() {
            return Hooks.driver.findElement(registerPO.confirmPasswordField);
        }


        public void clickRegisterButton1() {
            Hooks.driver.findElement(registerPO.registerButton).click();
        }

        public WebElement getRegisterButton() {
            return Hooks.driver.findElement(registerPO.registerButton);
        }

        public static void verifySuccessMessage() {
            WebElement successMessage = Hooks.driver.findElement(By.className("result"));
            String actualMessage = successMessage.getText();
            SoftAssert softAssertion= new SoftAssert();
            softAssertion.assertEquals(actualMessage, "Your registration completed", "Success message is not displayed");

            String color = successMessage.getCssValue("color");
            String[] rgba = color.replace("rgba(", "").replace(")", "").split(",");
            int r = Integer.parseInt(rgba[0].trim());
            int g = Integer.parseInt(rgba[1].trim());
            int b = Integer.parseInt(rgba[2].trim());
            softAssertion.assertEquals(r, 76, "Red color value is not as expected");
            softAssertion.assertEquals(g, 177, "Green color value is not as expected");
            softAssertion.assertEquals(b, 124, "Blue color value is not as expected");
            softAssertion.assertAll("Success message color is not as expected");
        }
    }










