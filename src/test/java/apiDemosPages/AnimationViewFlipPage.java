package apiDemosPages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AnimationViewFlipPage {

    private AndroidDriver driver;

    public AnimationViewFlipPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By animationOption = AppiumBy.accessibilityId("Animation");
    private By viewFlipOption = AppiumBy.accessibilityId("View Flip");
    private By flipButton = AppiumBy.id("io.appium.android.apis:id/button");

    // Methods
    public void clickAnimation() {
        driver.findElement(animationOption).click();
        System.out.println("Clicked on Animation successfully!");
    }

    public void clickViewFlip() {
        driver.findElement(viewFlipOption).click();
        System.out.println("Clicked on View Flip successfully!");
    }

    public void clickFlipButton() {
        driver.findElement(flipButton).click();
        System.out.println("Clicked on FLIP button successfully!");
    }
}
