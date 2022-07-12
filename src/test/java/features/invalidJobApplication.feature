Feature: Applying for a job without uploading documents

  Scenario Outline: Applying without uploading documents
    Given That user is on iLab homepage
    Then User clicks on careers
    Then User clicks on South Africa
    Then User clicks on the first available job
    When user clicks on Apply Online
    Then User enters  name <First Name:>
    Then User enters email<Email:>
    Then User enters mobile<Mobile Number:>
    And User clicks on Send Application
    And Display error message <errorMes:>

#

    Examples:
     | First Name: | Email: | Mobile Number: |errorMes:|
    | Sizwe       |automationAssessment@iLABQuality.com|0710710177|You need to upload at least one file.|

