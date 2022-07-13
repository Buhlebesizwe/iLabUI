package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features", glue = "stepDefinitions",
        monochrome = true,plugin = {"pretty","html:target/test_reports/html/cucumber.html",
        "json:target/test_reports/json/cucumber.jason"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
