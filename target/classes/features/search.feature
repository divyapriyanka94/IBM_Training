Feature: Search

@smoke
Scenario: Testing multiple scenario caase1
	Given test multiple scenario case1
	
@smoke
Scenario: Testing multiple scenario caase2
	Given test multiple scenario case2

@regression
Scenario: Validate search functionality
	Given user is in search page
	When user enters "<product>" product
	And click on search button 
	Then product "<product>" should be displayed
	Examples
		| product |
		| iPhone  |
		| MacBook Air |
		| MacBook Pro |