package org.pageObjects;

import org.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchResultsPage extends BasePage {

	public SearchResultsPage(WebDriver driver) { super(driver); }

	public void scrollPageDown() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public void selectPage(String page) {
		WebElement pageElement = driver.findElement(By.xpath("//ul[@class='a-pagination']/li/a[text()='" +page+ "']"));
		pageElement.click();
		Assert.assertTrue(getCurrentUrl().contains("sr_pg_"+page));
	}


}

