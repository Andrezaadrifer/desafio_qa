package Steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "Steps" }, monochrome = true, plugin = { "pretty",
		"html:target/HtmlReports/report.html", "json:target/JSONReports/report.json","junit:target/JUnitReports/report.xml" })
public class TestRunner {

}
