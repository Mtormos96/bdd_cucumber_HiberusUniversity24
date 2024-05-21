@saturday
Feature: Is it Saturday yet?
  Everybody wants to know when it´s Saturday

  @saturday01
  Scenario Outline: Today is or is not Saturday
    Given today is "<day>"
    When I ask whether its Saturday yet
    Then I should be told "<answer>"
    Examples:
      | day            | answer |
      | Saturday       | Nice!  |
      | Friday         | Nope   |
      | Sunday         | Nope   |
      | Monday         | Nope   |