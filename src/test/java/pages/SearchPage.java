package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.ElementHelper;

import java.util.List;

public class SearchPage {

    By searchPageLogo = By.cssSelector("");
    ElementHelper helper;

    WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }


    public void checkSearchPage(){
        //driver.findElement(searchPageLogo);

        List<WebElement> list = helper.findElements(By.cssSelector(".product-image__image"));
        list.get(1).click();

    }
    public void addToCart(){
        helper.findElement(By.cssSelector(".pd_add_to_cart")).click();
    }


}
