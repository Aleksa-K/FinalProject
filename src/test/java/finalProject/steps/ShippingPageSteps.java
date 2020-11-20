package finalProject.steps;

import cucumber.api.java.en.And;
import finalProject.pages.ShippingPage;

public class ShippingPageSteps {
    ShippingPage shippingPage = new ShippingPage();

    @And("^Select shipping method$")
    public void selectShipping() {
        shippingPage.selectShippingMethod();
        shippingPage.pressGoButton();


    }
}
