Feature: deal with leaftaps login 

Background:
Given launch the browser
And load the url
And set wait
And maximize the browser


Scenario Outline: login positive


And enter username as <username> 
And enter password as <password>
When click the login button
Then close the browser

Examples:
|username|password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|

Scenario: Login negative
And enter username DemoSales 
And enter password CRMSFA
But click loginbutton


