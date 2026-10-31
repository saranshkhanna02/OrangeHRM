package Base;
import Utilities.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase {
    protected static WebDriver driver;

    private static void getDriver(String browserName) {
        if (browserName.equalsIgnoreCase("chrome"))
        {
//            System.setProperty("webdriver.chrome.driver", TestUtils.WorkspacePath + "/src/Driver/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        }
        else if (browserName.equalsIgnoreCase("firefox")){
//            System.setProperty("webdriver.gecko.driver", TestUtils.WorkspacePath + "/src/Driver/geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            driver = new FirefoxDriver(options);
        }
    }

    protected static void initialization(String browserName, String URL){
        getDriver(browserName);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.PAGE_LOAD_TIMEOUT));
        driver.get(URL);
    }

    @Parameters({"URL"})
    @BeforeSuite(alwaysRun = true)
    public void setup(String url){
        String browserName = System.getProperty("browser");
        initialization(browserName, url);
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    // Public getter so Page Objects can obtain the shared driver from TestBase
    public static WebDriver getDriver() {
        return driver;
    }
}
