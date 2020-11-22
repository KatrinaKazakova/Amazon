package org.pageObjects;

import org.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchHeader extends BasePage {

    public SearchHeader(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//input[@id='twotabsearchtextbox']")
    WebElement searchBar;
    @FindBy(xpath="//input[@type='submit']")
    WebElement magnifGlass;

    public void searchFor(String product) {
        searchBar.sendKeys(product);
        magnifGlass.click();
        Assert.assertEquals(getPageTitle(),"Amazon.com : "+product);
    }
}