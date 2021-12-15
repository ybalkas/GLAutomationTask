@win
Feature: As a user I should be able to do English Test

  Scenario: As a user I should be able navigate on the question three
    Given User on the third question
    When User navigates all options of question three
      | her        |
      | him        |
      | them       |
      | his        |
      | himself    |
    Then User should be able to click next button
    Then Number of answered questions should be three

  Scenario: As a user I should be able to finish English Test
    Given User on the homepage
    When User navigates till end of exam
    Then User finishes the exam

