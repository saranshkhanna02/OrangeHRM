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
    @Test(priority = 1, groups = {"regression"})
    public void isPerformanceBannerDisplayed(){
        Assert.assertTrue(performanceDashboard.isPerformanceBannerDisplayed());
    }
    @Test(priority = 2, groups = {"regression"})
    public void testDashboardButton(){
        performanceDashboard.clickDashboardButton();
    }
}
