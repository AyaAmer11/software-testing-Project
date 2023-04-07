package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

    public class D03_currenciesStepDef {
       P03_homePage homePage = new P03_homePage();

        @Given("I am on the home page1")
        public void i_am_on_the_home_page() {
            homePage.navigateToHomePage();
        }

        @When("I select Euro currency from the dropdown list")
        public void i_select_euro_currency_from_the_dropdown_list() {
            homePage.selectCurrency("Euro");
        }

        @Then("Euro symbol \\(€) should be shown for all products displayed")
        public void euro_symbol_should_be_shown_for_all_products_displayed() {
            List<WebElement> productPrices = homePage.getProductPrices();
            for (WebElement productPrice : productPrices) {
                String priceText = productPrice.getText();
                Assert.assertTrue(priceText.contains("€"), "Euro symbol is not shown for product price: " + priceText);
            }
        }


    }


