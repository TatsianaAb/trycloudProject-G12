package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFolderPage extends BasePage{

    public UploadFolderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//span[@class='icon icon-add']")
    public WebElement uploadOptions;

    @FindBy (xpath = "//span[@class='icon icon-folder svg']")
    public WebElement newFolder;

    @FindBy (xpath = "//input[@id='view13-input-folder']")
    public WebElement inputName;

    @FindBy (xpath = "//input[@class='icon-confirm']")
    public WebElement uploadBtn;

    @FindBy (xpath = "//span[normalize-space()='Upload Practice']/span")
    public WebElement uploadPracticeFolder;

    @FindBy (xpath = "//span[normalize-space()='Upload file']")
    public WebElement uploadFile;

}
