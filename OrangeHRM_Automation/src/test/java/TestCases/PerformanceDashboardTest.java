package TestCases;

import Base.TestBase;
import Pages.PerformanceDashboard;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PerformanceDashboardTest extends TestBase {
    PerformanceDashboard performanceDashboard;
    @BeforeClass(alwaysRun = true)
    public void performanceDashboardInitialize(){
        performanceDashboard = new PerformanceDashboard();
    }
    @Test(priority = 15)
    public void isPerformanceBannerDisplayed(){
        Assert.assertTrue(performanceDashboard.isPerformanceBannerDisplayed());
    }
    @Test(priority = 16)
    public void testDashboardButton(){
        performanceDashboard.clickDashboardButton();
    }
}
