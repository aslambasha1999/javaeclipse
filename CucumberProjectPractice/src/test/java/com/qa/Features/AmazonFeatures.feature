Feature: Amazon Search Functionality validations

  Background: Setting the Chrome Browser for testing
    Given setup the Browser

  Scenario: Searching for the Book in Search Box
    Given User should be present on Amazon.in page
    When User Selects the category and Select Books as category
    And User Enters the Vince code  Book on search Box
    And Hits the Search button
    Then validate the Results count
    And Close the Browser
