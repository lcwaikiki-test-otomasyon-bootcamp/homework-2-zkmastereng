package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.ElementHelper;

import java.util.List;

public class SearchProduct {
    By logo = By.cssSelector("a.main-header-logo");
    By searchBox = By.id("search-form__input-field__search-input");
    By searchButton = By.cssSelector(".search-form__input-field__btn-search.false");
    WebDriver driver;
    ElementHelper helper;

    public SearchProduct(WebDriver driver){
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkLogo() {helper.checkElementVisible(logo);}

    public void setSearchBox(String product) {helper.sendKey(searchBox, product);}

    public void clickSearchButton() {helper.click(searchButton);}

    public void checkSearchPage(){
        //driver.findElement(searchPageLogo);

        List<WebElement> list = helper.findElements(By.cssSelector(".product-image__image"));
        list.get(1).click();

    }
    public void addToCart(){
        helper.findElement(By.cssSelector(".pd_add_to_cart")).click();
    }

}
