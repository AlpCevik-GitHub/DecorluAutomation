Feature: User can buy any item from the store

  Background: User is logged in
    Given I am logged in as a user

    Scenario: User buys an item
      Given I am on the store page
      When I click on the "Buy" button
      Then I should see "Thank you for your purchase"