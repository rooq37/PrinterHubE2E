Feature: Terms of use test

  Scenario: Terms of use test
    Given Open home page
    When Navigate to "Terms of use"
    Then Check if page header is "Blabla"
    And Check if terms of use text is visible