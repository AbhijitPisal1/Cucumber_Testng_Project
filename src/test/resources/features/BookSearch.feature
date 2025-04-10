Feature: Book Search for danube-webshop 
URL : https://danube-webshop.herokuapp.com/
Categories : Novels & Stories, Crime & Thrillers, Horror, Fantasy

Scenario: Novels & Stories Search Test
Given User is on Home Page
When User search Novels & Stories
Then Should display the novel result page

Scenario: Crime & Thrillers Search Test
Given User is on Home Page
When User search Crime & Thrillers
Then Should display the Crime & Thrillers result page

#Scenario: Horror Search Test
#Given User is on Home Page
#When User search Horror
#Then Should display the Horror result page
#
#Scenario: Fantasy Search Test
#Given User is on Home Page
#When User search Fantasy
#Then Should display the Fantasy result page
