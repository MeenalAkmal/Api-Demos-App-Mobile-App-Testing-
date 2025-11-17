package calculatorTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import calculatorPage.CalculatorPageClass;

public class CalculatorTestClass extends BaseClass {

    private CalculatorPageClass calc;

    @BeforeClass(alwaysRun = true)
    public void initPage() {
        
        calc = new CalculatorPageClass(getDriver());
        System.out.println(" CalculatorPageClass initialized successfully!");
    }

    @Test(priority = 1)
    public void testAddition() {
        calc.pressClear();
        calc.press2();
        calc.pressPlus();
        calc.press3();
        calc.pressEquals();
        System.out.println("  Addition Test (2 + 3) ");
    }

    @Test(priority = 2, groups = {"Arithmetic"})
    public void testSubtraction() {
        calc.pressClear();
        calc.press9();
        calc.pressMinus();
        calc.press4();
        calc.pressEquals();
        System.out.println("Subtraction Test (9 - 4)");
    }

    @Test(priority = 3, groups = {"Arithmetic"})
    public void testMultiplication() {
        calc.pressClear();
        calc.press6();
        calc.pressMultiply();
        calc.press7();
        calc.pressEquals();
        System.out.println("Multiplication Test (6 * 7)");
    }

    @Test(priority = 4, groups = {"Arithmetic"})
    public void testDivision() {
        calc.pressClear();
        calc.press8();
        calc.pressDivide();
        calc.press2();
        calc.pressEquals();
        System.out.println("Division Test (8 / 2)");
    }

    @Test(priority = 5, groups = {"Arithmetic"})
    public void testDecimalPoint() {
        calc.pressClear();
        calc.press5();
        calc.pressDecimalPoint();
        calc.press6();
        calc.pressPlus();
        calc.press2();
        calc.pressEquals();
        System.out.println("Decimal Point Test (5.6 + 2)");
    }

    @Test(priority = 6, groups = {"Arithmetic"})
    public void testPercentage() {
        calc.pressClear();
        calc.press5();
        calc.press0();
        calc.pressPercent();
        calc.pressEquals();
        System.out.println("Percent Test (50%)");
    }

    @Test(priority = 7, groups = {"Scientific"})
    public void testPower() {
        calc.pressClear();
        calc.press2();
        calc.pressPower();
        calc.press3();
        calc.pressEquals();
        System.out.println("Power Test (2^3 )"); 
    }

    @Test(priority = 8, groups = {"Scientific"})
    public void testSquareRoot() {
        calc.pressClear();
        calc.pressSqrt();
        calc.press9();
        calc.pressEquals();
        System.out.println("Square Root Test (√9)");
    }

    @Test(priority = 9, groups = {"Scientific"})
    public void testSine() {
        calc.pressClear();
        calc.pressSine();
        calc.press3();
        calc.press0();
        calc.pressEquals();
        System.out.println("Sine Test (sin 30)");
    }

    @Test(priority = 10, groups = {"Scientific"})
    public void testLogarithm() {
        calc.pressClear();
        calc.pressLog();
        calc.press1();
        calc.press0();
        calc.pressEquals();
        System.out.println("Logarithm Test (log 10)");
    }
}

