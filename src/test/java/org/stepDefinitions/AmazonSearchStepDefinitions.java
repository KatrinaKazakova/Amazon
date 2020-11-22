package org.stepDefinitions;

import org.configuration.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.pageObjects.HeaderPage;
import org.pageObjects.ItemPage;
import org.pageObjects.SearchResultsPage;

public class AmazonSearchStepDefinitions extends Setup {

    @Given("^the user navigates to amazon$")
    public void the_user_navigates_to_amazon()  {
        driver = initializeDriver();
        hitUrl("https://www.amazon.com");
    }

    @Given("^Searches for ‘Alexa’$")
    public void searches_for_Alexa()  {
        HeaderPage h=new HeaderPage(driver);
        h.searchFor("alexa");
    }

    @Given("^navigates to the second page$")
    public void navigates_to_the_second_page()  {
        SearchResultsPage sr= new SearchResultsPage(driver);
        sr.selectPage("2");
    }

    @Given("^selects the third item$")
    public void selects_the_third_item()  {
        SearchResultsPage sr= new SearchResultsPage(driver);
        String product = sr.selectListItem(3);
        ItemPage ip = new ItemPage(driver);
        ip.verifyProductTitle(product);
    }

    @Then("^assert that the item would be available for purchase$")
    public void assert_that_the_item_would_be_available_for_purchase() {
        ItemPage ip = new ItemPage(driver);
        ip.verifyAddtoCartIsEnabled();
    }

    @Then("^close the browser$")
    public void close_the_browser() {
        driver.quit();
    }
}