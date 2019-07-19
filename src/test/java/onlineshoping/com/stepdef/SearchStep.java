package onlineshoping.com.stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import onlineshoping.com.driver.DriverFactory;
import onlineshoping.com.pageobject.HomePage;
import onlineshoping.com.pageobject.ResultsPage;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.is;

public class SearchStep extends DriverFactory {

    private HomePage homePage = new HomePage();
    private ResultsPage resultsPage = new ResultsPage();

    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
        String actual = homePage.getHomePageUrl();
        assertThat("HomePage might be end with something or user on different page. ", actual, Matchers.endsWith("co.uk/"));

    }


    @When("^I Search for a product \"([^\"]*)\"$")
    public void i_Search_for_a_product(String searchItem) {
        homePage.doSearch(searchItem);

    }

    @Then("^I see the respective results$")
    public void i_see_the_respective_results() {
        String actual = homePage.toString();
        // assertThat("you got some different product. ", actual, is(equalToIgnoringWhiteSpace(HomePage.searchProduct)));

    }
}





