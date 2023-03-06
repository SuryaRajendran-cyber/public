
Feature: Feature to test login functionality

@login&logout
      Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    And user is navigated to home page
    And clicks on profile button
    And clicks on sign out 
    Then user is navigated back to login page
    
    Examples:
    |username | password |
    |infodba | infodba |
 #@loginfileupload
      #Scenario: Check login is successful with valid credentials
    #Given user is on login page
    #When user enters <username> and <password>
    #And clicks on login button
    #And user is navigated to home page
    #And user uploads file
    #Then file should upload
    #
    #Examples:
    #|username | password |
    #|infodba | infodba |
    


  
