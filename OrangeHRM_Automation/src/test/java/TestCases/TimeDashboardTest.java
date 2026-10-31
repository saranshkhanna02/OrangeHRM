package TestCases;

import Base.TestBase;
import Pages.TimeDashboard;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TimeDashboardTest extends TestBase {
    TimeDashboard timeDashboard;
    @BeforeClass(alwaysRun = true)
    public void timeInitialization(){
        timeDashboard = new TimeDashboard();
    }

    @Test(priority = 1, groups = {"regression"})
    public void isTimeDashboardTest(){
        Assert.assertTrue(timeDashboard.isTimeBannerDisplayed());
    }
    @Test(priority = 2, dependsOnMethods="isTimeDashboardTest", groups = {"regression"})
    public void testRecruitmentButton(){
        timeDashboard.clickRecruitmentButton();
    }
}
