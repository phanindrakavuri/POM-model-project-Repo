@Login
Feature: ILogin to salesfoe=rce application as a user

Background:
  Given I navigate to salesforce login page through chrome browser "https://login.salesforce.com/?locale=in"
  Then I see username and password textbox
  Then I see login button
  When I enter username <username> and password <password>
     |username |password|
     |Test     |password|
     |Admin    |password|
     When I click login button
     
     
     
     @TC1_Login_As_TEst_User
     Scenario:Login as Test user
     Then I see salesforce Testuser home page
     
     
     @TC2_Login_As_Admin_User
     Scenario: Login as Admin user
     Then I see salesforce AdminUser homePage
        