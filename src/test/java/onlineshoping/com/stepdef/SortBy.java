package onlineshoping.com.stepdef;

import com.google.common.collect.Ordering;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import onlineshoping.com.pageobject.ResultsPage;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortBy {
    private ResultsPage resultsPage=new ResultsPage();


    @And("^I set sort by filter as \"([^\"]*)\"$")
    public void iSetSortByFilterAs(String arg0){
        resultsPage.customerSortedProduct("Price: Low - High");
    }

    @Then("^I should see all the product in sorted order as price$")
    public void iShouldSeeAllTheProductInSortedOrderAs(boolean expected){
        List<Double> actual = resultsPage.getAllSortedProductOnPrice();
        boolean sorted = Ordering.natural().isOrdered(actual);
        assertThat("Price is not sorted. ", sorted, is(equalTo(true)));
    }

}

