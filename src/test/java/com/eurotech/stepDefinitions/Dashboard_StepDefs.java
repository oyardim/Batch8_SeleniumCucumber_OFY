package com.eurotech.stepDefinitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Dashboard_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("Verify that username {string} is displayed on dashboard page")
    public void verify_that_username_is_displayed_on_dashboard_page(String username) {
        String expectedUsername = username;
        String actualUsername = dashboardPage.getUsernameText();

        Assert.assertEquals(expectedUsername, actualUsername);
    }

    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> expectedList) {
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);
   /*    List<String> actualList=new ArrayList<>();
        for (WebElement elem: dashboardPage.tabMenu){
            actualList.add(elem.getText());
        }

    */
        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.tabMenu);
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expectedList, actualList);
    }

    @And("The user navigates to {string} and {string}")
    public void theUserNavigatesToAnd(String menu, String submenu) {
        dashboardPage.navigateToTabsAndModules(menu,submenu);
        BrowserUtils.waitFor(1);
    }

}
