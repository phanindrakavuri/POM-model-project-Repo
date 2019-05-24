package com.qa.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utility.DriverManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	WebDriver driver;
	
	
	 @Given("^I navigaet to salesforce login page through chrome browser \"([^\"]*)\"$")
	    public void loginApplication(String appUrl) throws Throwable {
	       driver = DriverManager.getDriver("chrome");
	       driver.get(appUrl);
	       driver.manage().window().maximize();
	       driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    }

	    @When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void EnterTextBox(String username, String password) throws Throwable {
	        driver.findElement(By.id(LoginPage.usernmae_ID)).sendKeys(username);
	        
	        driver.findElement(By.id(LoginPage.password_ID)).sendKeys(password);
	    }

	    @When("^I click login button$")
	    public void loginButton() throws Throwable {
	        driver.findElement(By.xpath(LoginPage.Login_xpath)).click();
	    }

	    @Then("^I see username and Password textbox$")
	    public void inputCredentialsVerificaton() throws Throwable {
	        if(driver.findElement(By.id(LoginPage.usernmae_ID)).isDisplayed())
	        {
	        	System.out.println("User name text box exists in login page");
	        }
	        else if (driver.findElement(By.id(LoginPage.password_ID)).isDisplayed())
	        {
	        	System.out.println("password text box exists in login page");
	        }
	    }

	    @Then("^I see login button$")
	    public void loginbuttonVerification()  {
	    	 if(driver.findElement(By.id(LoginPage.Login_xpath)).isDisplayed())
		        {
		        	System.out.println("Login Button exists in login page");
		        }
	    }

	    @Then("^I see salesforce homepage$")
	    public void homepageVerification() throws Throwable {
	    	 if(driver.findElement(By.id(HomePage.homePage_Icon_ID)).isDisplayed())
		        {
		        	System.out.println("homepage icon  is visible");
		        }
	    }
}
