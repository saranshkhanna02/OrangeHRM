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

    @Test(priority = 9)
    public void isTimeDashboardTest(){
        Assert.assertTrue(timeDashboard.isTimeBannerDisplayed());
    }
    @Test(priority = 10, dependsOnMethods="isTimeDashboardTest")
    public void testRecruitmentButton(){
        timeDashboard.clickRecruitmentButton();
    }
}
