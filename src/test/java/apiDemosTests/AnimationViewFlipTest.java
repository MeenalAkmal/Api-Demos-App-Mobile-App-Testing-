package apiDemosTests;

import apiDemosBaseTest.BaseClass;
import apiDemosPages.AnimationViewFlipPage;
import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnimationViewFlipTest extends BaseClass {

    @Test
    public void testViewFlipAnimation() {
        try {
            System.out.println("Starting Animation → View Flip Test...");

            AnimationViewFlipPage flipPage = new AnimationViewFlipPage(driver);

           
            driver.findElement(AppiumBy.accessibilityId("Views")).click();
            System.out.println("Clicked on Views successfully!");

            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector()).scrollTextIntoView(\"Animation\")"));
            System.out.println("Scrolled to 'Animation' option!");

           
            flipPage.clickAnimation();
            flipPage.clickViewFlip();

          
            flipPage.clickFlipButton();
            Thread.sleep(1500);
            flipPage.clickFlipButton();
            Thread.sleep(1500);
            flipPage.clickFlipButton();

            
            boolean isDisplayed = driver.findElement(AppiumBy.className("android.widget.ImageView")).isDisplayed();
            Assert.assertTrue(isDisplayed, "Flip animation not visible!");

            System.out.println("Test Passed: Flip animation verified successfully!");
        } catch (Exception e) {
            System.out.println("Test Failed: " + e.getMessage());
            Assert.fail();
        }
    }
}
