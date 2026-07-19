package TestCases;

import Base.TestBase;
import Pages.PIMDashboard;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PIMDashboardTest extends TestBase {
    PIMDashboard pimDashboard;
    @BeforeMethod(alwaysRun = true)
    public void pimInitialiseObject(){
        pimDashboard = new PIMDashboard();
    }
    @Test(priority = 5)
    public void pimDashboardTest(){
        Assert.assertTrue(pimDashboard.isPIMBannerDisplayed());
    }
    @Test(priority = 6, dependsOnMethods="pimDashboardTest")
    public void testLeaveButton(){
        pimDashboard.clickLeaveButton();
    }
}