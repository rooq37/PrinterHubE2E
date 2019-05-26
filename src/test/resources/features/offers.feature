Feature: Offers tests

  @regression @offers
  Scenario: Offer creating
    Given Open home page
    When Navigate to "Login"
    And Enter at Login Page in "Email" value "test1@test.pl"
    And Enter at Login Page in "Password" value "test1"
    And Click at Login Page "Log In" Button
    And Navigate to "My account"
    And Navigate to "My offers"
    And Click at My Offers Page "Create new offer" Button
    And Enter at Create Offer Page in "Title" value "Test offer"
    And Enter at Create Offer Page in "Price" value "15"
    And Enter at Create Offer Page in "Description" value "This is test offer"
    And Click at Create Offer Page "Black and white printing" checkbox
    And Click at Create Offer Page "A-4 paper size" checkbox
    And Click at Create Offer Page "Save" Button
    And Navigate to "My account"
    And Navigate to "My offers"
    Then Check if at My Offers List "Test offer" contains
    And Navigate to "My account"
    And Navigate to "Logout"
    When Open home page
    When Navigate to "Login"
    And Enter at Login Page in "Email" value "test2@test.pl"
    And Enter at Login Page in "Password" value "test2"
    And Click at Login Page "Log In" Button
    And Navigate to "Offers"
    When Click at Offers Page "See more" button at "Test offer" row
    Then Check if at Offer Details Page "Title" is "Test offer"
    And Check if at Offer Details Page "Creator" is "Jan Kowalski"
    And Check if at Offer Details Page "Description" is "This is test offer"
    And Check if at Offer Details Page "Categories" is "Black and white printing, A-4 paper size"