Feature: Visit website sandbox.deltapath.com

	Background:
				Given User on the Login page
		    When Login with credential
		    		|User     |Pass     |
		    		|hikeqa   |q56wz5EH |
				Then User should be on dashboard page
	
  Scenario: User can login and logout successfully
		  	#Given User on the dashboard page
		    Given 	User logout successfully
		   	And Close browser
  
  Scenario: User can Add New Contact on the phonebook
		    Given User click on menu link
		   	And User click on phonebook link
		   	And User click on add contact button
		   	And User click on page maximize
		   	And User Enter Some Details
		   			|fName |lName |fNameP | lNameP |otherName 							|nameTitle |company | dept  | jobTitle         | phoneNo  |  mobNo     |  otherNo  |  sms1  |sms2      | fax     |Email 					 | location |
		   			|mike	 |tyson	|mike 	| tyson  |Michael Gerard Tyson  	|Mr.       |hikeqa  |testing| Sr. Test Engineer|1234567890| 1234567891 | 1234567892|   91   |1234567890|123456789|test@yopmail.com | delhi    |
		   	And User click on ok button
		   	Then User should validate add successful popup message 
		   	And User click on OK button
		   	And Close browser
   	
   Scenario: User can Modify Contact on the phonebook
		    Given User click on menu link
		   	And User click on phonebook link
		   	And User click on firstName checkBox
		   			|fName  |
		   			|mike |
		   	And User click on modify link
		   	And User click on maximize Modify page
		   	And User modify firstName
		   			|fName  	|
		   			|Michael  |
		   	And User click on ok button
		  	Then User should validate update successful popup message 
		   	And User click on OK button
		   	And Close browser
		   	
   Scenario: User can remove Contact on the phonebook
		    Given User click on menu link
		   	And User click on phonebook link
		   	And User click on firstName checkBox
		   			|fName 		|
		   			|Michael  |
		   	And User click on Remove link
		   	And User click on remove contact button
		   	Then User should validate remove successful popup message
		   	And User click on remove button 	
		   	And Close browser