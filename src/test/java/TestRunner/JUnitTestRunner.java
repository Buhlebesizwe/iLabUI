package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions",
        stepNotifications = true, plugin = {"pretty","html:target/test_reports/html/cucumber.html",
        "json:target/test_reports/json/cucumber.jason"})

public class JUnitTestRunner {


}
