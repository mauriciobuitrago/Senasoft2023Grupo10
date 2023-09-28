Feature: vuelos
  Scenario: Find correct flights
    Given the user enteres the page
    When the user enters departure from "clo" arrival in "madrid" and specifies the date
    Then It validates that a successful search was made