package apiDemosPages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class RadioGroupPage {

    private AndroidDriver driver;
    private WebDriverWait wait;

  
    public RadioGroupPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    
    private By viewsOption = AppiumBy.accessibilityId("Views");
    private By radioGroupOption = AppiumBy.androidUIAutomator("new UiSelector().text(\"Radio Group\")");
    private By snackBtn = AppiumBy.id("io.appium.android.apis:id/snack");
    private By breakfastBtn = AppiumBy.id("io.appium.android.apis:id/breakfast");
    private By lunchBtn = AppiumBy.id("io.appium.android.apis:id/lunch");
    private By dinnerBtn = AppiumBy.id("io.appium.android.apis:id/dinner");
    private By allOfThemBtn = AppiumBy.id("io.appium.android.apis:id/all");
    private By clearBtn = AppiumBy.id("io.appium.android.apis:id/clear");
    private By selectedText = AppiumBy.id("io.appium.android.apis:id/choice");

    
    public void navigateToRadioGroup() {
        wait.until(ExpectedConditions.elementToBeClickable(viewsOption)).click();
        System.out.println(" Clicked on Views successfully!");

        // Scroll to 'Radio Group'
        driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));"
        ));
        System.out.println(" Scrolled to 'Radio Group' option!");

        wait.until(ExpectedConditions.elementToBeClickable(radioGroupOption)).click();
        System.out.println(" Clicked on 'Radio Group' successfully!");
    }

    public void clickAllRadioButtons() {
        clickAndPrint(snackBtn, "Snack");
        clickAndPrint(breakfastBtn, "Breakfast");
        clickAndPrint(lunchBtn, "Lunch");
        clickAndPrint(dinnerBtn, "Dinner");
        clickAndPrint(allOfThemBtn, "All of them");
    }

    private void clickAndPrint(By locator, String name) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(selectedText));
        System.out.println(" Clicked on " + name + " → " + textElement.getText());
    }

    public void clickClearButton() {
        wait.until(ExpectedConditions.elementToBeClickable(clearBtn)).click();
        System.out.println(" Clicked on CLEAR button");
    }
    
    public boolean verifyClearedSelection() 
    {
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(selectedText)).getText();
        boolean isCleared = text.contains("(none)");
        System.out.println(" Current Selection: " + text);
        return isCleared;
    }
}
