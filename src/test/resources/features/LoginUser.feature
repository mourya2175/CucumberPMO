@login @smoke
Feature: User Login

  Scenario: Successful login with valid credentials
    Given The user is on the login page
    When The user enters valid credentials
    Then The user should be successfully logged in
    Then Do some verification

  Scenario: Unsuccessful login with invalid credentials
    Given The user is on the login page
    When The user enters invalid credentials
    Then The user should see an error message about invalid login

  @regression
  Scenario Outline: Login attempts with multiple data sets
    Given The user is on the login page
    When The user enters "<email>" and "<password>"
    Then The user should see "<message>"

    Examples:
      | email               | password   | message                   |
      | validuser1@mail.com  | password1  | Login successful           |
      | invaliduser@mail.com | password1  | Invalid login attempt      |
      | validuser2@mail.com  | wrongpass  | Invalid login attempt      |
      | blank               | blank      | Please enter credentials   |
