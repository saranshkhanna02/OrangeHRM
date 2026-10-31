package TestCases;

import Base.TestBase;
import Pages.HomeDashboard;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeDashboardTest extends TestBase {
    HomeDashboard homeDashboard;
    @BeforeClass(alwaysRun = true)
    public void homeDashboardInitialiseObject(){
        homeDashboard = new HomeDashboard();
    }

    @Test(priority = 1, groups = {"regression"})
    public void homeDashboardBannerTest(){
        Assert.assertTrue(homeDashboard.isDashboardBannerDisplayed());
    }
    @Test(priority = 2, dependsOnMethods = "homeDashboardBannerTest", groups = {"regression"})
    public void testAdminButton(){
        homeDashboard.clickAdminButton();
    }
}