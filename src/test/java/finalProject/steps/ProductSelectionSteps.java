package finalProject.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import finalProject.models.ProductModel;
import finalProject.pages.ProductSelectionPage;

public class ProductSelectionSteps {
    ProductModel productModel = new ProductModel();
    ProductSelectionPage selectionPage = new ProductSelectionPage();


    @When("^Choose a product brand$")
    public void chooseAProductBrand() {
        selectionPage.brandSelection();
    }

    @Then("^Choose TOP product$")
    public void chooseTOPProduct() {
        selectionPage.mostPopularProduct();

    }

    @And("^Select a product and click on it$")
    public void productSelection() {
        selectionPage.selectProduct(productModel.getProductName());

    }


}
