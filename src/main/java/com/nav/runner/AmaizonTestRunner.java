package com.nav.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:features/amazon.feature",
				
		glue= {"com/nav/stepDefinitions"},// provide the package of step definition files
		dryRun=false,// false for running test
//		tags = "@addSingleUserByCS",//"@addSingleUser",//" @userNoAllowChangePassword",
		plugin = {"pretty","json:test-output/cucumber.json",
				"html:test-output/openText.html" //This makes html report in the test-output folder
				
				}
		
		)
public class AmaizonTestRunner {

}
