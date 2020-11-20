package finalProject.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class CartPage {

    public void acceptPurchase() {
        $(By.xpath("//input[@name='commit']")).scrollTo().submit();

    }

    public void productNameAssertion(String productName) {
        $(By.xpath("//a[@class='detailed-cart-item__name-link']")).shouldHave(Condition.text(productName));
    }
}
