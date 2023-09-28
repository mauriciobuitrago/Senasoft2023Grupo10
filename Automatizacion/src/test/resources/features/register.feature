Feature: register

  Scenario: Successful registration
    Given The user enters the page
    When the user enters email "automatizacion123@gmail.com" and enters password "Automatico123" in the dos fields
    Then It will validate that a successful registration was made