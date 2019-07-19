Feature: Sort
  As an end user
  I want to sort the results
  So that i can see product of may choice

  @regression
  Scenario: Sort By price
    Given I am on Homepage
    When I Search for a product "nike"
    And I set sort by filter as "Price: Low - High"
    Then I should see all the product in sorted order as price

