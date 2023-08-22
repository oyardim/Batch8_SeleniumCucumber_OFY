package com.eurotech.stepDefinitions;

import com.eurotech.pages.AddEducationPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import java.util.List;
import java.util.Objects;


public class AddEducation_StepDefs {
    AddEducationPage addEducationPage = new AddEducationPage();

    @Then("The user should able to see following form labels")
    public void the_user_should_able_to_see_following_form_labels(List<String> expectedLabels) {
        BrowserUtils.waitForVisibility(addEducationPage.addEducationBtn, 3);
        List<String> actualLabels = BrowserUtils.getElementsText(addEducationPage.formLabels);
        Assert.assertEquals(expectedLabels, actualLabels);
    }

    @And("The user fills the form with: {string}, {string}, {string}, {string}, {string} and {string}")
    public void theUserFillsTheFormWithAnd(String school, String degree, String study, String fromDate, String toDate, String description) {
        addEducationPage.fillingAddEducationForm(school, degree, study, fromDate, toDate, description);
    }

    @Then("The user should able to see following form labels second version")
    public void the_user_should_able_to_see_following_form_labels_second_version(DataTable dataTable) {
        List<String> expectedList = dataTable.asList(String.class);
        //nullToString(expectedList.get(4));

        BrowserUtils.waitForVisibility(addEducationPage.addEducationBtn, 5);
        List<String> actualList = BrowserUtils.getElementsText(addEducationPage.formLabelsWithCurrentDate);

        Assert.assertEquals(expectedList, actualList);

    }
    @DataTableType
    public String nullToString(String cell){
        return Objects.isNull(cell)? StringUtils.EMPTY:cell;
    }
}
