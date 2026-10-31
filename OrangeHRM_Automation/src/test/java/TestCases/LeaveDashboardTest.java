package TestCases;

import Base.TestBase;
import Pages.LeaveDashboard;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeaveDashboardTest extends TestBase {
    LeaveDashboard leaveDashboard;
    @BeforeClass(alwaysRun = true)
    public void leaveDashboardInitialize(){
        leaveDashboard = new LeaveDashboard();
    }
    @Test(priority = 1, groups = {"regression"})
    public void leaveDashboardTest(){
        Assert.assertTrue(leaveDashboard.isLeaveBannerDisplayed());
    }
    @Test(priority = 2, dependsOnMethods="leaveDashboardTest", groups = {"regression"})
    public void testTimeButton(){
        leaveDashboard.clickTimeButton();
    }
}
