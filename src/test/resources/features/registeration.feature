Feature: User Registration

  Scenario: User logs in to the system and register successfully

    Given user enter userName as "test"
    And user enter passWord as "test"
    When user clicks on sign in button
    Then user navigated to Home Page

    Given user navigated to Register Page
    When user enters registration details as
      | firstName  | lastName  | phone    | email            | address1  | address2  | city  | state  | postalCode  | country  | userName | password | confirmPassword |
      | firstName1 | lastName1 | 12345689 | email1@email.com | address11 | address21 | city1 | state1 | postalCode1 | ALGERIA  | email1   | 123      | 123             |
      | firstName2 | lastName2 | 12345689 | email2@email.com | address12 | address22 | city2 | state2 | postalCode2 | ALBANIA  | email2   | 123      | 123             |
      | firstName3 | lastName3 | 12345689 | email3@email.com | address13 | address23 | city3 | state3 | postalCode3 | ANGUILLA | email3   | 123      | 123             |


