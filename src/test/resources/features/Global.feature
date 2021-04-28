Feature: Create a new user by filling the fields on the registation form on "https://www.utest.com/signup/personal".
  the user have to go through 4 steps in order to complete the task.

  @ScenariowithoutExample
  Scenario: process the first step of the form.
    Given The person access to the form to create the user and inputs santiago vargas santiago.vargast@hotmail.com October 21 1998 spanish.
    When User clicks the button on the main page with the label Join now and fill the fields
    Then Submits the first step and continues

  @ScenariowithExample
  Scenario Template: process the first step of the form.
    Given The person access to the form to create the user and inputs santiago vargas santiago.vargast@hotmail.com October 21 1998 spanish.
    When clicks the button on the main page with the label Join now and fill the fields
      | <firstName> | <lastname> | <email> | <month> | <day> | <year> | <lenguajes> |
    Then Submits the first step and continues

    Examples:
      | firstName | lastname | email | month | day | year | lenguajes |
      | santiago  | vargas   | santiagoa.vargast@hotmail.com | October | 21 | 1998 | spanish |



