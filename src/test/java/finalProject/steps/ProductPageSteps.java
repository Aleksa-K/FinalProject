package finalProject.steps;

import cucumber.api.java.en.And;
import finalProject.pages.ProductPage;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage();

    @And("^Add a product to the cart$")
    public void productPageSteps() {
        productPage.addProductToTheCart();


    }

    @And("^Go to the cart$")
    public void goToTheCart() {
        productPage.goToCart();

    }
}
