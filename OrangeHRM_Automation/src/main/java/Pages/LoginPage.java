package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object using lazy By-locators and explicit waits (Selenium 4+)
 * Construct with a WebDriver; no element lookup happens in the constructor.
 */
public class LoginPage extends TestBase {
    private final WebDriver driver;
    private final WebDriverWait wait;

    // Locators (adjust to your application's actual locators)
    private final By username = By.id("username");
    private final By password = By.id("password");
    private final By loginBtn  = By.cssSelector("button[type='submit']");
    private final By dashboard = By.id("dashboardBanner");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Convenience constructor that uses the WebDriver initialized in TestBase
    public LoginPage() {
        this(TestBase.getDriver());
    }

    private WebElement waitVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void enterUsername(String user) {
        WebElement e = waitVisible(username);
        e.clear();
        e.sendKeys(user);
    }

    public void enterPassword(String pass) {
        WebElement e = waitVisible(password);
        e.clear();
        e.sendKeys(pass);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

    public boolean isLoggedIn() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard)).isDisplayed();
    }
}
