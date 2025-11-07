package apiDemosTests;

import apiDemosBaseTest.BaseClass;
import apiDemosPages.VisibilityPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VisibilityTest extends BaseClass {

    @Test
    public void testVisibilityFeature() throws InterruptedException {
        VisibilityPage visibilityPage = new VisibilityPage(driver);

       
        visibilityPage.openVisibilitySection();

      
        visibilityPage.clickInvisButton();
        Thread.sleep(1000);
        Assert.assertFalse(visibilityPage.isViewBVisible(), " View B should be invisible");
        System.out.println(" INVIS button verified → View B is hidden");

        
        visibilityPage.clickVisButton();
        Thread.sleep(1000);
        Assert.assertTrue(visibilityPage.isViewBVisible(), " View B should be visible again");
        System.out.println(" VIS button verified → View B is visible again");

       
        visibilityPage.clickGoneButton();
        Thread.sleep(1000);
        Assert.assertFalse(visibilityPage.isViewBVisible(), " View B should be gone");
        System.out.println(" GONE button verified → View B is removed");

        System.out.println(" Test Passed: Visibility feature verified successfully!");
    }
}
