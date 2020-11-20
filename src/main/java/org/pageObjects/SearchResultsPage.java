package org.pageObjects;

import org.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchResultsPage extends BasePage {

	public SearchResultsPage(WebDriver driver) { super(driver); }

	 @FindBy(xpath="//a[text()='Click Here']")
	 WebElement clickHere;


}

