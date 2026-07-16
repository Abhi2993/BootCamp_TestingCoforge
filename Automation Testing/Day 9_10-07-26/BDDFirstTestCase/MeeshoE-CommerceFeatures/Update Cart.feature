
  Feature: Update Cart

  Scenario: Test Case 1: Update Product Quantity

    Given User should open Chrome browser
    And User should login into the Meesho application
    When User should open the shopping cart
    And User should increase the product quantity
    Then User should verify that the cart is updated successfully