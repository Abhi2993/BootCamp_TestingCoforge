
  Feature: Remove from Cart

  Scenario: Test Case 1: Remove Product from Cart

    Given User should open Chrome browser
    And User should login into the Meesho application
    When User should open the shopping cart
    And User should click on Remove button
    Then User should verify that the product is removed from the shopping cart