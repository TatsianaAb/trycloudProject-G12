package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.SearchModulePage;
import com.tryCloud.pages.TryCloudLoginPage;
import com.tryCloud.pages.UploadFolderPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class UploadFolder_StepDef {

    TryCloudLoginPage tryCloudLoginPage = new TryCloudLoginPage();
    BasePage basePage = new BasePage();
    UploadFolderPage uploadFolderPage = new UploadFolderPage();
    @Given("user on the Dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        tryCloudLoginPage.login("user12", "Userpass123");

    }
    @When("the user clicks the Files module")
    public void the_user_clicks_the_files_module() {
        basePage.files.click();
    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
uploadFolderPage.uploadOptions.click();
    }
    @When("user click \"new folder”")
    public void user_click_new_folder() {
        uploadFolderPage.newFolder.click();

    }
    @When("user write a folder name")
    public void user_write_a_folder_name() {
uploadFolderPage.inputName.sendKeys("Upload Practice");

    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        uploadFolderPage.uploadBtn.click();

    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        Assert.assertTrue(uploadFolderPage.uploadPracticeFolder.isDisplayed());
    }

    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {
        uploadFolderPage.uploadPracticeFolder.click();

    }
    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {
uploadFolderPage.uploadFile.sendKeys("C:\\Users\\Ramesh\\Desktop\\Test.txt");
    }
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {

    }
    }

