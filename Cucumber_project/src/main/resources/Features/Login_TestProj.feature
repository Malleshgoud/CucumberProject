
Feature:  Login testProjectApp Feature Validating

Scenario: Validate the Login Scenario for testProject App

Given User is on testProjectApp
When User should enters <username> and <password> in testProjectApp
And User clicks on login button in testProject App
Then User should be navigate testProject App home page

Examples:
|username | password |
|mallesh123 | 12345 |