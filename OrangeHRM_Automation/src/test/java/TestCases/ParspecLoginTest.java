package TestCases;

import Base.TestBase;
import Pages.ParspecLogin;
import Utilities.TestData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParspecLoginTest extends TestBase {
    ParspecLogin parspecLogin;

    @BeforeClass(alwaysRun = true)
    public void loginInitialization(){
        parspecLogin = new ParspecLogin();
    }

    @Test(dataProvider = "login", dataProviderClass = TestData.class, groups = {"smoke"})
    public void loginTest(String Email, String Password){
        parspecLogin.login(Email, Password);
    }
}
