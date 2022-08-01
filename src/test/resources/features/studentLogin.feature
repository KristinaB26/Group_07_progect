Feature: Student Login


  @B26G7-54 @B26G7-52 @LibraryCT
  Scenario: Students verify 2 models on page
    Given user is on the loginPage
    Then verify that the URL is "https://library2.cydeo.com/login.html"
    When student enters valid email address and password
    And student click sign in button
    Then verify that there are "2" models on the page

