Feature: User should able to login Successfully
  Scenario:Login Successfully to College Bag Application with valid credentials
    Given User should launch "chrome" browser
    When  User launch the "http://localhost:4200/"
    Then  User enter "admin@gmail.com" and "admin123"
    And  User click on Sign in Button
    And verify the title of the page "Portal | College Bag"
    And Close the driver

  Scenario Outline:Multiple Logins with Invalid Credentials
    Given User should launch "chrome" browser
    When  User launch the "http://localhost:4200/"
    Then  User enter "<Username>" and "<Password>"
    And  User click on Sign in Button
    And verify the title of the page "Portal | College Bag"
    And Close the driver
    Examples:
      |Username     | Password    |
      |             | admin123|
      |admin@gmail.com  |        |
      |            |         |