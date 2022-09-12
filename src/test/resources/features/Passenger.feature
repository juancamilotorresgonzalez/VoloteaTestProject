Feature: Passengers only

  As Qa automation
  I want to enter the passengers
  To validate that they were entered


Scenario Outline: enter to volotea.com page and check the maximun babys for passenger
Given enter to volotea.com page
When the user select number of passengers  <Adult> <baby>
Then  verify the number of passengers selected  <Adult> <baby>

Examples:
| Adult | baby |
| 1     | 1    |
| 6     | 6    |
| 25    | 11   |
| 14    | 14   |