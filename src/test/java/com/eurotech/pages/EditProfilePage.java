package com.eurotech.pages;

import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditProfilePage extends BasePage{

    @FindBy(id = "about")
    public WebElement aboutBox;

    @FindBy(xpath = "(//input[@id='company'])[1]")
    public WebElement companyBox;

    @FindBy(xpath = "//select[@id='job']")
    public WebElement jobSelect;

    @FindBy(id = "website")
    public WebElement websiteBox;

    @FindBy(xpath = "(//input[@id='location'])[1]")
    public WebElement locationBox;

    @FindBy(id = "skills")
    public WebElement skillsBox;

    @FindBy(xpath = "//button[text()='Save Changes']")
    public WebElement saveChangesBtn;

    public void selectJob(String jobOption){
        Select select = new Select(jobSelect);
        select.selectByVisibleText(jobOption);
    }

    public String getSelectedJob(){
        Select select = new Select(jobSelect);
        return select.getFirstSelectedOption().getText();
    }

    public void editProfileInfo(String profileBox,String userInfo){
        WebElement inputBox = Driver.get().findElement(By.name(profileBox));
        BrowserUtils.clearAndSendKeys(inputBox, userInfo);
    }
}
