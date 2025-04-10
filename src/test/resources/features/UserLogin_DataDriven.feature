Feature: User Login Function with Outline and examples

#Scenario Outline: Valid Login Admin data driven
#	Given User is on Login Page
#	When User enters "<username>" and "<password>"
#	Then Should display the success message
#
#Examples:
# | username | password |
# | tomsmith | SuperSecretPassword! |
# | tomsmith | SuperSecretPassword12 |
# | tomsmith12 | SuperSecretPassword! |
 
#Scenario: Valid Login DataTable
 #	Given User is on Login Page
 #	When User provides credentials
 #	| tomsmith | SuperSecretPassword! |
 #	Then Should display secure message
 #	|You logged into a secure area!|
 	
 	
Scenario: Valid Login DataTable Maps
 	Given User is on Login Page
 	When User provides login credentials
 	| username | password |
 	| tomsmith | SuperSecretPassword! |
 	Then Should display secure message
 	|You logged into a secure area!|