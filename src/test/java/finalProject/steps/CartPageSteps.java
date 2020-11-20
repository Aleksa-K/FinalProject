package finalProject.steps;

import cucumber.api.java.en.And;
import finalProject.models.ProductModel;
import finalProject.pages.CartPage;

public class CartPageSteps {
    ProductModel productModel = new ProductModel();
    CartPage cart = new CartPage();

    @And("^Accept purchase$")
    public void accept() {
        cart.acceptPurchase();


    }

    @And("^Validate product name$")
    public void validateProductName() {
        cart.productNameAssertion(productModel.getProductName());

    }
}
