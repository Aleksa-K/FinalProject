package finalProject.steps;

import cucumber.api.java.en.And;
import finalProject.models.UserModel;
import finalProject.pages.ChekoutPage;

public class CheckoutPageSteps {
    UserModel userModel = new UserModel();
    ChekoutPage chekoutPage = new ChekoutPage();

    @And("^Choose to buy without authorization$")
    public void buyWithoutAuthorization() {
         chekoutPage.enterEmail(userModel.getEmail());
         chekoutPage.pressGo();
    }
}
