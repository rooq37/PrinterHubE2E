Feature: Register test

  Scenario: Successful register test
    Given Open home page
    When Navigate to "Register"
    And Enter at Register Page in "Email address" value "selenium@test.pl"
    And Enter at Register Page in "Password" value "selenium123"
    And Enter at Register Page in "Repeat password" value "selenium123"
    And Enter at Register Page in "First name" value "Selenium"
    And Enter at Register Page in "Last name" value "Test"
    And Enter at Register Page in "Student No" value "236235"
    And Enter at Register Page in "Dormitory" value "T-54"
    And Enter at Register Page in "Room" value "103"
    And Click at Register Page "Submit" Button
    And Navigate to "Login"
    And Enter at Login Page in "Email" value "selenium@test.pl"
    And Enter at Login Page in "Password" value "selenium123"
    And Click at Login Page "Log In" Button

  @regression @register
  Scenario: Register already existing user
    Given Open home page
    When Navigate to "Register"
    And Enter at Register Page in "Email address" value "test1@test.pl"
    And Enter at Register Page in "Password" value "selenium123"
    And Enter at Register Page in "Repeat password" value "selenium123"
    And Enter at Register Page in "First name" value "Test"
    And Enter at Register Page in "Last name" value "One"
    And Enter at Register Page in "Student No" value "231132"
    And Enter at Register Page in "Dormitory" value "TU-115"
    And Enter at Register Page in "Room" value "975"
    And Click at Register Page "Submit" Button
    And Check if error message is "Such a user already exists."

  @regression @register
  Scenario: Register wrong repeat password
    Given Open home page
    When Navigate to "Register"
    And Enter at Register Page in "Email address" value "automatic@test.pl"
    And Enter at Register Page in "Password" value "selenium123"
    And Enter at Register Page in "Repeat password" value "selenium321"
    And Enter at Register Page in "First name" value "Test"
    And Enter at Register Page in "Last name" value "One"
    And Enter at Register Page in "Student No" value "231132"
    And Enter at Register Page in "Dormitory" value "TU-115"
    And Enter at Register Page in "Room" value "975"
    And Click at Register Page "Submit" Button
    And Check if error message is "Password and repeat password are different."


