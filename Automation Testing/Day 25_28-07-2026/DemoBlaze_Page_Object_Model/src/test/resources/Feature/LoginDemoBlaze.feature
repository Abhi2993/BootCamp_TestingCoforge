Feature: DemoBlaze Login and Add Product

  Scenario: Login Add Product Logout

    Given User launches DemoBlaze application

    When User enters valid username and password

    And User clicks Login button

    Then User should login successfully

    When User selects Samsung Galaxy S6

    And User clicks Add To Cart

    Then Product should be added successfully

    When User opens Cart

    Then Product should be visible in Cart

    When User clicks Logout

    Then User should logout successfully