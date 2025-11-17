
package calculatorPage;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorPageClass {

    private AndroidDriver driver;

    public CalculatorPageClass(AndroidDriver driver) {
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

    // Operation buttons
    private By btnPlus = AppiumBy.accessibilityId("plus");
    private By btnMinus = AppiumBy.accessibilityId("minus");
    private By btnMultiply = AppiumBy.accessibilityId("multiply");
    private By btnDivide = AppiumBy.accessibilityId("divide");
    private By btnEquals = AppiumBy.accessibilityId("equals");
    private By btnClear = AppiumBy.accessibilityId("clear");
    private By btnDecimal = AppiumBy.accessibilityId("point");
    private By btnPercent = AppiumBy.accessibilityId("percent");
    private By btnPower = AppiumBy.accessibilityId("power");
    private By btnSqrt = AppiumBy.accessibilityId("square root");
    private By btnSine = AppiumBy.accessibilityId("sine");
    private By btnLog = AppiumBy.accessibilityId("log");

    // Result field
    private By resultField = AppiumBy.id("com.google.android.calculator:id/result_final");

    // Generic method to click a button
    private void click(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    // Press methods
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

    public void pressPlus() { click(btnPlus); }
    public void pressMinus() { click(btnMinus); }
    public void pressMultiply() { click(btnMultiply); }
    public void pressDivide() { click(btnDivide); }
    public void pressEquals() { click(btnEquals); }
    public void pressClear() { click(btnClear); }
    public void pressDecimalPoint() { click(btnDecimal); }
    public void pressPercent() { click(btnPercent); }
    public void pressPower() { click(btnPower); }
    public void pressSqrt() { click(btnSqrt); }
    public void pressSine() { click(btnSine); }
    public void pressLog() { click(btnLog); }

    public String getResult() {
        return driver.findElement(resultField).getText();
    }
}
