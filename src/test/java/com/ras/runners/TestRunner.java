package com.ras.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "src/test/resources/features/Login.feature" }, glue = { "com.ras.stepdefinitions",
		"com.ras.hooks" }, plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/ras_html_reports", "json:target/ras_results.json",
				"pretty:target/ras_pretty_results.txt", "usage:target/ras_usage_results.json",
				"junit:target/ras_results.xml", }, dryRun = false,
				monochrome = true)

public class TestRunner {
	
}