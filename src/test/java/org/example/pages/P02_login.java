package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefs.Hooks;
public class P02_login {


    public By emailField = By.id("Email");
    public By passwordField = By.id("Password");
    public By loginButton = By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button");
    public By myAccountTab = By.xpath("/html/body/div[6]/div[4]/div[1]/div[3]/div/strong");
    public By errorMessage = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]");
    public void navigateToLoginPage() {
       Hooks. driver.get("https://demo.nopcommerce.com/login");
    }

    public void enterEmail(String email) {
        Hooks.  driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        Hooks.driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        Hooks.driver.findElement(loginButton).click();
    }

    public boolean isUserLoggedIn() {
        return   Hooks.driver.findElement(myAccountTab).isDisplayed();
    }

    public boolean isMyAccountTabDisplayed() {
        return Hooks. driver.findElement(myAccountTab).isDisplayed();
    }
    public void loginWithValidCredentials(String email, String password) {
        WebElement emailFieldElement = Hooks.driver.findElement(By.id("emailField"));
        emailFieldElement.sendKeys(email);

        WebElement passwordFieldElement = Hooks.driver.findElement(By.id("passwordField"));
        passwordFieldElement.sendKeys(password);
    }


    public void loginWithInvalidCredentials(String email, String password) {
        WebElement emailElement = Hooks.driver.findElement(By.cssSelector("#Email"));
        emailElement.sendKeys(email);
        WebElement passwordElement = Hooks.driver.findElement(By.cssSelector("#Password"));
        passwordElement.sendKeys(password);

    }

    public void clickLoginButton1() {
        WebElement LoginButton =Hooks. driver.findElement(loginButton);
        LoginButton.click();
    }


    public boolean isLoggedIn() {
        return Hooks. driver.getCurrentUrl().contains("dashboard");
    }

    public String getErrorMessage() {
        WebElement errorElement = Hooks. driver.findElement(errorMessage);
        return errorElement.getText();
    }

    public String getErrorMessageColor() {
        WebElement errorElement = Hooks.driver.findElement(errorMessage);
        return errorElement.getCssValue("color");
    }



}
