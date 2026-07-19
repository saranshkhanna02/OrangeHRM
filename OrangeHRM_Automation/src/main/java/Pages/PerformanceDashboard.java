package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PerformanceDashboard extends TestBase {
    private WebDriverWait wait;

    public PerformanceDashboard(){
        this.wait = new WebDriverWait(TestBase.getDriver(), Duration.ofSeconds(10));
    }

    // Locators (preserved)
    private final By Performance_Banner = By.xpath("//h6[text() = 'Performance' or text() = 'Manage Reviews']");
    private final By Dashboard_button = By.xpath("//ul[@class = 'oxd-main-menu']//child::li[8]");

    public boolean isPerformanceBannerDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Performance_Banner)).isDisplayed();
    }
    public void clickDashboardButton(){
        wait.until(ExpectedConditions.elementToBeClickable(Dashboard_button)).click();
    }
}
