Feature: Default

	@B26G7-53 @B26G7-52 @LibraryCT
	Scenario: Librarian verify 3 models on page
		Given user is on the loginPage
		Then verify that the title is "Login - Library"
		When librarian enters valid email address and password
		And librarian click sign in button
		Then verify that there are 3 models on the page