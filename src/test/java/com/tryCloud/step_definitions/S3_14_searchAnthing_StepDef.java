package com.tryCloud.step_definitions;



import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.SearchModulePage;
import com.tryCloud.pages.TryCloudLoginPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class S3_14_searchAnthing_StepDef {

    TryCloudLoginPage tryCloudLoginPage = new TryCloudLoginPage();
    SearchModulePage searchModulePage = new SearchModulePage();
    BasePage basePage = new BasePage();

   @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        tryCloudLoginPage.login("user12", "Userpass123");
    }

    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
        basePage.searchIcon.click();
    }
    @When("users search any existing file, folder, {string} or user name")
    public void users_search_any_existing_file_folder_user_name(String search) {
    basePage.searchBox.sendKeys(search);
    }
    @Then("verify the app displays the expected result {string} option")
    public void verify_the_app_displays_the_expected_result_option(String results) {
        Assert.assertEquals(results, searchModulePage.searchResults.getText());
    }

}
