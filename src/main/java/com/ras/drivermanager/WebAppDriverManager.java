package com.ras.drivermanager;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.ras.utils.PropertyFileLoader;

/**
 * @name : WebDriverManager
 * @author Hemajyothi
 * @description Webdriver initialization and managing the properties of the
 *              webdriver
 *
 */
public class WebAppDriverManager {

	private static WebDriver driver;

	private static Map<String, WebDriver> drivers = new HashMap<>();

	private static final Logger logger = Logger.getLogger(WebAppDriverManager.class);

	/**
	 * @name : getDriver
	 * @description initializing the driver and returns the webdriver instance
	 * @return - WebDriver
	 */

	public static WebDriver getDriver() {
		String driverType = PropertyFileLoader.getConfigInstance().getConfigValue("browser");
		logger.info("Initializing Driver :" + driverType);

		switch (driverType) {
		case "Chrome":
			driver = drivers.get("Chrome");
			if (driver == null || driver.toString().contains("(null)")) {

//				ChromeOptions options = new ChromeOptions();
//				options.addArguments("--incognito");
//				options.addArguments("--headless");
//				options.addArguments("--disable-gpu");								
				driver = new ChromeDriver();
				drivers.put("Chrome", driver);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					logger.error("InterruptedException:: getDriver :" + e.getMessage());
				}
			}
			break;
		case "Edge":
			driver = drivers.get("edge");
			if (driver == null || driver.toString().contains("(null)")) {

//				EdgeOptions options = new EdgeOptions();
//				options.addArguments("--incognito");				
				driver = new EdgeDriver();
				drivers.put("Edge", driver);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					logger.error("InterruptedException:: getDriver :" + e.getMessage());
				}
			}
			break;

		case "Firefox":
			driver = drivers.get("firefox");
			if (driver == null || driver.toString().contains("(null)")) {

//				FirefoxOptions options = new FirefoxOptions();
//				options.addArguments("--incognito");

				driver = new FirefoxDriver();
				drivers.put("Firefox", driver);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					logger.error("InterruptedException:: getDriver :" + e.getMessage());
				}
			}
			break;

		default:
			break;
		}
		return driver;
	}

	/**
	 * @name : closeDriver
	 * @description close or quit the webdriver
	 * @return - void
	 */
	public static void closeDriver() {
		try {
			if (driver != null)
				driver.quit();
		} catch (Exception e) {
			logger.error("Either Driver is not initialized or closed before" + e.getMessage());
		}
	}

}
