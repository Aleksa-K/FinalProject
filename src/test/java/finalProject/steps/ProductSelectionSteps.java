package finalProject.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import finalProject.pages.ProductSelectionPage;

public class ProductSelectionSteps {
    ProductSelectionPage selectionPage = new ProductSelectionPage();


    @And("^Choose a product brand$")
    public void chooseAProductBrand() {
        selectionPage.brandSelection();
    }

    @And("^Choose TOP product$")
    public void chooseTOPProduct() {
        selectionPage.mostPopularProduct();

    }

    @Then("^Select a product and click on it$")
    public void productSelection() {
        selectionPage.selectProduct();

    }


}
