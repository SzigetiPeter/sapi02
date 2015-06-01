Feature: Check if empty date entry works
	As Sapientia scrum tool user I want not to be able to add empty start and end dates to the story

   Scenario: Give empty dates
   Given I add a new story with empty dates
   When I enter nothing "" in the start date datebox first 
     And enter nothing "" I push the add button
   Then I should get sent to edit boxes because no date was defined