
package calculatorTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import calculatorPage.CalculatorPageClass_2;

public class CalculatorTestClass_2  extends BaseClass {

    private CalculatorPageClass_2 calc;

    @BeforeClass(alwaysRun = true)
    public void initPage() {
        calc = new CalculatorPageClass_2(getDriver());
        System.out.println(" CalculatorPageClass initialized successfully!");
    }

    @DataProvider(name = "additionData")
    public Object[][] getAdditionData() {
        return new Object[][]{
            {2, 3},
            {5, 6},
            {10, 20},
            {7, 8}
        };
    }

    @Test(priority = 1, dataProvider = "additionData")
    public void testAdditionDataDriven(int a, int b) {

        calc.pressClear();
        calc.pressDigit(a);
        calc.pressPlus();
        calc.pressDigit(b);
        calc.pressEquals();

        System.out.println("Data Driven Addition Test (" + a + " + " + b + ")");
    }

    
}
