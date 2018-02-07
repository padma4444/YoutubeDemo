Feature: Test facebook signUp page

Scenario: Check Facebook signin page with valid details
Given Open  FB website with valid Url
When Give valid details for all fields
And Click Creat Account Button
Then Close the window
