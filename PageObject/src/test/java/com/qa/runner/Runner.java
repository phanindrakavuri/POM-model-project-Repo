package com.qa.runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "D:\\shiva\\PageObject\\features\\Login.feature",
   glue = {"com.qa.stepdefinitions" },
    format = {"pretty", "html:test-output/htmlReport", "json:test-output/jsonReport/jsonReport.json",
    		"junit;test-output/xmlReport/xmlReport.xml", "reurn:target/rerun.txt"},// To generate the different type of reports
    monochrome = true,// disply the console output in a proper manner
    strict =false,
    dryRun = false,
    tags ="@Login"
		)



public class Runner {

}
