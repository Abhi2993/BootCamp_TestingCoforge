
  Feature: Product Search

  Scenario: Test Case 1: Search Product Successfully

    Given User should open Chrome browser
    And User should login into the Meesho application
    When User should enter the product name in the search box
    And User should click on the Search button
    Then User should verify that the relevant products are displayed