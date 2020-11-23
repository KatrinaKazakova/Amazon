package org.stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.configuration.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.pageObjects.HeaderPage;
import org.pageObjects.ItemPage;
import org.pageObjects.SearchResultsPage;

public class AmazonSearchStepDefinitions extends Setup {
    HeaderPage h;
    SearchResultsPage sr;
    ItemPage ip;

    @Before
    public void beforeScenario() {
        driver = initializeDriver();
    }

    @Given("^the user navigates to amazon$")
    public void the_user_navigates_to_amazon()  {
        hitUrl("https://www.amazon.com");
    }

    @Given("^Searches for ‘Alexa’$")
    public void searches_for_Alexa()  {
        h=new HeaderPage(driver);
        h.searchFor("alexa");
    }

    @Given("^navigates to the second page$")
    public void navigates_to_the_second_page()  {
        sr= new SearchResultsPage(driver);
        sr.selectPage("2");
    }

    @Given("^selects the third item$")
    public void selects_the_third_item()  {
        sr= new SearchResultsPage(driver);
        String product = sr.selectListItem(3);
        ip = new ItemPage(driver);
        ip.verifyProductTitle(product);
    }

    @Then("^assert that the item would be available for purchase$")
    public void assert_that_the_item_would_be_available_for_purchase() {
        ip = new ItemPage(driver);
        ip.verifyAddtoCartIsEnabled();
    }

    @After
    public void afterScenario() {
        driver.quit();
    }
}