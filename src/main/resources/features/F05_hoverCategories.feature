@smoke
Feature: Hover on Categories

  Scenario: User hovers on a random category and selects a random sub-category
    Given User is on Home page
    When User selects a random main category
    And User hovers on the selected category
    And User selects a random sub-category
    Then User should see the sub-category title containing the selected sub-category
