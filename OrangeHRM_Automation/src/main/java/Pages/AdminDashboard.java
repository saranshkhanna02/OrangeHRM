package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminDashboard extends TestBase {
    private WebDriverWait wait;

    public AdminDashboard(){
        this.wait = new WebDriverWait(TestBase.getDriver(), Duration.ofSeconds(10));
    }

    // Locators (preserved)
    private final By Admin_Banner = By.xpath("//h6[text() = 'Admin' or text() = 'User Management']");
    private final By PIM_button = By.xpath("//ul[@class = 'oxd-main-menu']//child::li[2]");

    public boolean isAdminBannerDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Admin_Banner)).isDisplayed();
    }
    public void clickPIMButton(){
        wait.until(ExpectedConditions.elementToBeClickable(PIM_button)).click();
    }

}