Feature: Error message when login with invalid credentials

	@B26G7-55 @B26G7-52 @LibraryCT
	Scenario:  Verifying error message "Sorry, Wrong Email or Password"
		Given user is on the loginPage
		
		When user enters invalid email address or password
		
		And user click sign in button
		
		Then verify the error message "Sorry, Wrong Email or Password"