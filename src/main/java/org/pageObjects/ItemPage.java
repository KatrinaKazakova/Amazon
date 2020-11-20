package org.pageObjects;

import org.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {

   public ItemPage(WebDriver driver) { super(driver); }

    @FindBy(xpath="//div[@class='modal-footer']/p")
    WebElement closeModal;
    @FindBy(xpath="//div[@class='example']/h3")
    WebElement exitIntent;


}