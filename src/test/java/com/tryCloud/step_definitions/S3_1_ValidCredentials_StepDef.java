package com.tryCloud.step_definitions;


import com.tryCloud.pages.S3_1_ValidCredentials_Page;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class S3_1_ValidCredentials_StepDef {

    S3_1_ValidCredentials_Page validCredentials_page = new S3_1_ValidCredentials_Page();
    @Given("User is on the login page {string}")
    public void user_is_on_the_login_page(String expectedUrl) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }
    @When("User uses username {string} and password {string}")
    public void user_uses_and_passcode(String username, String password) {
validCredentials_page.inputUsername.sendKeys(username);
validCredentials_page.inputPassword.sendKeys(password);
    }
    @When("User clicks the login button")
    public void user_clicks_the_login_button() {
        validCredentials_page.loginButton.click();
    }
    @Then("Verify the user should be at the dashboard page. User sees {string} in the title")
    public void verify_the_user_should_be_at_the_dashboard_page(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

}
