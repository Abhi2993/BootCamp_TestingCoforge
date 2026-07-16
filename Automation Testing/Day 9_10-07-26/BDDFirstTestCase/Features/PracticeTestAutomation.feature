Feature: Checking loging test for Practice test Automation

Scenario: Test case 1: Positive LogIn test

Given User should open Chrome Browser
When User should Enter url in browser
Then Type username student into Username in Edit field
Then Type password Password123 into Password Text field
Then User should click on Push Submit button
Then User should Verify new page URL contains https://practicetestautomation.com/logged-in-successfully/
Then User should Verify new page contains expected text ('Logged In Successfully' or 'Congratulations')
Then User should Verify button Log out is displayed on the new page