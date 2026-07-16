Feature: Checking login test for Practice test Automation

Scenario: Test case 2: Negative Username test

Given User should open Chrome Browser

When User should Enter url in browser

Then Type username incorrectUser into Username Edit field

Then Type password Password123 into Password Text field

Then User should click on Push Submit button

Then User should Verify error message is displayed

Then User should Verify error message text is "Your username is invalid!"