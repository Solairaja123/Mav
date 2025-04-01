Feature: login page automation of oranghrm app
 @smoke
  Scenario: check login successfull and go to admin page
  
    Given user is on login page
    And user enter the username as "Admin"
    And user enter the password as "admin123"
    When user click  the login button
    And user is go to user PIM page
    And user is go  to the add employee
    And user is add the detail of the user 
    And user is save the detail 
    And user is go to the admin page
    And Verifying the userdetail
    
