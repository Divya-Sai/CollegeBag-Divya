Feature: Add a new Course
  Scenario: User should successfully add a new course
    Given  User should launch "chrome" browser
    When  User launch the "http://localhost:4200/"
    Then  User enter "admin@gmail.com" and "admin123"
    And  User click on Sign in Button
    And verify the title of the page "Portal | College Bag"
    And User click on "Courses" from navigation Panel
    And User should add a new course "Bachelor of Tech" with acroynm "B.Tech"
    And Close the driver