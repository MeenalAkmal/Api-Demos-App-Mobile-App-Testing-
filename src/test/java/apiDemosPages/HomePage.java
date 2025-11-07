
package apiDemosPages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {
    private AndroidDriver driver;

    // Constructor
    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Locator for "Views"
    private final String viewsOption = "Views";

    // Method to click on Views
    public void clickViews() {
        driver.findElement(AppiumBy.accessibilityId(viewsOption)).click();
        System.out.println(" Clicked on Views successfully!");
    }
}
