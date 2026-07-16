
  Feature: Customer Login

  Scenario: Test Case 1: Login with Valid Mobile Number

    Given User should open Chrome browser
    And User should navigate to the Meesho application
    When User should click on the Login option
    And User should enter a registered mobile number
    And User should enter the valid OTP
    Then User should verify that the user is logged in successfully