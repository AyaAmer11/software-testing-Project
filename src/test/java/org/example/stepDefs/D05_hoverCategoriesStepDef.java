package org.example.stepDefs;

import org.example.pages.P03_homePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D05_hoverCategoriesStepDef {


    P03_homePage homePage = new P03_homePage();


        @Given("User is on Home page")
        public void user_is_on_home_page() {
//            homePage.navigateToHomePage();
        }

        @When("User selects a random main category")
        public void user_selects_a_random_main_category() {
            homePage.selectRandomMainCategory();
        }

        @When("User hovers on the selected category")
        public void user_hovers_on_the_selected_category() {
            homePage.hoverOnMainCategory();
        }

        @When("User selects a random sub-category")
        public void user_selects_a_random_sub_category() {
            homePage.selectRandomSubCategory();
        }

        @Then("User should see the sub-category title containing the selected sub-category")
        public void user_should_see_the_sub_category_title_containing_the_selected_sub_category() {
            String expectedTitle = homePage.getSelectedSubCategory().toLowerCase().trim();
            String actualTitle = homePage.getSubCategoryTitle().toLowerCase().trim();
            Assert.assertTrue(actualTitle.contains(expectedTitle));
        }
    }

