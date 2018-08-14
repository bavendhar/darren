Feature: deal with createlead 

Scenario: 
	Given launch browser 
	And load url 
	And set implicitlyWait
	And maximiz browser 
	
	And enter the username as <usernamek> 
	And enter the password as <passwordk> 
	When click login button
	When click crmsfa link
	When click leads link 
	When click createlead link
	And enter companyname as <companyname> 
	And enter firstname as <firstname> 
	And enter lastname as <lastname> 
	When click create button 
	Then close the browser window 
	
	Examples: 
	|usernamek|passwordk|companyname|firstname|lastname|
	|DemoSalesManager|crmsfa|tcs|bav|p|
	
