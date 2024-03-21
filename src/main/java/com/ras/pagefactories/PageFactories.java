package com.ras.pagefactories;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.ras.pages.HomePage;
import com.ras.pages.LoginPage;

/**
 * @author Hemajyothi
 * @description We use PageFactory for Page Factory pattern to initialize
 *              WebElements which are defined in Page Objects
 */

public class PageFactories {

	private static final Logger logger = Logger.getLogger(PageFactories.class);
	private LoginPage loginPage;
	private HomePage homePage;
	private WebDriver driver;

	/***
	 * Constructor
	 * 
	 * @param driver an instance of WebDriver
	 */

	public PageFactories(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @description Create object of LoginPage Class
	 * @return Instantiate the LoginPage Class
	 */

	public LoginPage getLoginPage() {
		logger.info("Initializing LoginPage");
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}

	public HomePage getHomePage() {
		logger.info("Initializing HomePage");
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

}
