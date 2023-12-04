Feature: Login page validation
  @test
  Scenario: Valid admin login
    Given user opens appium driver
    When user enters username and password
    And user clicks on login button
    Then user is able to navigate to product page