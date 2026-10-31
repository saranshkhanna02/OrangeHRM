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

    @Test(priority = 1, groups = {"regression"})
    public void adminBannerTest(){
        Assert.assertTrue(adminDashboard.isAdminBannerDisplayed());
    }
    @Test(priority = 2, dependsOnMethods="adminBannerTest", groups = {"regression"})
    public void testPIMButton(){
        adminDashboard.clickPIMButton();
    }
}
