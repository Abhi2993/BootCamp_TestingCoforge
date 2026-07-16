
  Feature: Customer Registration

  Scenario: Test Case 1: Register with Valid Mobile Number

    Given User should open Chrome browser
    And User should navigate to the Meesho application
    When User should click on the Sign Up option
    And User should enter a valid 10-digit mobile number
    And User should click on the Continue button
    And User should enter the valid OTP
    Then User should verify that the account is created successfully