Feature:_Login Feature

Scenario: Login with value
Given I launch the application
When I entered the username
And I entered the password
And click on the login button
Then I verified that username and password
