Feature: End to End Testing of Web Application

 
  @Register
  Scenario: Verify Create an a Account in Application
    Given User Launch Application
    When Click Sigin button
    And Provide Address
    Then Click Create an Account Button
    And Fill all personal Details
    Then Click Register Button
    
  @Smoke_Test  
	Scenario Outline: Verify Login Functionality 
	  Given User Launch Application
    When Click Sigin button
    Then Provide "<Email>" Email Address
    And Provide "<Password>" Password 
    Then Click Sigin and Verify 
    
    Examples: 
|    Email 							| Password		|
|	aaab12@ 							| Imran@1998	|
|	mailtoimmu@gmail.com	| admin@123		|
|	admin123a@gamil.com 	| abcd111			|
|	mailtoimmu@gmail.com	| Imran@1998	|
    
    



