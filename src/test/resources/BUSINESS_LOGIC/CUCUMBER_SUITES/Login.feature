Feature: Login Feature

Background: user is successfully logged in
Given user opens "chrome" browser with exe "F:\\Banking Project Maven\\PrimusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
Given user enters url "http://primusbank.qedgetech.com/"



Scenario: Login functionality for valid username and valid password

When user enters "Admin" as username 
When user enters "Admin" as password
When user click on login button
Then user is on "Admin" page and get message as Welcome to Admin




