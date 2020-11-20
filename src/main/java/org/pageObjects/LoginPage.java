package org.pageObjects;

import org.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id="username")
    WebElement username;
    @FindBy(id="password")
    WebElement password;
    @FindBy(xpath="//button[@type='submit']")
    WebElement login;
    @FindBy(xpath="//div[@class='flash success']")
    WebElement successMessage;


    public LoginPage(WebDriver driver) {   super(driver); }

    public void login(String usr, String psw) {
        username.sendKeys(usr);
        password.sendKeys(psw);
        login.click();
    }


}
