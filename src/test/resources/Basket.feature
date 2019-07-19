@basket
Feature: Basket
  As an end user
  I want to add a product to basket
  So that i can buy product for later

  @smoke
  Scenario: Add a product to basket
    Given I am on Homepage
    When I Search for a product "nike"
    And I select a product from results
    And I add product to basket
    And I go to basket
    Then I should see selected product in the basket
