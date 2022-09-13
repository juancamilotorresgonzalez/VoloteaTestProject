Feature: Enter-Origin Destiny
  As QA Automation
  I want to enter Origin Destiny
  To select the trip

  Scenario Outline: Enter Origin Destiny

    Given enter the volotea.com page
    And accept all cookies, select passenger area and origin-destiny
    When the user select trip <origin> , <destiny>
    Then verify the trip selected origin ,destiny

   Examples:
     | origin   | destiny   |
     | Madrid   | Barcelona |
     | Mad      | Bcn       |
     | Valencia | Bilbao"   |
