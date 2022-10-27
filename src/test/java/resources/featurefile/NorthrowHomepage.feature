Feature: HomePageMenuTest
  As a user i should navigate to menu page by click.

  Scenario: verify i should able to click on cart-icon
    Given I am on home page.
    When I click on watch video button.
    Then I am navigated on video diplay.

  Scenario Outline: verify i should navigate inside the module page.
    Given I am on home page.
    When I click on top menu "<menu>"
    And I am navigated on menu page.
    Examples:
      | menu        |
      |Solutions    |
      |Industries   |
      |Why NorthRow |
      |Insights     |
      |Get Started  |
  Scenario: Verify the Display Message
    Given I am on home page.
    When I click on Get Started
    Then I will be able to see the Message "Yes, I want to see a demo of NorthRow…" on the page