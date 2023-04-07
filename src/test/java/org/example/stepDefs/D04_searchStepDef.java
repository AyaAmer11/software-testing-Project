package org.example.stepDefs;

import org.example.pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.testng.Assert;
import java.util.List;
import org.openqa.selenium.WebElement;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage();

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        homePage.navigateToHomePage();
    }

    @When("^user searches for \"(.*)\"$")
    public void user_searches_for(String searchValue) {
        homePage.searchForProduct(searchValue);
    }

    @When("^user searches for SKU \"(.*)\"$")
    public void user_searches_for_sku(String sku) {
        homePage.searchForProductBySku(sku);
    }

    @Then("^url contains \"(.*)\"$")
    public void url_contains(String expectedUrl) {
        Assert.assertTrue(homePage.getCurrentUrl().contains(expectedUrl));
    }

    @And("^search shows relevant results$")
    public void search_shows_relevant_results() {
        Assert.assertTrue(homePage.isSearchResultDisplayed());
    }

    @Then("^the count of search results is \"([^\"]*)\"$")
    public void count_number_of_search_results_is(String expectedCount) {
        int actualCount = homePage.getSearchResultsCount();
        Assert.assertEquals(Integer.parseInt(expectedCount), actualCount);
    }



    @And("^each result contains the search word \"(.*)\"$")
    public void each_result_contains_the_search_word(String searchWord) {

        List<WebElement> searchResults = homePage.getSearchResults();
        for (WebElement result : searchResults) {
            String resultText = result.getText().toLowerCase();
            System.out.println("Checking if \"" + resultText + "\" contains \"" + searchWord.toLowerCase() + "\"");
            boolean containsSearchWord = resultText.contains(searchWord.toLowerCase());
            System.out.println("Result: " + containsSearchWord);
            if (!containsSearchWord) {
                System.out.println("Search word not found in result: " + resultText);
            }
            Assert.assertTrue(containsSearchWord);
        }


    }


    @And("^clicks on the first search result$")
    public void clicks_on_the_first_search_result() {
        homePage.clickFirstSearchResult();
    }

    @Then("^the sku shown in the product page contains the search sku \"(.*)\"$")
    public void the_sku_shown_in_the_product_page_contains_the_search_sku(String searchSku) {
        String productSku = homePage.getProductSku();
        Assert.assertTrue(productSku.contains(searchSku));
    }
}

