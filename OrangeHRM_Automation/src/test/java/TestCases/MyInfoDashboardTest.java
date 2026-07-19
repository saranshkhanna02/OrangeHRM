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
    @Test(priority = 13)
    public void isMyInfoDashboardDisplayed(){
        Assert.assertTrue(myInfoDashboard.isMyInfoBannerDisplayed());
    }
    @Test(priority = 14, dependsOnMethods="isMyInfoDashboardDisplayed")
    public void testPerformanceButton(){
        myInfoDashboard.clickPerformanceButton();
    }
}
