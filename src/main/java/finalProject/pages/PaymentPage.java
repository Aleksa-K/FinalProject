package finalProject.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PaymentPage {

    public void selectPaymentMethod() {
        $(By.id("payment_unused_22")).doubleClick();
    }

}
