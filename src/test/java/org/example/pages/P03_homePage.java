package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class P03_homePage {

    public By searchBox = By.id("small-searchterms");
    public By searchButton = By.cssSelector("button[type='submit']");
    public By searchResults = By.cssSelector("div.product-item");

    public By productLink(String sku) {
        return By.cssSelector("a[href*='" + sku + "']");
    }

    private By productSku = By.cssSelector("div.sku");


    public void navigateToHomePage() {
        Hooks.driver.get("https://demo.nopcommerce.com/");
    }

    public boolean isSearchResultDisplayed() {
        return Hooks.driver.findElement(searchResults).isDisplayed();
    }

    public void searchForProduct(String searchValue) {
        searchByProductName(searchValue);
    }

    public void searchByProductName(String productName) {
        WebElement searchBoxElement = Hooks.driver.findElement(searchBox);
        searchBoxElement.clear();
        searchBoxElement.sendKeys(productName);

        WebElement searchButtonElement = Hooks.driver.findElement(searchButton);
        searchButtonElement.click();
    }

    //
    public int getSearchResultsCount() {
        List<WebElement> results = Hooks.driver.findElements(searchResults);
        return results.size();
    }


    public void clickFirstSearchResult() {
        List<WebElement> results = Hooks.driver.findElements(searchResults);
        if (!results.isEmpty()) {
            results.get(0).click();
        }
    }


    public String getProductSku() {
        return Hooks.driver.findElement(productSku).getText();
    }

    public void searchBySku(String sku) {
        WebElement searchBoxElement = Hooks.driver.findElement(searchBox);
        searchBoxElement.clear();
        searchBoxElement.sendKeys(sku);

        WebElement searchButtonElement = Hooks.driver.findElement(searchButton);
        searchButtonElement.click();

        WebElement productLinkElement = Hooks.driver.findElement(productLink(sku));
        productLinkElement.click();
    }

    public void searchForProductBySku(String sku) {
        searchBySku(sku);
    }

    public List<WebElement> getSearchResults() {
        return Hooks.driver.findElements(searchResults);
    }

    public String getCurrentUrl() {
        return Hooks.driver.getCurrentUrl();
    }

    //     Locators
//  for the first slider and Nokia Lumia 1020 link

    public By facebookIcon = By.cssSelector("body > div.master-wrapper-page > div.footer > div.footer-upper > div.footer-block.follow-us > div.social > ul > li.facebook > a");
    public String expectedFacebookUrl = "https://www.facebook.com/nopCommerce";


    public void clickFacebookIcon() {
        Hooks.driver.findElement(facebookIcon).click();
    }

    public void switchToNewTab() {
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        if (tabs.size() > 1) {
            Hooks.driver.switchTo().window(tabs.get(1));
        } else {

            throw new AssertionError("Expected to switch to a new tab, but only one tab is open.");

        }

        }



    public void verifyFacebookUrl(String expectedUrl) {
        String actualUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public boolean isFacebookPageDisplayed() {
        String expectedFacebookUrl = "https://www.facebook.com/nopCommerce";
        String actualUrl = Hooks.driver.getCurrentUrl();
        return actualUrl.equals(expectedFacebookUrl);
    }

    public By twitterIcon = By.cssSelector("body > div.master-wrapper-page > div.footer > div.footer-upper > div.footer-block.follow-us > div.social > ul > li.twitter > a");
    public String expectedTwitterUrl = "https://twitter.com/nopCommerce";

    public void clickTwitterIcon() {
        Hooks.driver.findElement(twitterIcon).click();
    }

    public boolean isTwitterPageDisplayed() {
        String actualUrl = Hooks.driver.getCurrentUrl();
        return actualUrl.equals(expectedTwitterUrl);
    }

    public void verifyTwitterUrl(String expectedUrl) {
        String actualUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public By rssLink = By.cssSelector("body > div.master-wrapper-page > div.footer > div.footer-upper > div.footer-block.follow-us > div.social > ul > li.rss > a");

    public void clickRssLink() {
        Hooks.driver.findElement(rssLink).click();
    }

    public boolean isNewTabOpened() {
        return Hooks.driver.getWindowHandles().size() > 1;
    }

    public By youTubeIcon = By.cssSelector("body > div.master-wrapper-page > div.footer > div.footer-upper > div.footer-block.follow-us > div.social > ul > li.youtube > a");
    public String expectedYouTubeUrl = "https://www.youtube.com/user/nopCommerce";

    public void clickYouTubeIcon() {
        Hooks.driver.findElement(youTubeIcon).click();
    }

    public boolean isYouTubeChannelDisplayed() {
        String actualUrl = Hooks.driver.getCurrentUrl();
        return actualUrl.contains(expectedYouTubeUrl);
    }

    public void verifyYouTubeChannelUrl(String expectedUrl) {
        String actualUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    //Wishlist Locators

    public By htcOneM8WishlistButton = By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.product-grid.home-page-product-grid > div.item-grid > div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button");

    public By successMessage = By.xpath("//div[@class='bar-notification success']");


    public void open() {
        Hooks.driver.get("https://demo.nopcommerce.com/");
    }

    public void addToWishlist(String productName) {
        switch (productName) {
            case "HTC One M8 Android L 5.0 Lollipop":
                Hooks.driver.findElement(htcOneM8WishlistButton).click();
                break;
            default:
                throw new IllegalArgumentException("Invalid product name: " + productName);
        }
    }

    public boolean isSuccessMessageDisplayed() {
        return Hooks.driver.findElement(successMessage).isDisplayed();
    }

    public String getSuccessMessage() {
        return Hooks.driver.findElement(successMessage).getText();
    }

    public String getSuccessMessageBackgroundColor() {
        return Hooks.driver.findElement(successMessage).getCssValue("background-color");
    }
   public By   wishlistBtn = By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.product-grid.home-page-product-grid > div.item-grid > div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button");
    public By wishlistTab = By.xpath("//span[text()='Wishlist']/parent::a");
    public By cartQty = By.xpath("//div[@class='wishlist-info']//span[@class='wishlist-qty']");
    public void clickOnWishlistButton() {
        WebElement wishlistBtnElement = Hooks.driver.findElement(wishlistBtn);
        wishlistBtnElement.click();
    }

    public String getCartQty() {
        WebElement cartQtyElement = Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(3) > a > span.wishlist-qty"));
        String cartQtyText = cartQtyElement.getText();
        String numericPart = cartQtyText.replaceAll("[^0-9]", ""); // extract only numeric characters
        return numericPart;
    }
    // Locators for the sliders
    public By firstSliderLocator = By.className("nivo-imageLink");
    public By secondSliderLocator = By.className("nivo-imageLink");

    public P03_homePage() {
        // Initialize driver object
        // Code for initializing the driver object
    }

    // Click on the first slider
    public void clickOnFirstSlider() {
        WebElement firstSlider = Hooks.driver.findElement(firstSliderLocator);
        firstSlider.click();
    }

    // Click on the second slider
    public void clickOnSecondSlider() {
        WebElement secondSlider = Hooks.driver.findElement(secondSliderLocator);
        secondSlider.click();
    }

    // Verify the URL contains the expected value
    public void verifyUrlContains(String expectedUrl) {
        String currentUrl = Hooks.driver.getCurrentUrl();
        // Code to compare current URL with expected URL and assert
    }

//currencies


        private final By currencyDropdown = By.id("customerCurrency");
        private final By productPrices = By.cssSelector(".product-item .price");

        public void navigateToHomePage11() {
            Hooks. driver.get("https://demo.nopcommerce.com/");
        }

        public void selectCurrency(String currencyName) {
            WebElement dropdown = Hooks.driver.findElement(currencyDropdown);
            List<WebElement> options = dropdown.findElements(By.tagName("option"));
            for (WebElement option : options) {
                if (option.getText().equals(currencyName)) {
                    option.click();
                    break;
                }
            }
        }


        public List<WebElement> getProductPrices() {
            return Hooks.driver.findElements(productPrices);
        }


    public By mainCategories = By.cssSelector("body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(1) > a");
    public By subCategories = By.cssSelector("body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(1) > ul > li:nth-child(1) > a");
    public By subCategoryTitle = By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-title > h1");




    Actions actions = new Actions(Hooks.driver);
    public void selectRandomMainCategory() {
        List<WebElement> mainCategoriesList = Hooks.driver.findElements(mainCategories);
        int mainCategoriesCount = mainCategoriesList.size();
        int randomMainCategoryIndex = new Random().nextInt(mainCategoriesCount);
        mainCategoriesList.get(randomMainCategoryIndex).click();
    }

    public void hoverOnMainCategory() {
        WebElement mainCategory = Hooks.driver.findElement(mainCategories);
        actions.moveToElement(mainCategory).build().perform();
    }

    public void selectRandomSubCategory() {
        List<WebElement> subCategoriesList =  Hooks.driver.findElements(subCategories);
        int subCategoriesCount = subCategoriesList.size();
        int randomSubCategoryIndex = new Random().nextInt(subCategoriesCount);
        subCategoriesList.get(randomSubCategoryIndex).click();
    }

    public String getSelectedSubCategory() {
        return Hooks.driver.findElement(subCategories).getText();
    }

    public String getSubCategoryTitle() {
        return Hooks. driver.findElement(subCategoryTitle).getText();
    }

    }






