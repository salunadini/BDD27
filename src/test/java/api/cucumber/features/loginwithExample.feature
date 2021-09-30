Feature: Login Action

  Scenario Outline: Successful Login with Valid Cresentials
    Given User is on Home Page
    When User Navigate to Login Page
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfuly
    Examples:
    |username|password|
    |standard_user|secret_sauce|
    |locked_out_user|secret_sauce|
    |problem_user|secret_sauce|
    |performance_glitch_user|secret_sauce|