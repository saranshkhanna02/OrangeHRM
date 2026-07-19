package TestCases;

import Base.TestBase;
import Pages.Login;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    Login login;
    @BeforeClass(alwaysRun = true)
    public void loginInitialiseObject(){
        login = new Login();
    }

    @Test
    public void Login(){
        login.login();
    }
}