Feature: Automation for smartt bear application 


@selenium

Scenario: logins

 Given open the browser
When naviage into the application 
|url|
|http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx|

When i enter username and password
|username|password|
|Tester|test|

And click login 
Then verify login is sucess
