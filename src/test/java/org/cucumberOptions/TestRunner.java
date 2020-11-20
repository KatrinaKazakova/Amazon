package org.cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/cucumberFeatures",
        glue="cucumberStepDefinitions"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}