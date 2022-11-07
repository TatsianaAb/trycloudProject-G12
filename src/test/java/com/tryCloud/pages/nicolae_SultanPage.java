package com.tryCloud.pages;


import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nicolae_SultanPage {

    public nicolae_SultanPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="user")
    public WebElement Username;

    @FindBy(id="password")
    public WebElement Password;

    @FindBy(id = "submit-form")
    public  WebElement LogIn;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
     public WebElement Files ;
    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement treedots;
    @FindBy(partialLinkText = "Remove from favorites")
    public WebElement Remove;



}

