package steps_definition;


import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;



/**
 * Created by elena on 25/08/16.
 */
public class navigationSteps {

    public WebDriver driver;

    public navigationSteps() throws IOException {
       driver = new FirefoxDriver();
    }

    @Given("^user navigates to the url$")
    public void homeScreen() throws Throwable {
        driver.get("https://www.facebook.com/");

    }
}
