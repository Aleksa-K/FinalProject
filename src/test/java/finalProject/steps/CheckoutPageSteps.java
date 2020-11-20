package finalProject.steps;

import cucumber.api.java.en.And;
import finalProject.models.UserModel;
import finalProject.pages.CheckoutPage;

public class CheckoutPageSteps {
    UserModel userModel = new UserModel();
    CheckoutPage checkoutPage = new CheckoutPage();

    @And("^Choose to buy without authorization$")
    public void buyWithoutAuthorization() {
        checkoutPage.enterEmail(userModel.getEmail());
        checkoutPage.pressGo();
    }
}
