Feature: W3SCHOOLS
Scenario: Login_For_W3Shools
Given w3schools login Page
And enter email 
And enter password
And click login
Then I logout


Scenario: verify validate tutorial
Given I am at the w3schools home page to login as prerequsite
And I click on tutorials
And I click on learn html
And I click on next 


