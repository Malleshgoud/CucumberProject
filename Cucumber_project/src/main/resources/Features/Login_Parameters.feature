
Feature:  Login Feature Validating

Scenario: Validate the Login Scenario

Given User is on my store home page
When User clicks on login button
And User enters <username> and <password>
Then User should be navigate my store index page

Examples:
|username | password |
|mallesh@gmail.com | admin@123 |