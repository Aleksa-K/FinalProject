package finalProject.steps;

import cucumber.api.java.en.And;
import finalProject.pages.CartPage;

public class CartPageSteps {
    CartPage cart = new CartPage();

    @And("^Accept purchase$")
    public void accept() {
        cart.acceptPurchase();


    }
}
