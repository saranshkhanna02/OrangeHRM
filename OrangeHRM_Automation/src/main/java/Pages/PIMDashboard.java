package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PIMDashboard extends TestBase {
    private WebDriverWait wait;

    public PIMDashboard(){
        this.wait = new WebDriverWait(TestBase.getDriver(), Duration.ofSeconds(10));
    }

    // Locators (preserved)
    private final By PIM_Banner = By.xpath("//h6[text() = 'PIM']");
    private final By Leave_button = By.xpath("//ul[@class = 'oxd-main-menu']//child::li[3]");

    public boolean isPIMBannerDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(PIM_Banner)).isDisplayed();
    }
    public void clickLeaveButton(){
        wait.until(ExpectedConditions.elementToBeClickable(Leave_button)).click();
    }
}