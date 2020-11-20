package finalProject.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class PaymentPage {

    public void selectPaymentMethod() {
        $(By.id("payment_unused_22")).doubleClick();
        sleep(1000);
    }

    public void priceAssertion(String productPrice) {
        $(By.xpath("//span[@class='checkout-order-summary-total__price']")).shouldHave(Condition.matchesText(productPrice));
    }
}
