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