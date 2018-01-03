package steps_definition;


import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import steps_definition.Hooks;

import java.io.IOException;
import java.net.MalformedURLException;


/**
 * Created by elena on 25/08/16.
 */
public class navigationSteps {

    public WebDriver driver;

    public navigationSteps() throws MalformedURLException {
       driver = Hooks.driver;
    }

    @Given("^user navigates to the url$")
    public void homeScreen() throws Throwable {
        driver.get("https://cucumber.io/");

    }
}
