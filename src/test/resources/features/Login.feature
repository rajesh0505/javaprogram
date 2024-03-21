Feature: Login feature  

Background:
Given User Enters URL
	 @Smoke @Regression
  Scenario Outline: Verify the Login functionality with valid Username and Valid Password
    Given User enters valid UserName
    And Enters valid Password
    When Clicks on Login button
    Then Verify User logged in and navigates to Homepage or not
   # Examples:
   #|UserName											|Password			|
   #|superadmintest@spsoft.in			|Admin@12345	|
   #|testuser29071@gmail.com			|Admin@12345	|
   #|hemajyothimarturu25@gmail.com|Admin@12345	|   
   #|chandudmfortest@gmail.com		|Admin@12345	|
   #|chandurcfortest@gmail.co			|Admin@12345	|    
  @Regression
  Scenario: Verify the Login functionality with blank Username and blank Password
 	 When Clicks on Login button
   Then Verify Username and password fields highlighted in red colour or not
	@Regression
  Scenario: Verify the login functionality with blank Username and valid Password
   And Enters valid Password
   When Clicks on Login button
   Then Verify Username field is getting highlighted in red color or not   
  @Regression
	Scenario: Verify the login functionality with valid Username and blank Password
   Given User enters valid UserName
   When Clicks on Login button
   Then Verify Password field is getting highlighted in red color or not
  @Regression
  Scenario: Verify the eye icon is working or not
 	 And Enters valid Password
   When Clicks eye icon
   Then Verify Password field text is getting visible or not
   
   
   
      
   
   