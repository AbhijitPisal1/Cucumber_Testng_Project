@PhaseTwo
Feature: Tasks CRUD Management

@SmokeTest
Scenario: Create a new Tasks
	Given User is logged in
	When User create a new Tasks
	
Scenario: View a Tasks
	Given User is logged in
	When User views Tasks details
	
Scenario: Delete a Tasks
	Given User is logged in
	When User delete a Tasks