package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TimeDashboard extends TestBase {
    private WebDriverWait wait;

    public TimeDashboard(){
        this.wait = new WebDriverWait(TestBase.getDriver(), Duration.ofSeconds(10));
    }

    // Locators (preserved)
    private final By Time_Banner = By.xpath("//h6[text() = 'Time' or text() ='Timesheets']");
    private final By Recruitment_button = By.xpath("//ul[@class = 'oxd-main-menu']//child::li[5]");

    public boolean isTimeBannerDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Time_Banner)).isDisplayed();
    }
    public void clickRecruitmentButton(){
        wait.until(ExpectedConditions.elementToBeClickable(Recruitment_button)).click();
    }
}
