package com.ras.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.ras.drivermanager.WebAppDriverManager;
import com.ras.pagefactories.PageFactories;
import com.ras.pages.HomePage;
import com.ras.pages.LoginPage;
import com.ras.utils.PropertyFileLoader;
import com.ras.utils.SeleniumHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	WebDriver driver = WebAppDriverManager.getDriver();
	PageFactories pagefactory = new PageFactories(driver);
	SeleniumHelper seleniumHelper = new SeleniumHelper(driver);	
	LoginPage loginPage=pagefactory.getLoginPage();
	HomePage homePage=pagefactory.getHomePage();

		@Given("^User Enters URL$")
		public void user_enters_url() throws Throwable {
			driver.get(PropertyFileLoader.getConfigInstance().getqaURL());				
		}
	
		@Given("^User enters valid UserName$")
	    public void user_enters_valid_username() throws Throwable {
			loginPage.setUserName(PropertyFileLoader.getConfigValue("superadminEmail"));	        
	    }
		@And("^Enters valid Password$")
		public void enters_valid_password() throws Throwable {	        
			loginPage.setPassword(PropertyFileLoader.getConfigValue("superadminPassword"));		    	
		}

	    @When("^Clicks on Login button$")
	    public void clicks_on_login_button() throws Throwable {
	    	loginPage.clickLogin();
	    }

	    @Then("^Verify User logged in and navigates to Homepage or not$")
	    public void verify_user_logged_in_navigates_to_homepage_or_not() throws Throwable {
	    	homePage.verifyHomepageTitle();	    	
	    }
	    
	    @Then("^Verify Username and password fields highlighted in red colour or not$")
	    public void verify_username_and_password_fields_highlighted_in_red_colour_or_not() throws Throwable {
	    	loginPage.verifyUsernameRedLineExists();
	    	loginPage.verifyPasswordRedLineExists();
	    }
	    
	    @Then("^Verify Username field is getting highlighted in red color or not$")
	    public void verify_username_field_is_getting_highlighted_in_red_color_or_not() throws Throwable {
	    	loginPage.verifyUsernameRedLineExists();
	    }
	    
	    @Then("^Verify Password field is getting highlighted in red color or not$")
	    public void verify_password_field_is_getting_highlighted_in_red_color_or_not() throws Throwable {
	    	loginPage.verifyUsernameRedLineExists();
	    }
	    
	    @When("^Clicks eye icon$")
	    public void clicks_eye_icon() throws Throwable {
	    	loginPage.clickEyeIcon();
	    }

	    @Then("^Verify Password field text is getting visible or not$")
	    public void verify_password_field_text_is_getting_visible_or_not() throws Throwable {
	        
	    }

}
