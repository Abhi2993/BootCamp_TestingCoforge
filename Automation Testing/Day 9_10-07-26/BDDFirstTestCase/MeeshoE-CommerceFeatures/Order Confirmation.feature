
  Feature: Order Confirmation

  Scenario: Test Case 1: Place Order Successfully

    Given User should complete the payment
    When User should confirm the order
    Then User should verify that the order confirmation page is displayed