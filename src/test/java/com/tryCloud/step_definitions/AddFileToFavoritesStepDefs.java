package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.FilesModulePage;
import com.tryCloud.pages.TryCloudLoginPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class AddFileToFavoritesStepDefs {

    BasePage basePage = new BasePage();
    TryCloudLoginPage tryCloudLoginPage = new TryCloudLoginPage();
    FilesModulePage filesModulePage = new FilesModulePage();
    Actions actions = new Actions(Driver.getDriver());


    @When("the user clicks action-icon from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        filesModulePage.actionIcon.click();
    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

               filesModulePage.actionOptionClick(string);

    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {

        filesModulePage.iconMenuOptionsClick(string);

    }
    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {

      Assert.assertTrue(filesModulePage.favoritesFiles.isEnabled());

    }
}
