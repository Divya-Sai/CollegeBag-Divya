Feature: Add a new Student in the ist
  Scenario: User should successfully add a new Student
    Given  User should launch "chrome" browser
    When  User launch the "http://localhost:4200/"
    Then  User enter "admin@gmail.com" and "admin123"
    And  User click on Sign in Button
    And verify the title of the page "Portal | College Bag"
    And User click on "Students" from navigation Panel
    And user should add a new Student with  course type "Master of Computer Science"
    Then  FirstName as "Divya" LastName as "Bugatha"
    And  click on gender as "Female"
    And Close the driver