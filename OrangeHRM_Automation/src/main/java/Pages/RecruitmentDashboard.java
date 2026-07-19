package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RecruitmentDashboard extends TestBase {
    private WebDriverWait wait;

    public RecruitmentDashboard(){
        this.wait = new WebDriverWait(TestBase.getDriver(), Duration.ofSeconds(10));
    }

    // Locators (preserved)
    private final By Recruitment_Banner = By.xpath("//h6[text() = 'Recruitment']");
    private final By MyInfo_button = By.xpath("//ul[@class = 'oxd-main-menu']//child::li[6]");

    public boolean isRecruitmentBannerDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Recruitment_Banner)).isDisplayed();
    }
    public void clickMyInfoButton(){
        wait.until(ExpectedConditions.elementToBeClickable(MyInfo_button)).click();
    }
}
