Feature: User profile tests
  
  @regression @user_profile
  Scenario: User profile details are correct
    Given Open home page
    When Navigate to "Login"
    And Enter at Login Page in "Email" value "test1@test.pl"
    And Enter at Login Page in "Password" value "test1"
    And Click at Login Page "Log In" Button
    And Navigate to "Profile"
    Then Check if at User Profile Page "First name" is "Jan"
    And Check if at User Profile Page "Last name" is "Kowalski"
    And Check if at User Profile Page "Student index" is "223111"
    And Check if at User Profile Page "Email" is "test1@test.pl"
    And Check if at User Profile Page "Dormitory" is "T-16"
    And Check if at User Profile Page "Room" is "601"
    And Check if at User Profile Page button "Edit" is visible

  @regression @user_profile
  Scenario: Edit user details
    Given Open home page
    When Navigate to "Login"
    And Enter at Login Page in "Email" value "test3@test.pl"
    And Enter at Login Page in "Password" value "test3"
    And Click at Login Page "Log In" Button
    And Navigate to "Profile"
    Then Check if at User Profile Page "First name" is "Ignacy"
    And Check if at User Profile Page "Last name" is "Krasicki"
    And Check if at User Profile Page "Student index" is "223333"
    And Check if at User Profile Page "Email" is "test3@test.pl"
    And Check if at User Profile Page "Dormitory" is "T-4"
    And Check if at User Profile Page "Room" is "312"
    And Check if at User Profile Page button "Edit" is visible
    When Click at User Profile Page button "Edit"
    And Enter at User Profile Page in "First name" value "John"
    And Enter at User Profile Page in "Last name" value "Snow"
    And Enter at User Profile Page in "Student index" value "238238"
    And Enter at User Profile Page in "Dormitory" value "Moon"
    And Enter at User Profile Page in "Room" value "333"
    And Click at User Profile Page button "Save"
    And Navigate to "Profile"
    Then Check if at User Profile Page "First name" is "John"
    And Check if at User Profile Page "Last name" is "Snow"
    And Check if at User Profile Page "Student index" is "238238"
    And Check if at User Profile Page "Email" is "test3@test.pl"
    And Check if at User Profile Page "Dormitory" is "Moon"
    And Check if at User Profile Page "Room" is "333"

  @regression @user_profile
  Scenario: Cancel editing user profile
    Given Open home page
    When Navigate to "Login"
    And Enter at Login Page in "Email" value "test1@test.pl"
    And Enter at Login Page in "Password" value "test1"
    And Click at Login Page "Log In" Button
    And Navigate to "Profile"
    And Click at User Profile Page button "Edit"
    And Enter at User Profile Page in "First name" value "John"
    And Enter at User Profile Page in "Last name" value "Snow"
    And Enter at User Profile Page in "Student index" value "238238"
    And Enter at User Profile Page in "Dormitory" value "Moon"
    And Enter at User Profile Page in "Room" value "333"
    And Click at User Profile Page button "Cancel"
    And Navigate to "Profile"
    Then Check if at User Profile Page "First name" is "Jan"
    And Check if at User Profile Page "Last name" is "Kowalski"
    And Check if at User Profile Page "Student index" is "223111"
    And Check if at User Profile Page "Email" is "test1@test.pl"
    And Check if at User Profile Page "Dormitory" is "T-16"
    And Check if at User Profile Page "Room" is "601"

  @regression @user_profile
  Scenario: Changing password
    Given Open home page
    When Navigate to "Login"
    And Enter at Login Page in "Email" value "test3@test.pl"
    And Enter at Login Page in "Password" value "test3"
    And Click at Login Page "Log In" Button
    And Navigate to "Profile"
    And Click at User Profile Page button "Edit"
    And Enter at User Profile Page in "Current password" value "test3"
    And Enter at User Profile Page in "New password" value "3tset"
    And Enter at User Profile Page in "Confirm new password" value "3tset"
    And Click at User Profile Page button "Save"
    And Navigate to "Logout"
    And Navigate to "Login"
    And Enter at Login Page in "Email" value "test3@test.pl"
    And Enter at Login Page in "Password" value "3tset"
    And Click at Login Page "Log In" Button
    Then Check if option "LOGOUT" is visible on the navigation bar