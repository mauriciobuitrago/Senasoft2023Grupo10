Feature: register
  Scenario: Successful registration
    Given The user enters the page <https://www.booking.com/>
    When the user enters to register with automation@gmail.com email
    And password Automatizacion123
    Then the user verifies successful registration