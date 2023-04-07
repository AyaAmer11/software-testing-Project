package org.example.stepDefs;

import org.example.pages.P03_homePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
public class D08_WishlistStepDef {

    P03_homePage homePage = new P03_homePage();

    @Given("user is on homepage0")
    public void user_is_on_homepage() {
        homePage.open();
    }

    @When("user adds {string} to wishlist")
    public void user_adds_to_wishlist(String productName) {
        homePage.addToWishlist(productName);
    }

    @Then("success message {string} with green background color is displayed")
    public void success_message_with_green_background_color_is_displayed(String expectedMessage) {
        Assert.assertTrue(homePage.isSuccessMessageDisplayed());
        Assert.assertTrue(homePage.getSuccessMessage().contains(expectedMessage));
        Assert.assertEquals("rgba(75, 176, 122, 1)", homePage.getSuccessMessageBackgroundColor());

    }


    @Given("I am on the home page00")
    public void i_am_on_the_home_page() {
        homePage.navigateToHomePage();
    }



    @When("^I click on wishlist button for HTC One M8 Android L 5.0 Lollipop product$")
    public void i_click_on_wishlist_button_for_HTC_One_M8_Android_L_5_0_Lollipop_product() {
        homePage.clickOnWishlistButton();
    }

    @Then("^I should see the success message with green color disappear$")
    public void i_should_see_the_success_message_with_green_color_disappear() throws InterruptedException {
        try {
            WebElement successMsg = Hooks.driver.findElement(By.cssSelector("#bar-notification > div"));
            Assert.assertTrue(successMsg.isDisplayed());
            Thread.sleep(5000); // wait for the message to disappear
            Assert.assertFalse(successMsg.isDisplayed());
        } catch (StaleElementReferenceException e) {
// Locate the element again
            WebElement successMsg = Hooks.driver.findElement(By.cssSelector("#bar-notification"));
            Assert.assertFalse(successMsg.isDisplayed());
        }
    }

    @When("^I click on Wishlist Tab$")
    public void i_click_on_Wishlist_Tab() {
       Hooks. driver.findElement(By.linkText("Wishlist")).click();
    }

    @Then("^I should see the Qty value bigger than 0$")
    public void i_should_see_the_Qty_value_bigger_than_0() {
        String qty = homePage.getCartQty();
        int actualQty = Integer.parseInt(qty);
        Assert.assertTrue(actualQty > 0);
    }

    @Then("^I close the browser$")
    public void i_close_the_browser() {
        Hooks.driver.quit();
    }














}


