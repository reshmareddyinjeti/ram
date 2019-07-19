package onlineshoping.com.pageobject;

import onlineshoping.com.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends DriverFactory {
    @FindBy(css=".ac-icon__account")
    private WebElement accountIcon;

    @FindBy (name="emailAddress")
    private WebElement email;

    @FindBy(id="title")
    private  WebElement title;

    @FindBy(id="first-name")
    private  WebElement firstName;

    @FindBy(id="last-name")
    private WebElement lastName;

    @FindBy(id="postcode")
    private WebElement postCode;

    @FindBy(name="currentPassword")
    private  WebElement password;

    @FindBy(className="sign-in-form")
    private WebElement signin;

    public void createAccount( String Email,String Title,String First_Name , String Last ,String Post_code) {
        accountIcon.click();
        email.sendKeys(Email);
        title.sendKeys(Title);
        firstName.sendKeys(First_Name);
        lastName.sendKeys(Last);
        postCode.sendKeys(Post_code);
        signin.click();

    }

}
