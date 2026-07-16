
  Feature: Payment

  Scenario: Test Case 1: Complete Payment Successfully

    Given User should be on the payment page
    When User should select UPI as the payment method
    And User should complete the payment
    Then User should verify that the payment is successful