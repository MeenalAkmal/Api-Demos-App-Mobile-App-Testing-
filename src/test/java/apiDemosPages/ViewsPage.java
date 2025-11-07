package apiDemosPages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class ViewsPage {

    private AndroidDriver driver;

    public ViewsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Locators
    private AppiumBy expandableLists = (AppiumBy) AppiumBy.accessibilityId("Expandable Lists");
    private AppiumBy customAdapter = (AppiumBy) AppiumBy.accessibilityId("1. Custom Adapter");

    // List group locators
    private AppiumBy peopleNames = (AppiumBy) AppiumBy.androidUIAutomator("new UiSelector().text(\"People Names\")");
    private AppiumBy dogNames = (AppiumBy) AppiumBy.androidUIAutomator("new UiSelector().text(\"Dog Names\")");
    private AppiumBy catNames = (AppiumBy) AppiumBy.androidUIAutomator("new UiSelector().text(\"Cat Names\")");
    private AppiumBy fishNames = (AppiumBy) AppiumBy.androidUIAutomator("new UiSelector().text(\"Fish Names\")");

    // Actions
    public void clickExpandableLists() {
        driver.findElement(expandableLists).click();
        System.out.println(" Clicked on 'Expandable Lists'");
    }

    public void clickCustomAdapter() {
        driver.findElement(customAdapter).click();
        System.out.println(" Clicked on '1. Custom Adapter' successfully!");
    }

    public void clickPeopleNames() {
        driver.findElement(peopleNames).click();
        System.out.println(" Clicked on 'People Names'");
    }

    public void clickDogNames() {
        driver.findElement(dogNames).click();
        System.out.println(" Clicked on 'Dog Names'");
    }

    public void clickCatNames() {
        driver.findElement(catNames).click();
        System.out.println(" Clicked on 'Cat Names'");
    }

    public void clickFishNames() {
        driver.findElement(fishNames).click();
        System.out.println(" Clicked on 'Fish Names'");
    }

    // Verify expansion by checking for any child item under each list
    public boolean isGroupExpanded(String childText) {
        try {
            WebElement child = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='" + childText + "']"));
            return child.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
