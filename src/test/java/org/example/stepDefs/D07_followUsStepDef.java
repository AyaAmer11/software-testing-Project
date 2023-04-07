package org.example.stepDefs;
import org.example.pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.testng.Assert;
import java.util.List;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class D07_followUsStepDef {

    P03_homePage homePage = new P03_homePage();
        @Given("I am on the NopCommerce homepage")
        public void iAmOnTheNopCommerceHomepage() {

        }

        @When("I click on the Facebook icon")
        public void iClickOnTheFacebookIcon() {
            homePage.clickFacebookIcon();
            homePage.switchToNewTab();
        }

        @Then("a new tab should open with the Facebook page")
        public void aNewTabShouldOpenWithTheFacebookPage() {
            Assert.assertTrue(homePage.isFacebookPageDisplayed());
        }

    @Then("the URL of the new tab should be {string} version 1")
    public void theURLOfTheNewTabShouldBe1(String expectedUrl) {
        // implementation here
    }
    @Given("I am on the NopCommerce homepage1")
    public void iAmOnTheHomepage() {

    }

    @When("I click on the Twitter icon")
    public void iClickOnTheTwitterIcon() {
        homePage.clickTwitterIcon();
        homePage.switchToNewTab();
    }

    @Then("a new tab should open with the Twitter page")
    public void aNewTabShouldOpenWithTheTwitterPage() {
        Assert.assertTrue(homePage.isTwitterPageDisplayed());
    }


    @Then("the URL of the new tab should be {string} version 2")
    public void theURLOfTheNewTabShouldBe2(String expectedUrl) {
        // implementation here
    }
    @Given("I am on the homepage2")
    public void iAmOnTheHomepage2() {

    }

    @When("I click on the rss link")
    public void iClickOnTheRssLink() {
        homePage.clickRssLink();
        homePage.switchToNewTab();
    }

    @Then("a new tab should open with the rss page")
    public void aNewTabShouldOpenWithTheRssPage() {
        Assert.assertTrue(homePage.isNewTabOpened());
    }
    @Then("the URL of the new tab should be {string} version 3")
    public void theURLOfTheNewTabShouldBe3(String expectedUrl) {
        // implementation here
    }


    @And("^the URL of the new tab should be \"([^\"]*)\"$")
    public void theURLOfTheNewTabShouldBe(String expectedUrl) {
        // Get the list of open tabs
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());

        // Verify that there is more than one tab open
        if (tabs.size() < 2) {
            throw new AssertionError("Expected to switch to a new tab, but only one tab is open.");
        }

        // Switch to the second tab
        Hooks.driver.switchTo().window(tabs.get(1));

        // Verify the URL of the second tab
        assertEquals(expectedUrl, Hooks.driver.getCurrentUrl());
    }

    @Given("I am on the NopCommerce homepage3")
    public void iAmOnTheHomepage3() {
// implementation here
    }

    @When("I click on the YouTube icon")
    public void iClickOnTheYouTubeIcon() {
        homePage.clickYouTubeIcon();
        homePage.switchToNewTab();
    }

    @Then("a new tab should open with nopCommerce's YouTube channel")
    public void aNewTabShouldOpenWithTheYouTubeChannel() {
        Assert.assertTrue(homePage.isYouTubeChannelDisplayed());
    }

    @Then("the URL of the new tab should be {string} version 4")
    public void theURLOfTheNewTabShouldBe4(String expectedUrl) {
        homePage.verifyYouTubeChannelUrl(expectedUrl);
    }



}




