package steps_definition;
/**
 * Created by elena on 25/08/16.
 */

import java.lang.String;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.net.MalformedURLException;


public class Hooks {

    public static WebDriver driver;

    @Before
    public void openBrowser () throws MalformedURLException{
        String browser = System.getProperty("BROWSER");
        if(browser==null)
        {
            browser = System.getenv("BROWSER");
            if(browser==null)
            {
                browser= "chrome";
            }
        }
        switch (browser)
        {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        System.out.println("Opening Browser...."+browser);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @After

    public void closeBrowser(){
        driver.quit();
    }


}
