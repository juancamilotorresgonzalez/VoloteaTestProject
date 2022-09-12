Feature: Passengers only

  As Qa automation
  I want to enter the passengers
  To validate that they were entered


  Scenario: select new flight
    Given enter to volotea flights
    And   accept cookies and select the button origin
    When  find a new origin <Madrid>, <Barcelona>
    Then  verify the minimun passengers


