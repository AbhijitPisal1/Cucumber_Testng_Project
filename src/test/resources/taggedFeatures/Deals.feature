@PhaseOne
Feature: Deals CRUD Management

Background: user login 
Given User is logged in

@SmokeTest
Scenario: Create a new Deal
	When User create a new Deal
	
@RegressionTest
Scenario: View a Deal
	When User views Deals details
	
Scenario: Delete a Deal
	When User delete a Deals
	
	## Background ##
	# Defined in: .feature file (Gherkin)
	# Purpose: Shared steps for all scenarios in a feature
	# Runs: Before each scenario in that feature
	# Visibility: Shown in reports (business-readable)
	
	## Before Hook ##
	# Defined in: Step definition code (e.g., JS, Java, Ruby)
	# Purpose: Technical setup before each scenario (e.g., clean DB, start browser)
	# Runs: Before each scenario (globally or with tag filters)
	# Visibility: Hidden from feature file/reports