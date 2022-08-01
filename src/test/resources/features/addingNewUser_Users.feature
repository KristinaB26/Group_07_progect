Feature: Default

	#Test Case for adding a new user as a librarian from Users Module
	@B26G7-57 @B26G7-52 @LibraryCT
	Scenario: Librarian should be able add a new user from Users Module
		Given librarian is on the homePage 
		When librarian click Users module 
		And librarian click “+Add User” button 
		When librarian enter full name, password, email and address 
		And librarian click save changes 
		Then verify a new user is created