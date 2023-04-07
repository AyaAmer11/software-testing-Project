@smoke
Feature: Wishlist functionality

  Scenario: Add product to wishlist
    Given user is on homepage0
    When user adds "HTC One M8 Android L 5.0 Lollipop" to wishlist
    Then success message "The product has been added to your wishlist" with green background color is displayed



  Scenario: Add product to wishlist and verify Qty value
    Given I am on the home page00
    When I click on wishlist button for HTC One M8 Android L 5.0 Lollipop product
    Then I should see the success message with green color disappear
    When I click on Wishlist Tab
  Then I should see the Qty value bigger than 0

