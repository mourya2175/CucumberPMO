package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"@target/rerun.txt"},        // Path to rerun.txt, which contains the failed scenarios
    glue = {"steps"},                        // Path to step definitions
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
        "json:target/cucumber-reports/Cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    }
)
public class FailedRunner extends AbstractTestNGCucumberTests {
    // This will re-run only failed scenarios from rerun.txt
}

