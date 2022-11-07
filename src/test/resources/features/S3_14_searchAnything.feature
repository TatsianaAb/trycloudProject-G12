Feature:  As a user, I should be able to search any item/ users from the homepage.

  @searchanything
  Scenario Outline: Verify users can search any files/folder/users from the search box.
    Given user on the dashboard page
    When the user clicks the magnifier icon on the right top
    And users search any existing file, folder, "<searchValue>" or user name
    Then verify the app displays the expected result "<expectedResult>" option

    Examples:
      | searchValue         | expectedResult      |
      | Talk                | Talk                |
      | HelloWoodenSpoon!   | HelloWoodenSpoon!   |
      | SomeFile            | SomeFile            |
      | 20220425_161016.jpg | 20220425_161016.jpg |
      | User52              | User52              |
      | User100             | User100             |