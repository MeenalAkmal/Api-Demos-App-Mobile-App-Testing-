/*package baseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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
	            options.setApp("C:\\Users\\meena\\eclipse-workspace\\MobileAppTesting\\app.apk");
	            
	            
	           // caps.setCapability("appActivity", "com.android.calculator2.Calculator");
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

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

	public static AndroidDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}

package baseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class BaseClass {

    public static AndroidDriver driver;

    @BeforeClass
    public void setup() {
        try {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("Samsung A32");
            options.setAutomationName("UiAutomator2");
            options.setApp("C:\\Users\\meena\\eclipse-workspace\\MobileAppTesting\\app.apk");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            System.out.println(" Appium session created successfully!");
        } catch (MalformedURLException e) {
            System.out.println(" Invalid Appium server URL!");
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static AndroidDriver getDriver() {
        return driver; // <-- return the actual driver
    }
} */
package baseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.URL;
import java.time.Duration;

public class BaseClass {

    // Make the driver static so it’s shared across all test classes
    protected static AndroidDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        try {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("Samsung A32");
            options.setAutomationName("UiAutomator2");
            options.setApp("C:\\Users\\meena\\Apps\\calculator-9-0-799007469.apk");
            
            // Create Appium driver instance
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            System.out.println(" Appium session created successfully!");

        } catch (Exception e) {
            System.out.println(" Error setting up Appium session:");
            e.printStackTrace();
        }
    }

    public static AndroidDriver getDriver() {
        return driver; //  Return the actual driver now
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println(" Driver quit successfully!");
        }
    }
}

