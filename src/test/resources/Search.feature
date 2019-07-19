@Search
Feature: Search for a product
  As a argos user
  I Want to search for a product
  So That i can see the respective results

  @smoke
  Scenario:
    Given I am on Homepage
    When I Search for a product "nike"
    Then  I see the respective results

