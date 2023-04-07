Feature: Verify Facebook icon on the NopCommerce website

  Scenario: User clicks on Facebook icon and verifies the URL
    Given I am on the NopCommerce homepage
    When I click on the Facebook icon
    Then a new tab should open with the Facebook page
    And the URL of the new tab should be "https://www.facebook.com/nopCommerce" version 1

  Scenario: User clicks on Twitter icon and verifies the URL
    Given I am on the NopCommerce homepage1
    When I click on the Twitter icon
    Then a new tab should open with the Twitter page
    And the URL of the new tab should be "https://twitter.com/nopCommerce" version 2

  Scenario: User clicks on rss link and verifies the URL
    Given I am on the NopCommerce homepage1
    When I click on the rss link
 Then a new tab should open with the rss page
   And the URL of the new tab should be "https://demo.nopcommerce.com/new-online-store-is-open" version 3

  Scenario: User opens nopCommerce's YouTube channel
    Given I am on the NopCommerce homepage3
    When I click on the YouTube icon
    Then a new tab should open with nopCommerce's YouTube channel
    And the URL of the new tab should be "https://www.youtube.com/user/nopCommerce" version 4