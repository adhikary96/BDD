Feature: Personal Registration
		
		Scenario: User is trying to register without entering details
		
		Given User is on the Personal Registration Page
		Then  The page must load with the title 'Step 1: Personal Details'
		
		When User clicks on next without entering First Name
		Then  The page must dispay 'Please fill the First Name'
		
		When User clicks on next without entering Last Name
		Then  The page must dispay 'Please fill the Last Name'
		
		When User clicks on next without entering Email
		Then  The page must dispay 'Please fill the Email'
		
		When User clicks on next without entering Contact No.
		Then  The page must dispay 'Please fill the Contact No.'
		
		When User clicks on next without entering valid Contact No.
		Then  The page must dispay 'Please enter valid Contact no.'
		
		When User clicks on next without entering first address line
		Then  The page must dispay 'Please fill the address line'
		
		When User clicks on next without entering second address line
		Then  The page must dispay 'Please fill the address lines'
		
		When User clicks on next without selecting city
		Then  The page must dispay 'Please select city'
		
		When User clicks on next without selecting state
		Then  The page must dispay 'Please select state'
		
		When User clicks on next after entering all valid details
		Then  The page must dispay 'Personal details are validated and accepted successfully.'
		And 		Navigate to the EducationDetails page
		
		When User is on the Education Details Page
		Then  The page must load with the title 'Step 2: Education Details'
		
		When User clicks on Register Me without selecting Graduation
		Then  The page must dispay 'Please Select Graduation'
		
		When User clicks on Register Me without entering percentage
		Then  The page must dispay 'Please fill Percentage detail'
		
		When User clicks on Register Me without entering Passing year
		Then  The page must dispay 'Please fill Passing Year'
		
		When User clicks on Register Me without entering project name
		Then  The page must dispay 'Please fill Project name'
		
		When User clicks on Register Me without selecting Technologies used
		Then  The page must dispay 'Please Select Technologies Used'
		
		When User clicks on Register Me without entering other Technologies used
		Then  The page must dispay 'Please fill other Technologies Used'
		
		When User clicks on Register Me after entering all valid details 
		Then  The page must dispay 'Your Registration Has succesfully done Plz check you registerd email for account activation link !!!'
		