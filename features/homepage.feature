Feature: Home Page Scenarios

  Scenario: Launch Home Page
    Given I launch the browser
    When I paste home page URL
    Then The application redirects to welcome page

  Scenario: Click on Register Button
    Given I am on home page
    When I click on Register button
    Then I am taken to register page
