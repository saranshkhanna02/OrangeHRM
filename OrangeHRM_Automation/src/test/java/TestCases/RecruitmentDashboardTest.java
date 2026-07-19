package TestCases;

import Base.TestBase;
import Pages.RecruitmentDashboard;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RecruitmentDashboardTest extends TestBase {
    RecruitmentDashboard recruitmentDashboard;
    @BeforeClass(alwaysRun = true)
    public void recruitmentDashboardInitialize() {
        recruitmentDashboard = new RecruitmentDashboard();
    }
    @Test(priority = 11)
    public void isRecruitmentBannerDisplayed() {
        Assert.assertTrue(recruitmentDashboard.isRecruitmentBannerDisplayed());
    }
    @Test(priority = 12)
    public void testMyInfoButton(){
        recruitmentDashboard.clickMyInfoButton();
    }
}