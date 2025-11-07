package apiDemosPages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VisibilityPage {

    private AndroidDriver driver;
    private WebDriverWait wait;

    // Locators
    private By viewsOption = AppiumBy.accessibilityId("Views");
    private By visibilityOption = AppiumBy.accessibilityId("Visibility");
    private By invisBtn = By.id("io.appium.android.apis:id/invis");
    private By visBtn = By.id("io.appium.android.apis:id/vis");
    private By goneBtn = By.id("io.appium.android.apis:id/gone");
    private By viewB = By.id("io.appium.android.apis:id/victim");

    public VisibilityPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openVisibilitySection() {
       
        wait.until(ExpectedConditions.elementToBeClickable(viewsOption)).click();
        System.out.println(" Clicked on Views successfully!");

        WebElement visibilityElement = driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().description(\"Visibility\"))"));
        System.out.println(" Scrolled to 'Visibility' option!");

        wait.until(ExpectedConditions.elementToBeClickable(visibilityElement)).click();
        System.out.println(" Clicked on 'Visibility' successfully!");
    }

    public void clickInvisButton() {
        wait.until(ExpectedConditions.elementToBeClickable(invisBtn)).click();
        System.out.println("Clicked on INVIS button");
    }

    public void clickVisButton() {
        wait.until(ExpectedConditions.elementToBeClickable(visBtn)).click();
        System.out.println("Clicked on VIS button");
    }

    public void clickGoneButton() {
        wait.until(ExpectedConditions.elementToBeClickable(goneBtn)).click();
        System.out.println("Clicked on GONE button");
    }

    public boolean isViewBVisible() {
        try {
            WebElement element = driver.findElement(viewB);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}

