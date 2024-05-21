@friday
Feature: Is it Friday yet?
  Everybody wants to know when it´s Friday

  @friday01
  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When I ask whether its Friday yet
    Then I should be told "<answer>"
    Examples:
      | day            | answer |
      | Friday         | TGIF   |
      | Sunday         | Nope   |
      | anything else! | Nope   |