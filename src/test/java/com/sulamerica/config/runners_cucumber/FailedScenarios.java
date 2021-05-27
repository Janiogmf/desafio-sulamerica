package com.sulamerica.config.runners_cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, 
                 monochrome = true,
                 features = "@target/cucumber-reports/rerun.txt", // Cucumber cenarios com falha
                 glue = { "com.sulamerica.steps_definitions", "com.sulamerica.config.hooks" },
		         plugin = { "pretty", "json:target/cucumber-reports/cucumberRerun.json" }
		        )
public class FailedScenarios {

}
