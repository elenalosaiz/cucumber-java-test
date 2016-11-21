
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

/**
 * Created by elena on 25/08/16.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
                    features = { "src/test/resources/features"},
                    plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"}
                    //tags = {"@HappyPath", "@ErrorPath"}

                )

public class TestRunner {
}
