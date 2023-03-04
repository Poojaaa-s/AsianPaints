Feature:Asian_Paints PaintsAndColors

  Scenario: Load Paint and Colours Section
		Given I am on the Asian Paints Website
		When I click on the Paint and Colours  link in the navigation menu 
		Then the Paint and Colours section should load without errors
		
	Scenario: Navigate to interior textures page
 		Given I am on the Asian Paints Website
		When I click on the Interior Textures
 		Then I should be taken to the interior textures page
 
 	Scenario: Navigate to exterior textures page
 		Given I am on the Asian Paints Website
		When I click on the Exterior Textures
 		Then I should be taken to the exterior textures page
 
	Scenario: Navigate to wood paints page
 		Given I am on the Asian Paints Website
 		When I click on the Wood Paints
		Then I should be taken to the wood paints page
 
 
	Scenario: Navigate to metal paints page
 		Given I am on the Asian Paints Website
 		When I click on the Metal Paints
 		Then I should be taken to the metal paints page
 