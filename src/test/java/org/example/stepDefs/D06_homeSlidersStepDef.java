package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;

public class D06_homeSlidersStepDef {

    P03_homePage homePage = new P03_homePage();

    @Given("^I am on the home page$")
    public void iAmOnHomePage() {
        // Code to navigate to the home page
    }

    @When("^I click on the first slider$")
    public void iClickOnFirstSlider() {
        homePage.clickOnFirstSlider();
    }

    @When("^I click on the second slider$")
    public void iClickOnSecondSlider() {
        homePage.clickOnSecondSlider();
    }

    @Then("^I should be redirected to \"([^\"]*)\"$")
    public void iShouldBeRedirectedTo(String expectedUrl) {
        homePage.verifyUrlContains(expectedUrl);
    }
}

