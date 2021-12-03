package com.qa.TestRunnners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\qa\\Features\\AmazonFeatures.feature",
glue= {"com.qa.StepDefinations"},
dryRun=false,
strict=true,
plugin={"pretty","html:test-output.html"},
monochrome=true
//plugin = {"json:target/JSONReports/cucumber.json"}
//plugin= {"pretty","html:target/HTMLReports/HtmlReport.html"}//,tags="@Smoke"
//plugin={"pretty","json:target/JSONReports/JSONReports.json"}
//plugin={"pretty","junit:target/JUNITReports/JunitReports.xml"}
)


public class AmazonTestRunner {
	


}
