package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeDashboard extends TestBase{
    private WebDriverWait wait;

    public HomeDashboard(){
        // initialize wait using TestBase driver
        this.wait = new WebDriverWait(TestBase.getDriver(), Duration.ofSeconds(10));
    }

    // Locators (preserved)
    private final By HomeBanner = By.xpath("//h6[normalize-space() = 'Dashboard']");
    private final By Admin_button = By.xpath("//ul[@class = 'oxd-main-menu']/child::li[1]");

    public boolean isDashboardBannerDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(HomeBanner)).isDisplayed();
    }

    public void clickAdminButton(){
        wait.until(ExpectedConditions.elementToBeClickable(Admin_button)).click();
    }
}