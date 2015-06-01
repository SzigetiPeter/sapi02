Feature: Check if delete entry works
	As Sapientia scrum tool user I want to be able to delete a story

   Scenario: Delete story
   Given I select an existing story
   When I press the delete button
   Then I should see the updated story list