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

    @Test(priority = 1)
    public void homeDashboardBannerTest(){
        Assert.assertTrue(homeDashboard.isDashboardBannerDisplayed());
    }
    @Test(priority = 2, dependsOnMethods = "homeDashboardBannerTest")
    public void testAdminButton(){
        homeDashboard.clickAdminButton();
    }
}