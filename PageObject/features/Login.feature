@Login
Feature: Login to salesforce application as a user

@TC1_login_As_Test_User
Scenario: Login as Test user
Given I navigaet to salesforce login page through chrome browser "https://login.salesforce.com/?locale=in"
Then I see username and Password textbox
Then I see login button
When I enter username "Test" and password "password"
When I click login button
Then I see salesforce homepage

@TC2_login_As_Admin_User
Scenario: Login as Admin user
Given I navigaet to salesforce login page through chrome browser "https://login.salesforce.com/?locale=in"
Then I see username and Password textbox
Then I see login button
When I enter Username "Admin" and password "password"
When I click login button
Then I see salesforce homepage