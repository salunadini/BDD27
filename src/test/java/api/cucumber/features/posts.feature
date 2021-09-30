Feature: Post feature of facebook
  This will test the functionality at the user wall

@SmokeTest
  Scenario: Post a message on user wall
    Given User should be logged in and should be present at its own wall
    When I type the message as in the text box
    And Click on Post button
    Then the message should get posted

  Scenario: Post a video on user wall
    Given User should be logged in and should be present at its own wall
    When User supply the youtube link as in the text box
    And Click on Post button
    Then Then video should get posted on the user wall
    And the video should have proper thumbnail