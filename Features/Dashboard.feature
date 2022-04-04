Feature: Validate the Students table
  Scenario: Get the value of year and No of Student in Students table
    Given  User should launch "chrome" browser
    When  User launch the "http://localhost:4200/"
    Then  User enter "admin@gmail.com" and "admin123"
    And  User click on Sign in Button
    And verify the title of the page "Portal | College Bag"
    And User click on "Dashboard" from navigation Panel
    And fetch the values from the tables in Dashboard
    And Close the driver


