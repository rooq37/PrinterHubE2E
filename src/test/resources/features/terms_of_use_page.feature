Feature: Terms of use test

  Scenario:
    Given Open home page
    When Navigate to "Terms of use"
    Then Check if page header is "Terms of use"
    And Check if terms of use text is visible