
@tag
Feature: User LogIn
  I want  use to Log IN successfully

  @tag1
  Scenario Outline: User LogIn
    Given The user get into Qardy homepage
    When user click on login button
    And user enter "<email>","<password>" is entered
    Then User succesfully LogIn
    
    Examples:
    | email | password |
    | e.kamel@eqardy.com | dodyEkoko@123 |