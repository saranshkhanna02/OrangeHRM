package TestCases;

import Base.TestBase;
import Pages.AdminDashboard;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdminTest extends TestBase {
    AdminDashboard adminDashboard;
    @BeforeClass(alwaysRun = true)
    public void adminInitialiseObject(){
        adminDashboard = new AdminDashboard();
    }

    @Test(priority = 3)
    public void adminBannerTest(){
        Assert.assertTrue(adminDashboard.isAdminBannerDisplayed());
    }
    @Test(priority = 4, dependsOnMethods="adminBannerTest")
    public void testPIMButton(){
        adminDashboard.clickPIMButton();
    }
}
