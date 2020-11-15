package finalProject.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class CartPage {

    public void acceptPurchase(){
        $(By.xpath("//input[@class='main-button cart-main-button cart-main-button--large']")).scrollTo().click();
        sleep(3000);
    }
}
