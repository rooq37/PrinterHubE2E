Feature: Terms of use test

  @regression
  Scenario: Terms of use test
    Given Open home page
    When Navigate to "Terms of use"
    Then Check if page header is "Terms of use"
    And Check if terms of use text is visible