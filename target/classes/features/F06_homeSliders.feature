Feature: Home Page Sliders

  @smoke
  Scenario: First slider is clickable on home page
    Given I am on the home page
    When I click on the first slider
    Then I should be redirected to "https://demo.nopcommerce.com/nokia-lumia-1020"


  Scenario: Second slider is clickable on home page
    Given I am on the home page
    When I click on the second slider
    Then I should be redirected to "https://demo.nopcommerce.com/iphone-6"
