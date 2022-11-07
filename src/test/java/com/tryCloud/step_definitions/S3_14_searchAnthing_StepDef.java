package com.tryCloud.step_definitions;


import com.tryCloud.pages.S3_14_searchAnthing_page;
import com.tryCloud.pages.S3_1_ValidCredentials_Page;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class S3_14_searchAnthing_StepDef {

    S3_1_ValidCredentials_Page loginPage = new S3_1_ValidCredentials_Page();
    S3_14_searchAnthing_page searchAnythingPage = new S3_14_searchAnthing_page();
   @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.login("user12", "Userpass123");
    }

    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
        searchAnythingPage.magnifierIcon.click();
    }
    @When("users search any existing file, folder, {string} or user name")
    public void users_search_any_existing_file_folder_user_name(String search) {
    searchAnythingPage.searchBox.sendKeys(search);
    }
    @Then("verify the app displays the expected result {string} option")
    public void verify_the_app_displays_the_expected_result_option(String results) {
        Assert.assertEquals(results, searchAnythingPage.searchResults.getText());
    }

}
