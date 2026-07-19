package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LeaveDashboard extends TestBase {
    private WebDriverWait wait;

    public LeaveDashboard(){
        this.wait = new WebDriverWait(TestBase.getDriver(), Duration.ofSeconds(10));
    }

    // Locators (preserved)
    private final By Leave_Banner = By.xpath("//h6[text() = 'Leave']");
    private final By Time_button = By.xpath("//ul[@class = 'oxd-main-menu']//child::li[4]");

    public boolean isLeaveBannerDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Leave_Banner)).isDisplayed();
    }
    public void clickTimeButton(){
        wait.until(ExpectedConditions.elementToBeClickable(Time_button)).click();
    }

}
