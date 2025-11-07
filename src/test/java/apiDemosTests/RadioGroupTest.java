package apiDemosTests;

import apiDemosBaseTest.BaseClass;
import apiDemosPages.RadioGroupPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioGroupTest extends BaseClass {

    @Test
    public void testRadioGroupFeature() {
        RadioGroupPage radioGroup = new RadioGroupPage(driver);

        System.out.println(" Starting Radio Group Test...");

       
        radioGroup.navigateToRadioGroup();

       
        radioGroup.clickAllRadioButtons();

        
        radioGroup.clickClearButton();

       
        Assert.assertTrue(radioGroup.verifyClearedSelection(), " Clear button did not reset selection!");
        System.out.println(" Test Passed: Radio Group feature verified successfully!");
    }
}
