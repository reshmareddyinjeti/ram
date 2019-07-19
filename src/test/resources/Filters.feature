@Filters
Feature: search for the product
  As a argos user
  I want to see the result
  So that i can see the result

  Background:
    Given I am on Homepage
    When I Search for a product "nike"

  @regression
  Scenario:
    And I select a customer rating as "4or more"
    Then I should see all the product filtered rating

  @regression
    Scenario:
    And I select a customer price as "£15 - £20"
    Then I should see all the product filtered price

    @regression
    Scenario:
      And I select a customer category as "Running"
      Then I should see all the product filtered category
