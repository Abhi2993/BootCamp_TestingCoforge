
  Feature: Wishlist

  Scenario: Test Case 1: Add Product to Wishlist

    Given User should open Chrome browser
    And User should login into the Meesho application
    When User should search the required product
    And User should click on Wishlist button
    Then User should verify that the product is added to the wishlist