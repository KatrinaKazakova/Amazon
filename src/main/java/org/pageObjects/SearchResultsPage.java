package org.pageObjects;

import org.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

	public String selectListItem(int item) {
		int itemIndex = item-1;
		WebElement listItem = driver.findElement(By.xpath("//div[@data-index='" +itemIndex+"']"));
		WebElement itemLink = listItem.findElement(By.xpath("div/span/div/div/div/div[2]/div/div[1]"));
		String product = itemLink.getText();
		waitForVisibilityOfElement(itemLink);
		itemLink.click();
		return product;
	}
}

