
Feature: Tester Details
   
 Scenario Outline: Eating
Given  There are "<start>" fruits
| type     | with  |
| Apple    | me    |
| Oranges  | Jon   |
| cucumber | Mary  |

    When I eat "<eat>" fruits
    Then  I have "<left>" fruits
     
  
Examples:

| start | eat | left  |
| 12    | 5   |		7		|
| 10    | 6   |		4		|