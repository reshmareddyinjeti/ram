package onlineshoping.com.pageobject;

import onlineshoping.com.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class ResultsPage extends DriverFactory {

    public static String expectedCustomerRating;
    @FindBy(css = ".ac-accordion.ac-facet__label--rating")
    private List<WebElement> customerRatings;

    @FindBy(css = ".ac-star-rating")
    private List<WebElement> ratingWedelementAttridutes;

    public void selectARating(String customerSelectedRating) {
        for (WebElement ratingWebElement : customerRatings) {
            if (ratingWebElement.getText().equalsIgnoreCase(customerSelectedRating)) {
                new WebDriverWait(driver, 20)
                        .until(ExpectedConditions.elementToBeClickable(ratingWebElement));
                ratingWebElement.click();
                break;

            }
        }
    }

    public List<Double> getAllRatingsOnFilteredProduct() {

        List<Double> collectedRating = new ArrayList<>();
        for (WebElement ratingWedelement : ratingWedelementAttridutes) {
            String ratingInSting = ratingWedelement.getAttribute("data-star-rating");
            double ratingInDouble = Double.parseDouble(ratingInSting);
            // System.out.println("Collected rating :"+collectedRating);
            collectedRating.add(ratingInDouble);

        }
        return collectedRating;
    }
    //Price Test

    public static String expectedCustomerPrice;
    @FindBy(css = ".ac-facet__filters .ac-facet__label--default")
    private List<WebElement> customerPrices;

    @FindBy(css = ".ac-product-price__amount")
    private List<WebElement> priceWebelementsetText;

    public void selectCustomerPrice(String customerSelectedPrice) {
        //  List<WebElement> priceWebElements = driver.findElements(By.cssSelector(".ac-facet__filters .ac-facet__label--default"));
        for (WebElement priceWebelement : customerPrices) {
            if (priceWebelement.getText().equalsIgnoreCase(customerSelectedPrice)) {
                new WebDriverWait(driver, 20)
                        .until(ExpectedConditions.elementToBeClickable(priceWebelement));
                priceWebelement.click();
                break;
            }
        }
    }

    public List<Double> getAllPricesOnFilterProduct() {
        // try {
        //     Thread.sleep(3000);
        //  } catch (InterruptedException e) {
        //      e.printStackTrace();
        //  }

        List<Double> collectedPrice = new ArrayList<>();
        //List<WebElement> priceWebelements = driver.findElements(By.cssSelector(".ac-product-price__amount"));
        for (WebElement priceWebelement : priceWebelementsetText) {
            String priceInString = priceWebelement.getText().replace("£", "");
            double priceInDouble = Double.parseDouble(priceInString);
            //  System.out.println("collected Price :" + collectedPrice);
            collectedPrice.add(priceInDouble);
        }
        return collectedPrice;



    }
    public void customerSortedProduct(String customerSelectedpSort){
        Select select=new Select(driver.findElement(By.cssSelector(".sort-select")));
        select.selectByVisibleText(customerSelectedpSort);


    }
    public List<Double> getAllSortedProductOnPrice(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Double> collectedSort=new ArrayList<>();
        List<WebElement> sortByWebelements=driver.findElements(By.cssSelector(".ac-product-price__amount"));
        for (WebElement sortByWebElement:sortByWebelements){
            String sortInString=sortByWebElement.getText();
            double sortInDouble=Double.parseDouble(sortInString);
            System.out.println(collectedSort);
            collectedSort.add(sortInDouble);
        }return  collectedSort;

    }


    public String getProductHeader () {
                return driver.findElement(By.cssSelector(".search-title__term")).getText();
            }


        }



