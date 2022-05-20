package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchPage;
import pages.SearchProduct;
import util.ElementHelper;

public class SearchNewProductSteps {
    WebDriver driver;

   SearchProduct searchProduct = new SearchProduct(driver);
    @Given("Website is opened")
    public void website_is_opened() {
        searchProduct.checkLogo();
    }

    @When("Writing to search bar {string}")
    public void writing_to_search_bar(String string) {
        searchProduct.setSearchBox(string);
    }

    @When("Click on Search Button")
    public void click_on_search_button() {
        searchProduct.clickSearchButton();
    }

    @Then("Checking out whether page is loaded")
    public void checking_out_whether_page_is_loaded() {
        searchProduct.checkSearchPage();
    }

    @Then("Click first product")
    public void click_first_product() {
        searchProduct.checkSearchPage();
    }

    @Then("Add to cart")
    public void add_to_cart() {
        searchProduct.addToCart();
    }
}
