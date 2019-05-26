Feature: Other users tests

  @regression @other_users
  Scenario Outline: Search function
    Given Open home page
    When Navigate to "Login"
    And Enter at Login Page in "Email" value "test1@test.pl"
    And Enter at Login Page in "Password" value "test1"
    And Click at Login Page "Log In" Button
    And Navigate to "Users"
    And Enter at Other Users Page in "First name" value "<First name>"
    And Enter at Other Users Page in "Last name" value "<Last name>"
    And Enter at Other Users Page in "Dormitory" value "<Dormitory>"
    And Enter at Other Users Page in "Room" value "<Room>"
    And Click at Other Users Page "Search" button
    Then Check if Other Users result list "<Result>" contains


    Examples:
      | First name | Last name | Dormitory | Room | Result                               |
      | Jan        | Kowalski  | T-16      | 601  | Jan Kowalski T-16 601 See more     |
      | Tomasz     |           |           |      | Tomasz Dąbrowski T-22 723 See more |
      |            | Nowacki   |           |      | Damian Nowacki T-15 12 See more    |
      |            |           | T-22      |      | Tomasz Dąbrowski T-22 723 See more |
      |            |           |           | 1024 | Jan Kowal T-6 1024 See more        |
      | Tomasz     |           | T-22      |      | Tomasz Dąbrowski T-22 723 See more |
      |            | Kowalski  |           | 601  | Jan Kowalski T-16 601 See more     |


  @regression @other_users
  Scenario: Other user details
    Given Open home page
    When Navigate to "Login"
    And Enter at Login Page in "Email" value "test1@test.pl"
    And Enter at Login Page in "Password" value "test1"
    And Click at Login Page "Log In" Button
    And Navigate to "Users"
    And Enter at Other Users Page in "First name" value "Damian"
    And Enter at Other Users Page in "Last name" value "Nowacki"
    And Enter at Other Users Page in "Dormitory" value "T-15"
    And Enter at Other Users Page in "Room" value "12"
    And Click at Other Users Page "Search" button
    Then Check if Other Users result list "5 Damian Nowacki T-15 12 See more" contains
    When Click at Other Users Page "See more" button at "5 Damian Nowacki T-15 12 See more" row
    Then Check if at User Profile Page "First Name" is "Damian"
    And Check if at User Profile Page "Last Name" is "Nowacki"
    And Check if at User Profile Page "Student No" is "223555"
    And Check if at User Profile Page "Email address" is "test5@test.pl"
    And Check if at User Profile Page "Dormitory" is "T-15"
    And Check if at User Profile Page "Room" is "12"
