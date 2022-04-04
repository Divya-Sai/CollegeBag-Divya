Feature: Logout from the application
  Scenario: User should LogOut from the application
    Given  User should launch "chrome" browser
    When  User launch the "http://localhost:4200/"
    Then  User enter "admin@gmail.com" and "admin123"
    And  User click on Sign in Button
    And verify the title of the page "Portal | College Bag"
    And User click on Sign Out from navigation Panel
    And Close the driver