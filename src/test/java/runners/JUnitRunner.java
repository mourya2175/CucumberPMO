package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to your feature files
    glue = "steps", // Package name of your step definitions
    plugin = {
        "pretty", // Prints Gherkin steps in console
        "html:target/cucumber-reports/cucumber.html", // Generates HTML report
        "json:target/cucumber-reports/cucumber.json", // Generates JSON report
        "rerun:target/rerun.txt" // Captures failed scenarios for rerun
    },
    tags = "@smoke", // Optional: You can specify tags to run specific tests
    monochrome = true // Makes the console output more readable
)
public class JUnitRunner {
}

