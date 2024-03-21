package com.ras.hooks;

import org.apache.log4j.Logger;

import com.ras.drivermanager.WebAppDriverManager;
import com.ras.utils.SeleniumHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	private static final Logger logger = Logger.getLogger(Hooks.class);

	@Before
	public void Before(Scenario scenario) {
		SeleniumHelper.setScenario(scenario);
		
		
		logger.info("************************************************************************");
		logger.info(" Started Working on Scenario : " + scenario.getName());
		logger.info("************************************************************************");
	}

	@After
	public void After(Scenario scenario) {
		SeleniumHelper.setScenario(scenario);

		logger.info("************************************************************************");
		logger.info(" Completed Working on Scenario : " + scenario.getName());
		logger.info("************************************************************************");
		WebAppDriverManager.closeDriver();	
	
	}

}