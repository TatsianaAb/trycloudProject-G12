Feature: As a user, I should be able to access to Files module - Favorites button


    @wip
  Scenario Outline: Verify users to add files to Favorites
    Given user uses "<username>" and "<password>" to log in and on the dashboard page
    When the user clicks the "Files" module
    When the user clicks action-icon from any file on the page
    And user choose the "Add to favorites" option
    And user click the "Favorites" sub-module on the left side
    Then Verify the chosen file is listed on the table
      Examples:
        | username | password    |
        | User12   | Userpass123 |
        | User42   | Userpass123 |
        | User72   | Userpass123 |
        | User102  | Userpass123 |