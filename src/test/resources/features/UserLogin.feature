Feature: User Login Function

Scenario: Valid Login Admin
Given User is on Login Page
When User enters credentials
Then Should display the success message

Scenario: Valid Login Admin with parametrization
Given User is on Login Page
When User enters "tomsmith" and "SuperSecretPassword!"
Then Should display the success message