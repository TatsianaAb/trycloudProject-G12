package com.tryCloud.step_definitions;


import com.tryCloud.pages.nicolae_Favorites;
import com.tryCloud.pages.nicolae_SultanPage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SultanStepDef {
    nicolae_Favorites favorites = new nicolae_Favorites();
    nicolae_SultanPage sultanPage = new nicolae_SultanPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get("http://qa2.trycloud.net/index.php/login?clear=1");
        sultanPage.Username.sendKeys("User12");
        sultanPage.Password.sendKeys("Userpass123");
        sultanPage.LogIn.click();
    }
    @When("user check if file is in  favorites {string}")
    public void userCheckIfFileIsInFavorites(String arg0) {

        favorites.Favorite.click();
        WebElement isfavorite = Driver.getDriver().findElement(By.xpath("(//span[@class='nametext']//span[.='HelloWoodenSpoon!'])[2]"));
        Assert.assertTrue(isfavorite.isDisplayed());
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        WebElement files = Driver.getDriver().findElement(By.xpath("(//li[@data-id='"+string.toLowerCase()+"']//a[@aria-label='"+string+"'])[1]"));
        files.click();
    }
    @When("the users click action-icon from file {string} on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove(String string) {
       // List<WebElement> actionMenu = Driver.getDriver().findElements(By.xpath("//span[@class='icon icon-starred']/../../../following-sibling::span[@class='fileactions']//span[@class='icon icon-more']"));
//        for(WebElement each : actionMenu){
//            each.click();
//            WebElement remove =Driver.getDriver().findElement(By.xpath("//span[.='Remove from favorites']"));
//            remove.click();
//    WebElement allFiles =Driver.getDriver().findElement(By.xpath("//a[@class='nav-icon-files svg active']"));
//    allFiles.click();
        WebElement actionMenu = Driver.getDriver().findElement(By.xpath("//span[.='"+string+"']/../preceding-sibling::div//span[@class='icon icon-starred']/../../../following-sibling::span[@class='fileactions']//span[@class='icon icon-more']"));
        actionMenu.click();

    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        WebElement remove =Driver.getDriver().findElement(By.xpath("//span[.='"+string+"']"));
        remove.click();
    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
        favorites.Favorite.click();
    }
    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        WebElement isfavorite = Driver.getDriver().findElement(By.xpath("//a[contains(text(),'Favorites')]"));
        System.out.println(isfavorite.isDisplayed());
    }



}