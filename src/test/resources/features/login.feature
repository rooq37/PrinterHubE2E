Feature: Login test

  @regression @login
  Scenario: Successful login test
    Given Open home page
    When Navigate to "Login"
    And Enter at Login Page in "Email" value "test1@test.pl"
    And Enter at Login Page in "Password" value "test1"
    And Click at Login Page "Log In" Button
    Then Check if user is logged in

  @regression @login
  Scenario: Login not existing user
    Given Open home page
    When Navigate to "Login"
    And Enter at Login Page in "Email" value "unknown@ukn.com"
    And Enter at Login Page in "Password" value "unknown"
    And Click at Login Page "Log In" Button
    Then Check if error message is "Wrong email or password."

  @regression @login
  Scenario: Login wrong password
    Given Open home page
    When Navigate to "Login"
    And Enter at Login Page in "Email" value "test1@test.pl"
    And Enter at Login Page in "Password" value "wrongpassword123"
    And Click at Login Page "Log In" Button
    Then Check if error message is "Wrong email or password."