
Feature: User Registration
  I want to check that user can register in our Qardy website.

  Scenario Outline: User Registration
    Given the user in Qardy homepage
    When user click on register button
    And user enter "<email>","<password>","<confirmPassword>","<name>","<dobDate>" is entered
    Then The registration page dispalyed succesfully

    Examples:
    | email | password | confirmPassword | name | dobDate |
    | azhar.kame103152355@gmail.com | Endy@123 | Endy@123 | EndyTest | 2001 02 20 |
    | azhar.kame103152350@gmail.com | Endy@123 | Endy@123 | EndyTest | 2001 02 20 |