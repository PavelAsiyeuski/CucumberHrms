package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features= "src/test/resources/features/",
		glue="com/hrms/steps",
		dryRun=false,  //if set to true it will quickly scan that all gherkin steps have implementation code
		monochrome=true,
		tags= {"@smoke","@sprint12"}
		
		)



public class TestRunner {
	
}
