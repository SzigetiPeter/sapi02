Feature: Check if the date entry works
	As Sapientia scrum tool user I want to be able to add start and end dates to the story

   Scenario: Give right dates
   Given I add a new story
   When I enter "2015-06-01 07:35" in  the start date datebox and I push the add button
   Then I should get result entry "2015-06-01 07:35" in new stories list