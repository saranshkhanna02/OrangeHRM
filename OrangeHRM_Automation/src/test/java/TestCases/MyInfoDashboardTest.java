package TestCases;

import Base.TestBase;
import Pages.MyInfoDashboard;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyInfoDashboardTest extends TestBase {
    MyInfoDashboard myInfoDashboard;
    @BeforeMethod(alwaysRun = true)
    public void myInfoDashboardInitialize(){
        myInfoDashboard = new MyInfoDashboard();
    }
    @Test(priority = 1, groups = {"regression"})
    public void isMyInfoDashboardDisplayed(){
        Assert.assertTrue(myInfoDashboard.isMyInfoBannerDisplayed());
    }
    @Test(priority = 2, dependsOnMethods="isMyInfoDashboardDisplayed", groups = {"regression"})
    public void testPerformanceButton(){
        myInfoDashboard.clickPerformanceButton();
    }
}
