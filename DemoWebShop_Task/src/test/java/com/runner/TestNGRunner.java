package com.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
	    plugin = {
	        "pretty",
	        "json:target/cucumber-reports/Cucumber.json",
	        "html:target/cucumber-reports/Cucumber.html",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	        "rerun:target/failedrerun.txt"
	    },
	    features = "C:\\Users\\kirub\\git\\Demo\\DemoWebShop_Task\\src\\test\\resources\\Features",
	    glue = "com.definitions"
	)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}

