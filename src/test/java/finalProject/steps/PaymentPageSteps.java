package finalProject.steps;

import cucumber.api.java.en.And;
import finalProject.models.ProductModel;
import finalProject.pages.PaymentPage;

public class PaymentPageSteps {
    ProductModel productModel = new ProductModel();
    PaymentPage paymentPage = new PaymentPage();

    @And("^Select payment method$")
    public void selectPayment() {
        paymentPage.selectPaymentMethod();

    }

    @And("^Validate product price$")
    public void validateProductPrice() {
        paymentPage.priceAssertion(productModel.getProductPrice());


    }
}
