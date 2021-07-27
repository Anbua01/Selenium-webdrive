Feature: To verify the login functionality

  Background: 
    Given user has to be in the facebook

  Scenario: To Validate login using invalid credentials
  
When user enter invalid username and password
| greens | greens@123 |
| java   | java@123   |
And user click the login button

  Scenario: To validate the login without passing credentials
  When user click the login without passing value
