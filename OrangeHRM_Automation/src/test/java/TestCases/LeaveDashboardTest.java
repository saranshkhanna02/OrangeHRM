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
    @Test(priority = 7)
    public void leaveDashboardTest(){
        Assert.assertTrue(leaveDashboard.isLeaveBannerDisplayed());
    }
    @Test(priority = 8, dependsOnMethods="leaveDashboardTest")
    public void testTimeButton(){
        leaveDashboard.clickTimeButton();
    }
}
