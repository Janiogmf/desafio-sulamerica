package com.sulamerica.config.hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.sulamerica.config.browser_factory.DriverFactory;
import com.sulamerica.config.browser_factory.DriverType;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ReportFactoryTest {
	public static WebDriver driver;

	@Before
	public void beforeMethod(Scenario cenario) {
		if (cenario.getSourceTagNames().contains("@Web")) {
			driver = DriverFactory.getDriver(DriverType.CHROME);
		}
	}

	@After
	public void afterCenario(Scenario cenario) {
		if (cenario.getSourceTagNames().contains("@Web")) {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			DriverFactory.quitDriver();
		}
	}
}
