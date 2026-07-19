package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyInfoDashboard extends TestBase {
    private WebDriverWait wait;

    public MyInfoDashboard(){
        this.wait = new WebDriverWait(TestBase.getDriver(), Duration.ofSeconds(10));
    }

    // Locators (preserved)
    private final By MyInfo_Dashboard = By.xpath("//h6[text() = 'PIM']");
    private final By Performance_Button = By.xpath("//ul[@class = 'oxd-main-menu']//child::li[7]");

    public boolean isMyInfoBannerDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(MyInfo_Dashboard)).isDisplayed();
    }
    public void clickPerformanceButton(){
        wait.until(ExpectedConditions.elementToBeClickable(Performance_Button)).click();
    }
}
