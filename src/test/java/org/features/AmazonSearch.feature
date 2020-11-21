Feature: As a Customer when I search for Alexa, I want to see if the third option on the second page is
         available for purchase and can be added to the cart.

Scenario: Run a Product Summary Report

Given the user navigates to amazon
And Searches for ‘Alexa’
And navigates to the second page
And selects the third item
Then assert that the item would be available for purchase
