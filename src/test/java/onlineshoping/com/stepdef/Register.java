package onlineshoping.com.stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import onlineshoping.com.driver.DriverFactory;
import onlineshoping.com.pageobject.RegisterPage;

public class Register extends DriverFactory {
private RegisterPage registerPage=new RegisterPage();
    @When("^I navigate to register page$")
    public void iNavigateToRegisterPage() {
       //
        // registerPage.createAccount();

    }

    @And("^I fill the user registration for:$")
    public void iFillTheUserRegistrationFor( ) {

    }
}


