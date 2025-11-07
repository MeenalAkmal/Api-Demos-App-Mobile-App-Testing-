package apiDemosTests;

import apiDemosBaseTest.BaseClass;
import apiDemosPages.HomePage;
import apiDemosPages.ViewsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewsTests extends BaseClass {

    @Test
    public void testExpandableListItems() {
        try {
            // Step 1: Navigate to Views
            HomePage home = new HomePage(driver);
            home.clickViews();

            // Step 2: Navigate to Expandable Lists → Custom Adapter
            ViewsPage views = new ViewsPage(driver);
            views.clickExpandableLists();
            views.clickCustomAdapter();

            // Step 3: Click and verify "People Names"
            views.clickPeopleNames();
            Assert.assertTrue(views.isGroupExpanded("Arnold"), "People Names list not expanded!");
            System.out.println(" Clicked on 'People Names' and verified child list.");

            // Step 4: Click and verify "Dog Names"
            views.clickDogNames();
            Assert.assertTrue(views.isGroupExpanded("Ace"), "Dog Names list not expanded!");
            System.out.println(" Clicked on 'Dog Names' and verified child list.");

            // Step 5: Click and verify "Cat Names"
            views.clickCatNames();
            Assert.assertTrue(views.isGroupExpanded("Fluffy"), "Cat Names list not expanded!");
            System.out.println(" Clicked on 'Cat Names' and verified child list.");

            // Step 6: Click and verify "Fish Names"
            views.clickFishNames();
            Assert.assertTrue(views.isGroupExpanded("Goldy"), "Fish Names list not expanded!");
            System.out.println(" Clicked on 'Fish Names' and verified child list.");

            System.out.println(" Test Case Passed: All expandable list items opened successfully!");
        } catch (Exception e) {
            System.out.println(" Test Case Failed: " + e.getMessage());
            Assert.fail("Test failed due to: " + e.getMessage());
        }
    }
}
