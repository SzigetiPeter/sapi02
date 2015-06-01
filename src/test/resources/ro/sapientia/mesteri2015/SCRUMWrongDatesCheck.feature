Feature: Check if the date entry works
	As Sapientia scrum tool user I want not to be able to add wrong start and end dates to the story

   Scenario: Give wrong dates
   Given I add a new story with wrong dates
   When I enter "2015-50 07:35" in  the start date date box after I push the add button
   Then I should get sent to edit boxes