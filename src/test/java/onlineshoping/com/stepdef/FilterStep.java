package onlineshoping.com.stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import onlineshoping.com.driver.DriverFactory;
import onlineshoping.com.pageobject.ResultsPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FilterStep extends DriverFactory {
private ResultsPage resultsPage=new ResultsPage();
//RATING
    @And("^I select a customer rating as \"([^\"]*)\"$")
    public void iSelectACustomerRatingAs(String userSelectedReview) {
        resultsPage.selectARating(userSelectedReview);
    }

    @Then("^I should see all the product filtered rating$")
    public void iShouldSeeAllTheProductFilteredRating() {
        List<Double> actualList = resultsPage.getAllRatingsOnFilteredProduct();
        assertThat("List is storing wrong value or filter broken. ", actualList, everyItem(greaterThanOrEqualTo(4.0)));
    }

//PRICE
    @And("^I select a customer price as \"([^\"]*)\"$")
    public void iSelectACustomerPriceAs(String userSelectedPrice) {
        resultsPage.selectCustomerPrice(userSelectedPrice);

    }
    @Then("^I should see all the product filtered price$")
    public void iShouldSeeAllTheProductFilteredPrice() {
        List<Double> actualList=resultsPage.getAllPricesOnFilterProduct();
        assertThat("List is sorting wrong value .",actualList,everyItem(greaterThanOrEqualTo(15.00)));
        assertThat("List is sorting wrong value.",actualList,everyItem(lessThanOrEqualTo(20.0)));
    }





//CATEGORY
    @And("^I select a customer category as \"([^\"]*)\"$")
    public void iSelectACustomerCategoryAs(String arg0) {



    }

    @Then("^I should see all the product filtered category$")
    public void iShouldSeeAllTheProductFilteredCategory() {
    }
}

