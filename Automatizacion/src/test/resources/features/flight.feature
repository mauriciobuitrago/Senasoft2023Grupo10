Feature: flight
  Scenario: Find correct flights
    Given The user enters the page
    When the user enters departure from "clo" arrival in "madrid" and specifies the date
    Then It validates that a successful search was made


@1
  Scenario: Find faile flights
    Given The user enters the page
    When the user enters departure from "clo" arrival in "madrid", one children sin edad and specifies the dat
    Then Validates that an erroneous search was performed