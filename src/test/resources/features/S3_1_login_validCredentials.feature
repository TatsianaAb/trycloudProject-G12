Feature: As a user, I should be able to log in.

  @validcredentials
  Scenario Outline: Verify login with valid credentials
    Given User is on the login page "http://qa2.trycloud.net/index.php/login"
    When User uses username "<username>" and password "<password>"
    And User clicks the login button
    Then Verify the user should be at the dashboard page. User sees "Dashboard" in the title


    Examples: Valid login credentials
      | username | password    |
      | user7    | Userpass123 |
      | user34   | Userpass123 |
      | user99   | Userpass123 |
      | User12   | Userpass123 |
      | User42   | Userpass123 |
      | User72   | Userpass123 |
      | User102  | Userpass123 |