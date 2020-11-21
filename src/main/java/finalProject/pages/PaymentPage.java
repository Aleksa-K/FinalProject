package finalProject.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.impl.Html;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.source;
import static net.bytebuddy.implementation.FixedValue.value;

public class PaymentPage {


    public void selectPaymentMethod() {
        $(By.id("payment_unused_22")).doubleClick();
        sleep(1000);
    }

    public void priceAssertion(By price) {
        $(By.xpath("//span[@class='checkout-order-summary-total__price']")).shouldHave((Condition) value(price));
    }

    public void validateAPage() {
        Html.text.containsCaseSensitive(source(), "Samaksas informācija - 1a.lv");
    }
}
