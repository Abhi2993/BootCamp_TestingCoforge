
  Feature: Checkout

  Scenario: Test Case 1: Checkout Successfully

    Given User should open Chrome browser
    And User should login into the Meesho application
    When User should open the shopping cart
    And User should click on Proceed to Checkout
    Then User should verify that the checkout page is displayed