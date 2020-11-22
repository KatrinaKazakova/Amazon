package org.pageObjects;

import org.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ItemPage extends BasePage {

   public ItemPage(WebDriver driver) { super(driver); }

    @FindBy(xpath="//span[@id='productTitle']")
    WebElement productTitle;
    @FindBy(xpath="//input[@id='add-to-cart-button']")
    WebElement addToCart;

    public void verifyProductTitle(String product) {
        Assert.assertTrue(product.contains(productTitle.getText()));
    }
    public void verifyAddtoCartIsEnabled() {
        Assert.assertTrue(addToCart.isDisplayed());
        Assert.assertTrue(addToCart.isEnabled());
    }
}