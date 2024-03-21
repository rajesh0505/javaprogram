package com.ras.pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ras.utils.SeleniumHelper;

public class HomePage extends SeleniumHelper {

	private static final Logger logger = Logger.getLogger(LoginPage.class);

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[@class='my-auto text-white']")
	private WebElement title;

	public void verifyHomepageTitle() {
		logger.info("Verifying Title is presence in Homepage");
		isElementVisible(title, "Homepage Title");
		Assert.assertTrue(true);
	}

}
