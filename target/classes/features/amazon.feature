#Author: joshinavraj@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Amaizon Automation
  This application is only for Demo purpose.
 
  @tag1
  Scenario: Title of your scenario
    Given I open "chrome" browser and I Go to "https://www.amazon.ca" site     
    When I Click on hamburger menu (top left corner)
    And I Select Kindle under Digital Content and Devices
    And I Click Kindle under Kindle E-Reader
    And I Click Buy Now button
    Then I Verify User is asked for email or mobile number
    And I verify there is userId text box
    And I closed the browser
    
    @tag2
  Scenario: Second Scenario Using firefox browser
    Given I open "Firefox" browser and I Go to "https://www.amazon.ca" site     
    When I Click on hamburger menu (top left corner)
    And I Select Kindle under Digital Content and Devices
    And I Click Kindle under Kindle E-Reader
    And I Click Buy Now button
    Then I Verify User is asked for email or mobile number
    And I verify there is userId text box
    And I closed the browser


