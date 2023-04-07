Feature: Search Feature

  Scenario Outline: User could search using product name
    Given user is on the homepage
    When user searches for "<product>"
    Then url contains "https://demo.nopcommerce.com/search?q="
    And search shows relevant results
    Then the count of search results is "<count>"
    And each result contains the search word "<product>"

    Examples:
      | product | count |
      | laptop  | 2    |
      | nike    | 3   |

  Scenario Outline: User could search for product using SKU
    Given user is on the homepage
    When user searches for "<sku>"
    And clicks on the first search result
    Then the sku shown in the product page contains the search sku "<sku>"

    Examples:
      | sku       |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |

