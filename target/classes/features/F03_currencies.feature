@smoke
Feature: Currency selection
  As a user
  I want to be able to select a currency
  So that I can view product prices in my preferred currency

  Scenario: Verify Euro symbol is shown for selected currency
    Given I am on the home page1
    When I select Euro currency from the dropdown list
    Then Euro symbol (€) should be shown for all products displayed
