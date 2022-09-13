Feature: Passengers only

  As Qa automation
  I want to enter the trip
  To validate the minimun passengers


  Scenario Outline: select new flight
    Given enter to volotea flights
    And   accept cookies and select the button origin
    When  find a new origin <origin>, <destiny>
    Then  verify the minimun passengers

    Examples:
      | origin | destiny   |
      | Madrid | Barcelona |

