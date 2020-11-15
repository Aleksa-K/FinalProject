package finalProject.steps;

import cucumber.api.java.en.Then;
import finalProject.pages.ProductSelectionPage;

public class ProductSelectionSteps {
    ProductSelectionPage selectionPage = new ProductSelectionPage();

    @Then("^Select a product and click on it$")
    public void productSelection() {
        selectionPage.scrollToProduct();
        selectionPage.selectProduct();
    }
}
