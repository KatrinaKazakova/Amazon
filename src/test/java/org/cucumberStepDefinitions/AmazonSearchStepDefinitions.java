package org.cucumberStepDefinitions;

import org.base.BasePage;
import org.configuration.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class AmazonSearchStepDefinitions extends Setup {

    @Given("^the user navigates to amazon$")
    public void the_user_navigates_to_amazon() throws Throwable {
        driver = initializeDriver();
        hitUrl("https://www.amazon.com");

    }

    @Then("^assert that the item would be available for purchase$")
    public void assert_that_the_item_would_be_available_for_purchase() throws Throwable {

    }

    @And("^Searches for ‘Alexa’$")
    public void searches_for_alexa() throws Throwable {

    }

    @And("^navigates to the second page$")
    public void navigates_to_the_second_page() throws Throwable {

    }

    @And("^selects the third item$")
    public void selects_the_third_item() throws Throwable {

    }


}