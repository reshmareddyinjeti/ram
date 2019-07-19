@register
Feature: Register
  As a end user
  I want to register for site
  So that i can login into site

  @smoke
  Scenario: Valid register
    Given I am on Homepage
    When I navigate to register page
    And I fill the user registration for:
      | Email                    | Title   | First_Name | Last  | Post_code |
      | jhiujjughiuj@gmail.com   | Miss    | reshma     | reddy | TW33SF    |
      |  wyqurhwuqyghu@gmail.com |mr       |  vini      |  n    | thijhv    |

