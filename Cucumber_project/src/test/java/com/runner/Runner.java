package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//main//resources//Features",
glue= {"com.stepDefinition"},
monochrome=true,
plugin = { "pretty", "html:Reports/cucumber-reports/htmlreports.html"}
)
public class Runner {
		
	
}
