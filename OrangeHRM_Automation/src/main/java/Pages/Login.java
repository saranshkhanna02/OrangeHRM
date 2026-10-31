package Pages;
import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Login extends TestBase {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    public Login(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name = 'username']")
    WebElement username;

    @FindBy(xpath = "//input[@name = 'password']")
    WebElement password;

    @FindBy(xpath = "//button[normalize-space() = 'Login']")
    WebElement loginButton;

    public void login(){
        wait.until(ExpectedConditions.visibilityOfAllElements(username, password, loginButton));
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();
    }
}