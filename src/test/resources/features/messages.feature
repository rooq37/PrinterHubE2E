Feature: Messages

  @regression @messages
  Scenario: Sending message to yourself
    Given Open home page
    When Navigate to "Login"
    And Enter at Login Page in "Email" value "test1@test.pl"
    And Enter at Login Page in "Password" value "test1"
    And Click at Login Page "Log In" Button
    And Navigate to "Messages"
    And Click at Messages Page "Create message" button
    And Enter at Create Message Page in "To" value "test1@test.pl"
    And Enter at Create Message Page in "Title" value "Message to myself"
    And Enter at Create Message Page in "Message" value "This is the message from me to myself"
    And Click at Create Message Page "Send" Button
    Then Check if error message is "You can't send an email to yourself."

  @regression @messages
  Scenario: Messages sending and reading
    Given Open home page
    When Navigate to "Login"
    And Enter at Login Page in "Email" value "test1@test.pl"
    And Enter at Login Page in "Password" value "test1"
    And Click at Login Page "Log In" Button
    And Navigate to "Messages"
    And Click at Messages Page "Create message" button
    And Enter at Create Message Page in "To" value "test2@test.pl"
    And Enter at Create Message Page in "Title" value "from test1 to test2"
    And Enter at Create Message Page in "Message" value "This is the message from user test1 to user test2"
    And Click at Create Message Page "Send" Button
    And Navigate to "Messages"
    Then Check if messages list "from test1 to test2" contains
    When Click at messages list at message "from test1 to test2" from "You" "Show" button
    Then Check if at Single Message Page "From" is "Jan Kowalski"
    And Check if at Single Message Page "To" is "Tomasz Dąbrowski"
    And Check if at Single Message Page "Title" is "from test1 to test2"
    And Check if at Single Message Page "Message" is "This is the message from user test1 to user test2"
    When Navigate to "My account"
    And Navigate to "Logout"
    And Navigate to "Login"
    And Enter at Login Page in "Email" value "test2@test.pl"
    And Enter at Login Page in "Password" value "test2"
    And Click at Login Page "Log In" Button
    And Navigate to "Messages"
    Then Check if messages list "from test1 to test2" contains
    When Click at messages list at message "from test1 to test2" from "Jan Kowalski" "Show" button
    Then Check if at Single Message Page "From" is "Jan Kowalski"
    And Check if at Single Message Page "To" is "Tomasz Dąbrowski"
    And Check if at Single Message Page "Title" is "from test1 to test2"
    And Check if at Single Message Page "Message" is "This is the message from user test1 to user test2"