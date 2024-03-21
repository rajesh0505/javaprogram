package com.ras.pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ras.utils.SeleniumHelper;

public class LoginPage extends SeleniumHelper {

	private static final Logger logger = Logger.getLogger(LoginPage.class);

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "emailId")
	private WebElement emailId;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(xpath = "//button[contains(text(),'LOGIN')]")
	private WebElement loginBtn;
	@FindBy(xpath = "//button[@class='btn ngx-show-hide-password btn-secondary']")
	private WebElement eyeIcon;
	@FindBy(xpath = "//label[@class='forgotPwd pointer']")
	private WebElement forgotPwdLink;
	@FindBy(id = "rememberMeId")
	private WebElement rememberMe;
	@FindBy(xpath = "(//div[@class='text-danger'])[1]")
	private WebElement emailRedLine;
	@FindBy(xpath = "//show-hide-password/following-sibling::div")
	private WebElement passwordRedLine;

	public void setUserName(String email) {
		logger.info("Entering User name");
		enterText(emailId, email,"");
	}

	public void setPassword(String pwd) {
		logger.info("Entering Password");
		enterText(password, pwd,"");
	}

	public void clickLogin() {
		logger.info("Clicking Login Button");
		click(loginBtn, "Login button");
	}
	
	public void clickEyeIcon() {
		logger.info("Clicking Eye Icon");		
		click(eyeIcon, "Eye Icon");		
	}
	
	public void clickForgotPassword() {
		logger.info("Clicking Forgot Password");
		click(rememberMe, "ForgotPassword link");
	}
	
	public void clickRememberMe() {
		logger.info("Clicking Remember Me");
		click(eyeIcon, "Remember Me");
	}
	
	public void verifyUsernameRedLineExists() {
		logger.info("Verifying Username RED line is present in LoginPage");
		Assert.assertTrue(isExists(emailRedLine));
	}
	
	public void verifyPasswordRedLineExists() {
		logger.info("Verifying Password RED line is present in Homepage");
		Assert.assertTrue(isExists(passwordRedLine));
	}
}
