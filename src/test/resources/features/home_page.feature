Feature: Home Page test

  @regression @home_page
  Scenario: Home test
    Given Open home page
    Then Check if chart is visible
    And Check if home page text is visible