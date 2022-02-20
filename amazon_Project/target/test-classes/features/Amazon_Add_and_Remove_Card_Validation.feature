Feature: Amazon add or Remove Cart Function
As a Cart
I want to see cart
So that I can confirm cart 

Scenario: Verify Amazon Add or Remove Item From Cart
Given I am in Amazon Page
When I search for Blenders
And I click on any project
And I add the product to cart
And I go to my cart
Then it should have 1 item in it
Then I remove the item from my cart