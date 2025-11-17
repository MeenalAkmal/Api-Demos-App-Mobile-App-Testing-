package apiDemosBaseTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {

    public AndroidDriver driver;

    @BeforeClass
    public void setup() {
        try {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("Samsung A32");
            // options.setPlatformName("Android");
            // options.setPlatformVersion("13");
            options.setAutomationName("UiAutomator2");
            options.setApp("C:\\Users\\meena\\Apps\\ApiDemos.apk");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            System.out.println(" Appium session created successfully!");

        } catch (MalformedURLException e) {
            System.out.println(" Invalid Appium server URL!");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(" Error setting up Appium session:");
            e.printStackTrace();
        }
    }

   
    public WebElement scrollToText(String visibleText) {
        return driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
            + "new UiSelector().text(\"" + visibleText + "\"))"));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println(" Session ended successfully!");
        }
    }
}



























