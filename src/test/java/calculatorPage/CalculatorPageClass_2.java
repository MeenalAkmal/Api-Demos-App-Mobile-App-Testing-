

package calculatorPage;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Calculator page object with a numeric helper method pressDigit(int).
 * Replace/comment accessibility IDs when you confirm them with Appium Inspector / UIAutomatorViewer.
 */
public class CalculatorPageClass_2 {

    private AndroidDriver driver;

    public CalculatorPageClass_2(AndroidDriver driver) {
        this.driver = driver;
    }

    // Digit buttons
    private By btn0 = AppiumBy.id("com.google.android.calculator:id/digit_0");
    private By btn1 = AppiumBy.id("com.google.android.calculator:id/digit_1");
    private By btn2 = AppiumBy.id("com.google.android.calculator:id/digit_2");
    private By btn3 = AppiumBy.id("com.google.android.calculator:id/digit_3");
    private By btn4 = AppiumBy.id("com.google.android.calculator:id/digit_4");
    private By btn5 = AppiumBy.id("com.google.android.calculator:id/digit_5");
    private By btn6 = AppiumBy.id("com.google.android.calculator:id/digit_6");
    private By btn7 = AppiumBy.id("com.google.android.calculator:id/digit_7");
    private By btn8 = AppiumBy.id("com.google.android.calculator:id/digit_8");
    private By btn9 = AppiumBy.id("com.google.android.calculator:id/digit_9");

    // Operation buttons (these are usually correct for Google Calc, but verify if you have a different calculator)
    private By btnPlus = AppiumBy.accessibilityId("plus");
    private By btnMinus = AppiumBy.accessibilityId("minus");
    private By btnMultiply = AppiumBy.accessibilityId("multiply");
    private By btnDivide = AppiumBy.accessibilityId("divide");
    private By btnEquals = AppiumBy.accessibilityId("equals");
    private By btnClear = AppiumBy.accessibilityId("clear");
    private By btnDecimal = AppiumBy.accessibilityId("point");
    private By btnPercent = AppiumBy.accessibilityId("percent");

    // The following scientific buttons often have different accessibility ids on devices.
    // Commented out to avoid NoSuchElement exceptions until you confirm them via inspector.
    // private By btnPower = AppiumBy.accessibilityId("power");
    // private By btnSqrt = AppiumBy.accessibilityId("square root");
    // private By btnSine = AppiumBy.accessibilityId("sine");
    // private By btnLog = AppiumBy.accessibilityId("log");

    // Result field
    private By resultField = AppiumBy.id("com.google.android.calculator:id/result_final");

    // Generic method to click a button (waits aren't added here; add explicit wait if flakiness occurs)
    private void click(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    // Press methods for digits
    public void press0() { click(btn0); }
    public void press1() { click(btn1); }
    public void press2() { click(btn2); }
    public void press3() { click(btn3); }
    public void press4() { click(btn4); }
    public void press5() { click(btn5); }
    public void press6() { click(btn6); }
    public void press7() { click(btn7); }
    public void press8() { click(btn8); }
    public void press9() { click(btn9); }

    // Operation press methods
    public void pressPlus() { click(btnPlus); }
    public void pressMinus() { click(btnMinus); }
    public void pressMultiply() { click(btnMultiply); }
    public void pressDivide() { click(btnDivide); }
    public void pressEquals() { click(btnEquals); }
    public void pressClear() { click(btnClear); }
    public void pressDecimalPoint() { click(btnDecimal); }
    public void pressPercent() { click(btnPercent); }

    // If you later confirm these IDs, uncomment and use:
    // public void pressPower() { click(btnPower); }
    // public void pressSqrt() { click(btnSqrt); }
    // public void pressSine() { click(btnSine); }
    // public void pressLog() { click(btnLog); }

    public String getResult() {
        return driver.findElement(resultField).getText();
    }

    /**
     * Helper to press a whole integer (multi-digit supported).
     * Example: pressDigit(123) -> presses 1 then 2 then 3.
     */
    public void pressDigit(int number) {
        // handle negative numbers defensively (not expected for your calculator tests)
        if (number < 0) {
            // press minus sign if needed. If not supported, remove this block.
            pressMinus();
            number = Math.abs(number);
        }
        String digits = String.valueOf(number);
        for (char ch : digits.toCharArray()) {
            switch (ch) {
                case '0': press0(); break;
                case '1': press1(); break;
                case '2': press2(); break;
                case '3': press3(); break;
                case '4': press4(); break;
                case '5': press5(); break;
                case '6': press6(); break;
                case '7': press7(); break;
                case '8': press8(); break;
                case '9': press9(); break;
                default: /* ignore any unexpected char */ break;
            }
        }
    }
}

