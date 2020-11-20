package finalProject.steps;

import cucumber.api.java.en.And;
import finalProject.pages.PaymentPage;

public class PaymentPageSteps {

    PaymentPage paymentPage = new PaymentPage();

    @And("^Select payment method$")
    public void selectPayment() {
        paymentPage.selectPaymentMethod();

    }
}
