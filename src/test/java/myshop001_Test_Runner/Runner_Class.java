package myshop001_Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)

@CucumberOptions(features="src//test//java//myshop001_Feature",glue="\\myshop001_Stepdefinition",
               dryRun= false, monochrome=false,
               tags = "@Smoke_Test",
               plugin = { "pretty",
            		   "json:target/cucumber-reports/cucumber.json",
            		   "html:target/cucumber-reports/cucumberreport.html",})

public class Runner_Class {
	
	}
