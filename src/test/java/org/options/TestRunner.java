package org.options;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/features",
        glue="org/stepDefinitions"
)

public class TestRunner  extends AbstractTestNGCucumberTests{
}