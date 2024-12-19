Feature: Login functionality of Leaftaps Application



Scenario: Login with Valid credentials

Given Launch the browser
Given Load the url
When Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And Click the Login button
Then It should navigate to the next page

Scenario: Login with Invalid credentials

Given Launch the browser
Given Load the url
When Enter the username as 'Demo'
And Enter the password as 'crmsfa'
And Click the Login button
But It throws error message