@SmokeTest
@Dogs

Feature: Testing Dogs page functionality

  Scenario: Dogs page functionality
    Given I open base url
    When I change category to dogs
    And I fill min age 10 and max age 101
    And I fill min price 0 and max price 10000
    And I press submit button
    And I change deal to sell
    Then I stop driver

  @SmokeTest
  @Car
  Feature: Testing Cars page functionality

  Scenario: Cars page functionality

    Given I open base url
    When  I change category to cars
    And I fill min price 6000 and max price 1000
    And I fill in 2001 Year
    And I fill in 3.0 engine
    And I select color code 6318
    Then I stop driver

