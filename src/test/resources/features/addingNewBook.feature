Feature: Adding new Book

	#Test case for adding a new book as a librarian from Book Module
	@B26G7-59 @B26G7-52 @LibraryCT
	Scenario: Librarian should be able to add a new user from Books Module
		Given librarian is on the homePage 
		When librarian click Books module 
		And librarian click "+Add Book” button 
		When librarian enter BookName, ISBN, Year, Author, and Description
		And librarian click save changes 
		Then verify a new book is added