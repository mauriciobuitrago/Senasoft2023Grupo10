Feature: login
  Scenario: Successful login
    Given The user enters the page
    When the user enters to login with "1automation@gmail.com" email and password "Automatizacion123"
    Then the user verifies successful login



@1
  Scenario: Unsuccessful login
    Given The user enters the page
    When the user enters to login with "1automation@gmail.com" email and password "Automatizacion1234"
    Then the user verifies unsuccessful login