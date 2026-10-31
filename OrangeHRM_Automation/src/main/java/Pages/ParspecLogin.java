package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import java.time.Duration;
import java.util.List;

public class ParspecLogin extends TestBase {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    public ParspecLogin(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name = 'email']")
    WebElement email;

    @FindBy(xpath = "//input[@name = 'password']")
    WebElement password;

    @FindBy(xpath = "//button[@data-testid = 'signin-login-button']")
    WebElement SignInButton;

    @FindBy(xpath = "//*[@data-testid = 'LogoutIcon']")
    WebElement logout;

    @FindBy(xpath = "//button[text() = 'Skip']")
    List<WebElement> skipButton;

    @FindBy(xpath = "//input[@class = 'PrivateSwitchBase-input css-1m9pwf3']")
    WebElement doNotAskAgainCheckbox;

    @FindBy(xpath = "//div[@class = 'MuiBox-root css-273d6n']")
    WebElement secureAccountAlert;

    public void letsSecureYourAccount(){ //first time visit popup
        try{
            wait.until(ExpectedConditions.visibilityOf(secureAccountAlert));
            if(!skipButton.isEmpty()){
                if(!doNotAskAgainCheckbox.isSelected()){
                    doNotAskAgainCheckbox.click();
                }
                skipButton.get(0).click();

            }
        }
        catch (Exception e){
            System.out.println("Popup is not displayed.");
        }
    }

    public void login(String Email, String Password){
        wait.until(ExpectedConditions.visibilityOfAllElements(email,  password));
        email.sendKeys(Email);
        password.sendKeys(Password);
        SignInButton.click();
        letsSecureYourAccount();
        wait.until(ExpectedConditions.visibilityOfAllElements(logout));
        logout.click();
    }
}
