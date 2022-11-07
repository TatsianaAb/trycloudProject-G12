package com.tryCloud.pages;


import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S3_14_searchAnthing_page {

    public S3_14_searchAnthing_page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@aria-label='Magnify icon']")
    public WebElement magnifierIcon;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//h3[@class='unified-search__result-line-one']")
    public WebElement searchResults;






}
