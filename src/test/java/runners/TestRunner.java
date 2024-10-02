package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;


@CucumberOptions(
    features = {"src/test/resources/features"},       // Path to your feature files
    glue = {"steps"},                                // Package containing step definitions
    plugin = {
        "pretty",                                    // Console output
        "html:target/cucumber-reports.html",         // Basic HTML report
        "json:target/cucumber-reports/Cucumber.json",// JSON report for ExtentReports
        "rerun:target/rerun.txt",                    // Path to store failed scenario files
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // ExtentReports adapter
    },
    tags = "@smoke",                                 // Tags to filter scenarios
    monochrome = true,                               // Clean output
    dryRun = false                                   // Set to false to run tests
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // No need for additional code here. The plugin handles ExtentReports generation.
}


