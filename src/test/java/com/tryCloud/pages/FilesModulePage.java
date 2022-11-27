package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesModulePage {

    public FilesModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//label[@for='select_all_files']")
    public WebElement selectAllCheckbox;


    @FindBy (xpath = "//input[@class='selectCheckBox checkbox']")
    public List<WebElement> checkboxes;

    @FindBy (xpath = "//a[@class='action action-menu permanent']")
    public List<WebElement> actionIcons;

    @FindBy (xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement firstFileActionIcon;

    @FindBy (xpath = "//a[@class='menuitem action action-favorite permanent']")
    public WebElement addToFavoritesLink;

    @FindBy (xpath = "//div[@id='app-navigation-toggle']")
    public WebElement iconMenu;

    @FindBy (xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement favoritesOption;

   @FindBy (xpath = "//div//span[@class='nametext']")
   public List<WebElement> favoriteOptions;

   @FindBy (xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//li")
   public List<WebElement> actionOptions;

   @FindBy (xpath = "//div[@id='app-navigation']/ul/li")
   public List<WebElement> iconMenuOptions;

   @FindBy (xpath = "(//span[.='UploadTest'])[2]")
   public WebElement uploadTestfile;

   @FindBy (xpath = "//a[@class='action action-menu permanent']/span[1]") ////*[@id='fileList']/tr/td[2]/a/span[3]/a[2]/span[1]
   public WebElement actionIcon;

   @FindBy(xpath = "//*[@id=\"filestable\"]/tfoot/tr/td[1]")
   public WebElement favoritesFiles;

    public void iconMenuOptionsClick(String string){
        for (WebElement each : iconMenuOptions) {
            if(each.getText().equals(string)){
                each.click();
            }
        }
    }

    public void actionOptionClick(String string){
        for (WebElement each : actionOptions) {
            if(each.getText().equals(string)){
                each.click();
                break;
            }
        }
    }

}
