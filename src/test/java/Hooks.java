package steps_definition;
/**
 * Created by elena on 25/08/16.
 */

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Hooks {

    public static WebDriver driver;

    @Before

    public void openBrowser () {

        System.setProperty("webdriver.gecko.driver", "./cucumber-java-test/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().fullscreen();

    }

    @After

    public void closeBrowser(){
        driver.quit();
    }


}
