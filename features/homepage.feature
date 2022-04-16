Feature: Home Page Scenarios

  Scenario: Launch Home Page
    Given I launch the browser
    When I paste home page URL
    Then The application redirects to welcome page
